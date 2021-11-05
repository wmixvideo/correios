package com.github.wmixvideo.correios;

import br.com.correios.webservice.calculador.CResultado;
import br.com.correios.webservice.calculador.CServico;
import br.com.correios.webservice.calculador.CalcPrecoPrazoWS;
import br.com.correios.webservice.calculador.CalcPrecoPrazoWSSoap;
import jakarta.xml.ws.BindingProvider;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class WSCorreiosCalculador {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private CalcPrecoPrazoWSSoap calculadora;
    private int timeoutMilliseconds = 15000;
    private final String usuario;
    private final String senha;

    public WSCorreiosCalculador() {
        this.calculadora = null;
        this.usuario = null;
        this.senha = null;
    }

    public WSCorreiosCalculador(final String usuario, final String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public WSCorreiosCalculador setTimeout(final int milliseconds) {
        this.timeoutMilliseconds = milliseconds;
        return this;
    }

    private CalcPrecoPrazoWSSoap getCalculadora() {
        System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(this.timeoutMilliseconds));
        if (this.calculadora == null) {
            this.calculadora = new CalcPrecoPrazoWS().getCalcPrecoPrazoWSSoap();
        }
        final Map<String, Object> requestContext = ((BindingProvider) this.calculadora).getRequestContext();
        requestContext.put("com.sun.xml.internal.ws.connect.timeout", timeoutMilliseconds);
        requestContext.put("com.sun.xml.internal.ws.request.timeout", timeoutMilliseconds);
        return this.calculadora;
    }

    /**
     * Calcula o prazo de envio.
     *
     * @param servico   tipo de serviço.
     * @param origem    cep origem.
     * @param destino   cep destino.
     * @param dataEnvio data de envio.
     * @return CServico.
     */
    public final Optional<CServico> calculaPrazoData(final String servico, final String origem, final String destino, final LocalDate dataEnvio) {
        final CResultado retornoCorreios = dataEnvio == null ? this.getCalculadora().calcPrazo(servico, origem, destino) : this.getCalculadora().calcPrazoData(servico, origem, destino, dataEnvio.format(DATE_TIME_FORMATTER));
        final List<CServico> servicos = retornoCorreios.getServicos().getCServico();
        return servicos.isEmpty() ? Optional.empty() : Optional.of(servicos.get(0));
    }

    /**
     * Calcula o prazo de envio.
     *
     * @param servico tipo de serviço.
     * @param origem  cep origem.
     * @param destino cep destino.
     * @return CServico.
     */
    public final Optional<CServico> calculaPrazo(final String servico, final String origem, final String destino) {
        return calculaPrazoData(servico, origem, destino, null);
    }

    public final BigDecimal calculaPreco(final String servico, final String origem, final String destino) {
        final CResultado retornoCorreios = getCalculadora().calcPreco(this.usuario, this.senha, servico, origem, destino, null, 0, null, null, null, null, null, null, null);
        final List<CServico> servicos = retornoCorreios.getServicos().getCServico();
        return servicos.isEmpty() ? null : new BigDecimal(servicos.get(0).getValor());
    }

    public final List<CServico> calculaPrecoPrazo(final List<String> servicos, final String origem, final String destino, final BigDecimal pesoEmKg, final Formato formato, final BigDecimal comprimentoEmCm, final BigDecimal alturaEmCm, final BigDecimal larguraEmCm, final BigDecimal diametroEmCm, final Opcao maoPropria, final BigDecimal valorDeclarado, final Opcao avisoRecebimento) {
        String peso = new DecimalFormat("0.##").format(pesoEmKg);
        String servico = String.join(",", servicos);

        final CResultado retornoCorreios = getCalculadora().calcPrecoPrazo(this.usuario, this.senha, servico, origem, destino, peso, formato.getCodigo(), comprimentoEmCm, alturaEmCm, larguraEmCm, diametroEmCm, maoPropria.getOpcao(), valorDeclarado, avisoRecebimento.getOpcao());
        return retornoCorreios.getServicos().getCServico();
    }
}

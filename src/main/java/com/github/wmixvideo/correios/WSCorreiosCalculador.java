package com.github.wmixvideo.correios;

import br.com.correios.webservice.calculador.CResultado;
import br.com.correios.webservice.calculador.CServico;
import br.com.correios.webservice.calculador.CalcPrecoPrazoWS;
import br.com.correios.webservice.calculador.CalcPrecoPrazoWSSoap;

import javax.xml.ws.BindingProvider;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class WSCorreiosCalculador {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final CalcPrecoPrazoWSSoap calculadora;
    private String usuario, senha;

    public WSCorreiosCalculador() {
        this.calculadora = new CalcPrecoPrazoWS().getCalcPrecoPrazoWSSoap();
        this.usuario = null;
        this.senha = null;
    }

    public WSCorreiosCalculador(final String usuario, final String senha) {
        this();
        this.usuario = usuario;
        this.senha = senha;
    }

    public WSCorreiosCalculador setTimeout(final int milliseconds) {
        final Map<String, Object> requestContext = ((BindingProvider) this.calculadora).getRequestContext();
        requestContext.put("com.sun.xml.internal.ws.connect.timeout", milliseconds);
        requestContext.put("com.sun.xml.internal.ws.request.timeout", milliseconds);
        return this;
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
        final CResultado retornoCorreios = dataEnvio == null ? this.calculadora.calcPrazo(servico, origem, destino) : this.calculadora.calcPrazoData(servico, origem, destino, dataEnvio.format(DATE_TIME_FORMATTER));
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
        final CResultado retornoCorreios = calculadora.calcPreco(this.usuario, this.senha, servico, origem, destino, null, 0, null, null, null, null, null, null, null);
        final List<CServico> servicos = retornoCorreios.getServicos().getCServico();
        return servicos.isEmpty() ? null : new BigDecimal(servicos.get(0).getValor());
    }

    public final List<CServico> calculaPrecoPrazo(final List<String> servicos, final String origem, final String destino, final BigDecimal pesoEmKg, final Formato formato, final BigDecimal comprimentoEmCm, final BigDecimal alturaEmCm, final BigDecimal larguraEmCm, final BigDecimal diametroEmCm, final Opcao maoPropria, final BigDecimal valorDeclarado, final Opcao avisoRecebimento) {
        String peso = new DecimalFormat("0.##").format(pesoEmKg);
        String servico = String.join(",", servicos);

        final CResultado retornoCorreios = calculadora.calcPrecoPrazo(this.usuario, this.senha, servico, origem, destino, peso, formato.getCodigo(), comprimentoEmCm, alturaEmCm, larguraEmCm, diametroEmCm, maoPropria.getOpcao(), valorDeclarado, avisoRecebimento.getOpcao());
        return retornoCorreios.getServicos().getCServico();
    }
}

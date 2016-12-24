package com.github.wmixvideo.correios;

import br.com.correios.webservice.calculador.CResultado;
import br.com.correios.webservice.calculador.CServico;
import br.com.correios.webservice.calculador.CalcPrecoPrazoWS;
import br.com.correios.webservice.calculador.CalcPrecoPrazoWSSoap;

import javax.swing.text.html.Option;
import javax.xml.ws.BindingProvider;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

public class WSCorreiosCalculador {

    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

    private final CalcPrecoPrazoWSSoap calculadora;
    private final String usuario;
    private final String senha;

    public WSCorreiosCalculador() {
        this.calculadora = new CalcPrecoPrazoWS().getCalcPrecoPrazoWSSoap();
        this.usuario = null;
        this.senha = null;
        String CONNECT_TIMEOUT = "com.sun.xml.internal.ws.connect.timeout";  //JAXWSProperties.CONNECT_TIMEOUT
        String REQUEST_TIMEOUT = "com.sun.xml.internal.ws.request.timeout"; //JAXWSProperties.REQUEST_TIMEOUT
        ((BindingProvider)this.calculadora).getRequestContext().put(CONNECT_TIMEOUT, 3000);
        ((BindingProvider)this.calculadora).getRequestContext().put(REQUEST_TIMEOUT, 3000);

    }

    public WSCorreiosCalculador(final String usuario, final String senha) {
        this.calculadora = new CalcPrecoPrazoWS().getCalcPrecoPrazoWSSoap();
        this.usuario = usuario;
        this.senha = senha;
    }

    /**
     * Calcula o prazo de envio.
     * @param servico tipo de serviço.
     * @param origem cep origem.
     * @param destino cep destino.
     * @param data data de envio.
     * @return CServico.
     */
    public final Optional<CServico> calculaPrazoData(final String servico, final String origem, final String destino, final Calendar data) {
        final CResultado retornoCorreios;

        String formatedDate = null;
        if (data != null ){
            formatedDate = sd.format(data.getTime());
            retornoCorreios = calculadora.calcPrazoData(servico, origem, destino, formatedDate);
        } else {
            retornoCorreios = calculadora.calcPrazo(servico, origem, destino);
        }

        final List<CServico> servicos = retornoCorreios.getServicos().getCServico();
        return servicos.isEmpty() ? Optional.empty() : Optional.of(servicos.get(0));
    }

    /**
     * Calcula o prazo de envio.
     * @param servico tipo de serviço.
     * @param origem cep origem.
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

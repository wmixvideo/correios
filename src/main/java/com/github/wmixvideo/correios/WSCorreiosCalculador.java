package com.github.wmixvideo.correios;

import br.com.correios.webservice.calculador.CResultado;
import br.com.correios.webservice.calculador.CServico;
import br.com.correios.webservice.calculador.CalcPrecoPrazoWS;
import br.com.correios.webservice.calculador.CalcPrecoPrazoWSSoap;

import java.math.BigDecimal;
import java.util.List;

public class WSCorreiosCalculador {

    private final CalcPrecoPrazoWSSoap calculadora;
    private final String usuario;
    private final String senha;

    public WSCorreiosCalculador() {
        this.calculadora = new CalcPrecoPrazoWS().getCalcPrecoPrazoWSSoap();
        this.usuario = null;
        this.senha = null;
    }

    public WSCorreiosCalculador(final String usuario, final String senha) {
        this.calculadora = new CalcPrecoPrazoWS().getCalcPrecoPrazoWSSoap();
        this.usuario = usuario;
        this.senha = senha;
    }

    public final int calculaPrazo(final String servico, final String origem, final String destino) {
        final CResultado retornoCorreios = calculadora.calcPrazo(servico, origem, destino);
        final List<CServico> servicos = retornoCorreios.getServicos().getCServico();
        return servicos.isEmpty() ? 0 : Integer.parseInt(servicos.get(0).getPrazoEntrega());
    }

    public final BigDecimal calculaPreco(final String servico, final String origem, final String destino) {
        final CResultado retornoCorreios = calculadora.calcPreco(this.usuario, this.senha, servico, origem, destino, null, 0, null, null, null, null, null, null, null);
        final List<CServico> servicos = retornoCorreios.getServicos().getCServico();
        return servicos.isEmpty() ? null : new BigDecimal(servicos.get(0).getValor());
    }
}

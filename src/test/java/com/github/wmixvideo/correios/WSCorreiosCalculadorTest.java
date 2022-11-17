package com.github.wmixvideo.correios;

import br.com.correios.webservice.calculador.CServico;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class WSCorreiosCalculadorTest {

    private final WSCorreiosCalculador ws = new WSCorreiosCalculador();

    @Test
    public void calculaPrazoEntregaSedexMondai() {
        final CServico servico = ws.calculaPrazo("04162", "88101250", "89893000").orElse(null);
        Assert.assertNotNull(servico);
        Assert.assertTrue(servico.getErro().isEmpty());
        Assert.assertTrue(servico.getMsgErro().isEmpty());
        Assert.assertTrue(Integer.parseInt(servico.getPrazoEntrega()) > 1);
    }

    @Test
    public void calculaPrazoEntregaPacMondai() {
        final CServico servico = ws.calculaPrazo("04669", "88101250", "89893000").orElse(null);
        Assert.assertNotNull(servico);
        Assert.assertTrue(servico.getErro().isEmpty());
        Assert.assertTrue(servico.getMsgErro().isEmpty());
        Assert.assertTrue(Integer.parseInt(servico.getPrazoEntrega()) > 1);
    }

    @Test
    public void calculaPrazoEntregaPacComData() {
        final CServico servico = ws.calculaPrazoData("04669", "88101250", "89893000", LocalDate.now()).orElse(null);
        Assert.assertNotNull(servico);
        Assert.assertTrue(servico.getErro().isEmpty());
        Assert.assertTrue(servico.getMsgErro().isEmpty());
        Assert.assertTrue(Integer.parseInt(servico.getPrazoEntrega()) > 1);
    }

//    @Test
//    public void calculaPrecoEntrega() {
//        final BigDecimal preco = ws.calculaPreco("40010", "88101250", "89893000");
//        Assert.assertNotNull(preco);
//        Assert.assertEquals(1, preco.signum());
//    }

    @Test
    public void calculaPrecosEPrazos() {
        final CServico servico = ws.calculaPrecoPrazo("40010", "88101250", "89893000", BigDecimal.valueOf(1.5), Formato.CAIXA, BigDecimal.valueOf(25), BigDecimal.valueOf(25), BigDecimal.valueOf(25), null, Opcao.NAO, BigDecimal.valueOf(25), Opcao.NAO);
        Assert.assertNotNull(servico);
        Assert.assertTrue(servico.getErro().isEmpty() || servico.getErro().equals("0"));
        Assert.assertTrue(servico.getMsgErro().isEmpty());
    }

    @Test
    public void calculaPrecosEPrazosCepIncompleto() {
        final CServico servico = ws.calculaPrecoPrazo("40010", "881012", "898930", BigDecimal.valueOf(1.5), Formato.CAIXA, BigDecimal.valueOf(25), BigDecimal.valueOf(25), BigDecimal.valueOf(25), null, Opcao.NAO, BigDecimal.valueOf(25), Opcao.NAO);
        Assert.assertNotNull(servico);
        Assert.assertFalse(servico.getMsgErro().isEmpty());
    }

    @Test
    public void calculaPrecosEPrazosTamanhoMaior() {
        final CServico servico = ws.calculaPrecoPrazo("40010", "88101250", "89893000", BigDecimal.valueOf(1.5), Formato.CAIXA, BigDecimal.valueOf(180), BigDecimal.valueOf(180), BigDecimal.valueOf(180), null, Opcao.NAO, BigDecimal.valueOf(50), Opcao.NAO);
        Assert.assertNotNull(servico);
        Assert.assertFalse(servico.getMsgErro().isEmpty());
    }    

}
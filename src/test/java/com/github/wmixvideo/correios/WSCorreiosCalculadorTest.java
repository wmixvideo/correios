package com.github.wmixvideo.correios;

import br.com.correios.webservice.calculador.CServico;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class WSCorreiosCalculadorTest {

    private final WSCorreiosCalculador ws = new WSCorreiosCalculador();

    @Test
    public void calculaPrazoEntregaSedexMondai() {
        final CServico servico = ws.calculaPrazo("04162", "88101250", "89893000").get();
        Assert.assertTrue(servico.getErro().isEmpty());
        Assert.assertTrue(servico.getMsgErro().isEmpty());
        Assert.assertTrue(Integer.parseInt(servico.getPrazoEntrega()) > 1);
    }

    @Test
    public void calculaPrazoEntregaPacMondai() {
        final CServico servico = ws.calculaPrazo("04669", "88101250", "89893000").get();
        Assert.assertTrue(servico.getErro().isEmpty());
        Assert.assertTrue(servico.getMsgErro().isEmpty());
        Assert.assertTrue(Integer.parseInt(servico.getPrazoEntrega()) > 1);
    }

    @Test
    public void calculaPrazoEntregaPacComData() {
        final CServico servico = ws.calculaPrazoData("04669", "88101250", "89893000", LocalDate.now()).get();
        Assert.assertTrue(servico.getErro().isEmpty());
        Assert.assertTrue(servico.getMsgErro().isEmpty());
        Assert.assertTrue(Integer.parseInt(servico.getPrazoEntrega()) > 1);
    }

    @Test
    public void calculaPrecosEPrazos() {
        final List<CServico> servicos = ws.calculaPrecoPrazo(Arrays.asList("40010", "40215", "40290", "41106"), "88101250", "89893000", BigDecimal.valueOf(1.5), Formato.CAIXA, BigDecimal.valueOf(25), BigDecimal.valueOf(25), BigDecimal.valueOf(25), null, Opcao.NAO, BigDecimal.valueOf(25), Opcao.NAO);
        Assert.assertTrue(servicos.stream().allMatch(s -> s.getErro().isEmpty()));
        Assert.assertTrue(servicos.stream().allMatch(s -> s.getMsgErro().isEmpty()));
        Assert.assertTrue(servicos.size() >= 1 && servicos.size() <= 5);
    }
}
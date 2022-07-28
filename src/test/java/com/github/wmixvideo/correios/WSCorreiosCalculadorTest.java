package com.github.wmixvideo.correios;

import br.com.correios.webservice.calculador.CServico;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class WSCorreiosCalculadorTest {

    @Test
    public void calculaPrazoEntregaSedexMondai() {
        final String prazoEntrega = new WSCorreiosCalculador()
                .calculaPrazo("04162", "88101250", "89893000")
                .get()
                .getPrazoEntrega();

        Assert.assertTrue(Integer.parseInt(prazoEntrega) > 1);
    }

    @Test
    public void calculaPrazoEntregaPacMondai() {
        final String prazoEntrega = new WSCorreiosCalculador()
                .calculaPrazo("04669", "88101250", "89893000")
                .get()
                .getPrazoEntrega();

        Assert.assertTrue(Integer.parseInt(prazoEntrega) > 1);
    }

    @Test
    public void calculaPrazoEntregaPacComData() {
        final String prazoEntrega = new WSCorreiosCalculador()
                .calculaPrazoData("04669", "88101250", "89893000", LocalDate.now())
                .get()
                .getPrazoEntrega();

        Assert.assertTrue(Integer.parseInt(prazoEntrega) > 1);
    }

    @Test
    public void calculaPrecosEPrazos() {
        final List<CServico> servicos = new WSCorreiosCalculador().calculaPrecoPrazo(Arrays.asList("40010", "40215", "40290", "41106"), "88101250", "89893000", BigDecimal.valueOf(1.5), Formato.CAIXA, BigDecimal.valueOf(25), BigDecimal.valueOf(25), BigDecimal.valueOf(25), null, Opcao.NAO, BigDecimal.valueOf(25), Opcao.NAO);
        final int servicosDisponiveis = servicos.size();
        Assert.assertTrue(servicosDisponiveis >= 1 && servicosDisponiveis <= 5);
    }
}
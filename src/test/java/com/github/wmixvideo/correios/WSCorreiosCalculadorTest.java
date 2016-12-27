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
    public void calculaPrazoEntregaSedexMondai() throws IOException {
        final String prazoEntrega = new WSCorreiosCalculador()
                .setTimeout(3000)
                .calculaPrazo("40010", "88101250", "89893000")
                .get().getPrazoEntrega();
        Assert.assertTrue(Integer.valueOf(prazoEntrega) > 1);
    }

    @Test
    public void calculaPrazoEntregaPacMondai() throws IOException {
        final String prazoEntrega = new WSCorreiosCalculador()
                .setTimeout(3000)
                .calculaPrazo("41106", "88101250", "89893000")
                .get().getPrazoEntrega();
        Assert.assertTrue(Integer.valueOf(prazoEntrega) > 1);
    }

    @Test
    public void calculaPrazoEntregaPacComData() throws IOException {
        final String prazoEntrega = new WSCorreiosCalculador()
                .setTimeout(3000)
                .calculaPrazoData("41106", "88101250", "89893000", LocalDate.now())
                .get().getPrazoEntrega();
        Assert.assertTrue(Integer.valueOf(prazoEntrega) > 1);
    }

    @Test
    public void calculaPrecosEPrazos() throws IOException {
        final List<CServico> servicos = new WSCorreiosCalculador().calculaPrecoPrazo(Arrays.asList("40010", "40215", "40290", "41106"), "88101250", "89893000", BigDecimal.valueOf(1.5), Formato.CAIXA, BigDecimal.valueOf(25), BigDecimal.valueOf(25), BigDecimal.valueOf(25), null, Opcao.NAO, BigDecimal.valueOf(25), Opcao.NAO);
        Assert.assertEquals(4, servicos.size());
    }
}
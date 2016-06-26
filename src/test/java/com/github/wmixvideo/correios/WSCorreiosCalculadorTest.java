package com.github.wmixvideo.correios;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class WSCorreiosCalculadorTest {

    @Test
    public void calculaPrazoEntregaSedexMondai() throws IOException {
        Assert.assertEquals(2, new WSCorreiosCalculador().calculaPrazo("40010", "88101250", "89893000"));
    }

    @Test
    public void calculaPrazoEntregaPacMondai() throws IOException {
        Assert.assertEquals(5, new WSCorreiosCalculador().calculaPrazo("41106", "88101250", "89893000"));
    }
}
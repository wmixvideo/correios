//package com.github.wmixvideo.correios;
//
//import br.com.correios.webservice.rastro.Sroxml;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.Arrays;
//import java.util.Collections;
//
//public class WSCorreiosRastreadorTest {
//
//    private final WSCorreiosRastreador ws = new WSCorreiosRastreador("USUARIO", "SENHA");
//
//    @Test
//    public void consultaObjeto() {
//        Assert.assertNotNull(ws.consultaObjeto("PJ907948743BR"));
//    }
//
//    @Test
//    public void consultaObjetos() {
//        Assert.assertNotNull(ws.consultaObjetos(Arrays.asList("PJ907948743BR", "PJ907948743BR")));
//    }
//
//    @Test
//    public void consultaObjetoWmix() {
//        final Sroxml retorno = ws.consultaObjetos(Collections.singletonList("DW937249555BR"));
//        Assert.assertNotNull(retorno);
//        Assert.assertFalse(retorno.getObjeto().isEmpty());
//    }
//}
package com.github.wmixvideo.correios;

import br.com.correios.webservice.rastro.Objeto;
import br.com.correios.webservice.rastro.Sroxml;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class WSCorreiosRastreadorTest {

    private final WSCorreiosRastreador WS = new WSCorreiosRastreador("USUARIO", "SENHA");

    @Test
    public void consultaObjeto() throws Exception {
        Assert.assertNotNull(WS.consultaObjeto("PJ907948743BR"));
    }

    @Test
    public void consultaObjetos() throws Exception {
        Assert.assertNotNull(WS.consultaObjetos(Arrays.asList("PJ907948743BR", "PJ907948743BR")));
    }

    @Test
    public void consultaObjetoWmix() throws Exception {
        final Sroxml retorno = WS.consultaObjetos(Collections.singletonList("DW937249555BR"));
        Assert.assertNotNull(retorno);
        Assert.assertFalse(retorno.getObjeto().isEmpty());
        //for (Objeto objeto : retorno.getObjeto()) {
            //objeto.getEvento().forEach(e-> System.err.println(e.getDescricao()));
            //Assert.assertFalse(objeto.getEvento().isEmpty());
        //}
    }
}
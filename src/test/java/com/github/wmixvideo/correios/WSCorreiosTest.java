package com.github.wmixvideo.correios;

import br.com.correios.webservice.resource.Eventos;
import br.com.correios.webservice.resource.Objeto;
import br.com.correios.webservice.resource.Sroxml;
import org.junit.Test;

public class WSCorreiosTest {

    @Test
    public void consultaObjetos() throws Exception {
        final WSCorreios ws = new WSCorreios("USUARIO", "SENHA");
        final Sroxml sro = ws.consultaObjeto("PJ907948743BR");
        for (Objeto objeto : sro.getObjeto()) {
            System.out.println(objeto.getNome());
            System.err.println(objeto.getErro());
            for (Eventos evento : objeto.getEvento()) {
                System.out.println(evento.getDescricao());
            }
        }
    }
}
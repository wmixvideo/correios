package com.github.wmixvideo.correios;

import br.com.correios.webservice.rastro.Rastro;
import br.com.correios.webservice.rastro.Service;
import br.com.correios.webservice.rastro.Sroxml;

import javax.xml.ws.BindingProvider;
import java.util.Collection;

public class WSCorreiosRastreador {

    private static final String TIPO = "L";//todos
    private static final String RESULTADO = "T";//todos
    private static final String LINGUA = "101";//portugues

    private final Service service;
    private final String usuario;
    private final String senha;


    public WSCorreiosRastreador(final String usuario, final String senha) {
        this.service = new Rastro().getServicePort();
        this.usuario = usuario;
        this.senha = senha;
        String CONNECT_TIMEOUT = "com.sun.xml.internal.ws.connect.timeout";  //JAXWSProperties.CONNECT_TIMEOUT
        String REQUEST_TIMEOUT = "com.sun.xml.internal.ws.request.timeout"; //JAXWSProperties.REQUEST_TIMEOUT
        ((BindingProvider)this.service).getRequestContext().put(CONNECT_TIMEOUT, 3000);
        ((BindingProvider)this.service).getRequestContext().put(REQUEST_TIMEOUT, 3000);
    }

    public Sroxml consultaObjeto(final String objeto) {
        return this.service.buscaEventos(this.usuario, this.senha, TIPO, RESULTADO, LINGUA, objeto);
    }

    public Sroxml consultaObjetos(final Collection<String> objetos) {
        return this.service.buscaEventos(this.usuario, this.senha, TIPO, RESULTADO, LINGUA, String.join("", objetos));
    }
}

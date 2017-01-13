package com.github.wmixvideo.correios;

import br.com.correios.webservice.rastro.Rastro;
import br.com.correios.webservice.rastro.Service;
import br.com.correios.webservice.rastro.Sroxml;

import javax.xml.ws.BindingProvider;
import java.util.Collection;
import java.util.Map;

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
    }

    public WSCorreiosRastreador setTimeout(final int milliseconds) {
        final Map<String, Object> requestContext = ((BindingProvider) this.service).getRequestContext();
        requestContext.put("com.sun.xml.internal.ws.connect.timeout", milliseconds);
        requestContext.put("com.sun.xml.internal.ws.request.timeout", milliseconds);
        return this;
    }

    public Sroxml consultaObjeto(final String objeto) {
        return this.service.buscaEventos(this.usuario, this.senha, TIPO, RESULTADO, LINGUA, objeto);
    }

    public Sroxml consultaObjetos(final Collection<String> objetos) {
        return this.service.buscaEventos(this.usuario, this.senha, TIPO, RESULTADO, LINGUA, String.join("", objetos));
    }
}

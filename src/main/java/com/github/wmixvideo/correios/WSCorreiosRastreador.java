package com.github.wmixvideo.correios;

import br.com.correios.webservice.rastro.Rastro;
import br.com.correios.webservice.rastro.Service;
import br.com.correios.webservice.rastro.Sroxml;
import jakarta.xml.ws.BindingProvider;

import java.util.Collection;
import java.util.Map;

public class WSCorreiosRastreador {

    private static final String TIPO = "L";//todos
    private static final String RESULTADO = "T";//todos
    private static final String LINGUA = "101";//portugues

    private Service service;
    private final String usuario;
    private final String senha;
    private int timeoutMilliseconds = 15000;

    public WSCorreiosRastreador(final String usuario, final String senha) {
        this.service = null;
        this.usuario = usuario;
        this.senha = senha;
    }

    public WSCorreiosRastreador setTimeout(final int milliseconds) {
        this.timeoutMilliseconds = milliseconds;
        return this;
    }

    private Service getService() {
        System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(this.timeoutMilliseconds));
        if (this.service == null) {
            this.service = new Rastro().getServicePort();
        }
        final Map<String, Object> requestContext = ((BindingProvider) this.service).getRequestContext();
        requestContext.put("com.sun.xml.internal.ws.connect.timeout", timeoutMilliseconds);
        requestContext.put("com.sun.xml.internal.ws.request.timeout", timeoutMilliseconds);
        return this.service;
    }

    public Sroxml consultaObjeto(final String objeto) {
        return this.getService().buscaEventos(this.usuario, this.senha, TIPO, RESULTADO, LINGUA, objeto);
    }

    public Sroxml consultaObjetos(final Collection<String> objetos) {
        return this.getService().buscaEventos(this.usuario, this.senha, TIPO, RESULTADO, LINGUA, String.join("", objetos));
    }
}

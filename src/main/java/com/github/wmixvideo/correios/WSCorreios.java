package com.github.wmixvideo.correios;

import br.com.correios.webservice.resource.Rastro;
import br.com.correios.webservice.resource.Service;
import br.com.correios.webservice.resource.Sroxml;

import java.util.Collection;

public class WSCorreios {

    private static final String TIPO = "L";
    private static final String RESULTADO = "T";
    private static final String LINGUA = "";

    private final Service service;
    private final String usuario;
    private final String senha;

    public WSCorreios(final String usuario, final String senha) {
        this.service = new Rastro().getServicePort();
        this.usuario = usuario;
        this.senha = senha;
    }

    public Sroxml consultaObjeto(final String objeto) {
        return this.service.buscaEventos(this.usuario, this.senha, TIPO, RESULTADO, LINGUA, objeto);
    }

    public Sroxml consultaObjetos(final Collection<String> objetos) {
        return this.service.buscaEventos(this.usuario, this.senha, TIPO, RESULTADO, LINGUA, String.join(",", objetos));
    }
}

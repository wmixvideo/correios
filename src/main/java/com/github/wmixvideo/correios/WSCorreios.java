package com.github.wmixvideo.correios;

import br.com.correios.webservice.resource.Rastro;
import br.com.correios.webservice.resource.Service;
import br.com.correios.webservice.resource.Sroxml;

public class WSCorreios {

    private final Service service;
    private final String usuario;
    private final String senha;

    public WSCorreios(final String usuario, final String senha) {
        this.service = new Rastro().getServicePort();
        this.usuario = usuario;
        this.senha = senha;
    }

    public Sroxml consultaObjeto(final String objeto) {
        return this.service.buscaEventos(this.usuario, this.senha, "L", "T", "", objeto);
    }
}

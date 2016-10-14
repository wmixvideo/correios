package com.github.wmixvideo.correios;

public enum Opcao {
    SIM("S"),
    NAO("N");

    private final String opcao;

    Opcao(String opcao) {
        this.opcao = opcao;
    }

    public String getOpcao() {
        return opcao;
    }
}

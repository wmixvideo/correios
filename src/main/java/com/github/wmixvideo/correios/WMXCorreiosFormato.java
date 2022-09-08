package com.github.wmixvideo.correios;

public enum WMXCorreiosFormato {

    CAIXA(1, "Caixa"),
    ROLO(2, "Rolo"),
    ENVELOPE(3, "Envelope");

    private final int codigo;
    private final String descricao;

    WMXCorreiosFormato(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}

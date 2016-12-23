package com.github.wmixvideo.correios;

public enum Formato {
    CAIXA(1),
    ROLO(2),
    ENVELOPE(3);

    private final int codigo;

    Formato(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }
}

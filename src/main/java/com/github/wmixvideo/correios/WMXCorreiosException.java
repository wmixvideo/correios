package com.github.wmixvideo.correios;

/**
 * Wrapper simples para forcar o tratamento das excecoes.
 */
public class WMXCorreiosException extends Exception {
    public WMXCorreiosException(Throwable t) {
        super(t);
    }
}

package com.github.wmixvideo.correios;

import java.math.BigDecimal;

public record WMXCorreiosServicoPrecoPrazo(String codigo, BigDecimal valor, int prazoEntrega, BigDecimal valorMaoPropria, BigDecimal valorAvisoRecebimento, BigDecimal valorValorDeclarado, BigDecimal valorSemAdicionais, boolean entregaDomiciliar, boolean entregaSabado, String observacaoFim, int erroCodigo, String erroMensagem) {
}

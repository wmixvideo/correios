package com.github.wmixvideo.correios;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WMXCorreiosTest {

    @Test
    public void timeoutTest() {
        assertThrows(WMXCorreiosException.class, () -> {
            final List<WMXCorreiosServicoItem> servicos = new WMXCorreios().timeout(1).listaServicos();
            assertNotNull(servicos);
            assertFalse(servicos.isEmpty());
        });
    }

    @Test
    public void listaServicosTest() throws WMXCorreiosException {
        final List<WMXCorreiosServicoItem> servicos = new WMXCorreios().listaServicos();
        assertNotNull(servicos);
        assertFalse(servicos.isEmpty());
    }

    @Test
    public void calculaPrecoPrazoTest() throws WMXCorreiosException {
        final WMXCorreiosServicoPrecoPrazo calculaPrecoPrazo = new WMXCorreios().calculaPrecoPrazo("04162", "88101250", "89893000", 10, WMXCorreiosFormato.ENVELOPE, 10, 10, 10, 0, false, BigDecimal.ZERO, false);
        assertNotNull(calculaPrecoPrazo);
        assertFalse(calculaPrecoPrazo.erroCodigo() != 0);
        assertTrue(calculaPrecoPrazo.valor().signum() > 0);
        assertTrue(calculaPrecoPrazo.prazoEntrega() > 0);
    }

    @Test
    public void rastreamentoTest() throws WMXCorreiosException {
        final WMXCorreiosObjeto objeto = new WMXCorreios().rastrear("OH184746375BR");
        assertNotNull(objeto);
        assertEquals("OH184746375BR", objeto.numero());
    }
}

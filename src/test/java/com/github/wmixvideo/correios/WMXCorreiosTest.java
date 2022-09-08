package com.github.wmixvideo.correios;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.net.http.HttpTimeoutException;
import java.time.LocalDate;
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
        final List<WMXCorreiosServicoPrecoPrazo> servicos = new WMXCorreios().calculaPrecoPrazo("04162", "88101250", "89893000", 100, WMXCorreiosFormato.ENVELOPE, 10, 10, 10, 0, false, BigDecimal.ZERO, false, LocalDate.of(2022, 9, 7));
        assertNotNull(servicos);
        assertFalse(servicos.isEmpty());
        assertFalse(servicos.stream().anyMatch(s -> s.erroCodigo() != 0));
    }
}

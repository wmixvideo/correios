package com.github.wmixvideo.correios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class WMXCorreiosTest {

    @Test
    public void listaServicosTest() throws WMXCorreiosException {
        final List<WMXCorreiosServicoCalculo> servicos = new WMXCorreios().listaServicos();
        Assertions.assertNotNull(servicos);
        Assertions.assertFalse(servicos.isEmpty());
    }
}

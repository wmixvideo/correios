package com.github.wmixvideo.correios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public record WMXCorreiosObjeto(String numero, String sigla, String nome, String categoria, Set<WMXCorreiosObjetoEvento> eventos) {
}

package com.github.wmixvideo.correios;

import java.time.LocalDate;
import java.time.LocalTime;

public record WMXCorreiosObjetoEvento(String tipo, String status, LocalDate data, LocalTime hora, String descricao, String local, String codigo, String cidade, String uf) {
}

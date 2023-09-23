package com.example.eliminatorias.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PartidoDto{

    private Long id;
    private LocalDate fecha;
    private String estadio;
    private String arbitro;
    private EquipoDto equipoLocal;
    private EquipoDto equipoVisitante;
}

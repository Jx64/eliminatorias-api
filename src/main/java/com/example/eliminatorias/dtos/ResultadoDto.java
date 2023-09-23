package com.example.eliminatorias.dtos;

import lombok.Data;

@Data
public class ResultadoDto{

    private Long id;
    private int golesVisitante;
    private int golesLocal;
    private int numeroTarjetasRojas;
    private int numeroTarjetasAmarillas;
}

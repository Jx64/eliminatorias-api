package com.eliminatorias.dtos;

import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ResultadoDto{

    private Long id;

    @Size
    @PositiveOrZero
    private int golesVisitante;

    @Size
    @PositiveOrZero
    private int golesLocal;

    @Size
    @PositiveOrZero
    private int numeroTarjetasRojas;

    @Size
    @PositiveOrZero
    private int numeroTarjetasAmarillas;
}

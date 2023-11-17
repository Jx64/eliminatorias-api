package com.eliminatorias.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class PartidoDto{

    private Long id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;

    @NotBlank
    private String estadio;

    @NotBlank
    private String arbitro;

    private EquipoDto equipoLocal;

    private EquipoDto equipoVisitante;

    private ResultadoDto marcador;
}


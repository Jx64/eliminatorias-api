package com.eliminatorias.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EquipoDto{

    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String bandera;

    @NotBlank
    private String directorTecnico;
}

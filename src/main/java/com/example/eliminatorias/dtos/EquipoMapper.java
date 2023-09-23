package com.example.eliminatorias.dtos;

import com.example.eliminatorias.entities.Equipo;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface EquipoMapper {
    EquipoDto equitoToEquipoDto(Equipo equipo);
    Equipo equipoDtoToEquipo(EquipoDto equipoDto);
}

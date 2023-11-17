package com.eliminatorias.dtos;

import com.eliminatorias.entities.Equipo;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface EquipoMapper {
    EquipoDto equitoToEquipoDto(Equipo equipo);
    Equipo equipoDtoToEquipo(EquipoDto equipoDto);
}

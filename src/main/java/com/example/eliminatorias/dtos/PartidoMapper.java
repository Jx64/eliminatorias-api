package com.example.eliminatorias.dtos;

import com.example.eliminatorias.entities.Partido;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface PartidoMapper {
    Partido partidoDtoToPartido(PartidoDto partidoDto);
    PartidoDto partidoToPartidoDto(Partido partido);
}

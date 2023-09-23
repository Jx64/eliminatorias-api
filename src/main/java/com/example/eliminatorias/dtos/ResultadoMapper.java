package com.example.eliminatorias.dtos;

import com.example.eliminatorias.entities.Resultado;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface ResultadoMapper {
    Resultado ResultadoDtoToResultado(ResultadoDto resultadoDto);
    ResultadoDto resultadoToResultadoDto(Resultado resultado);
}

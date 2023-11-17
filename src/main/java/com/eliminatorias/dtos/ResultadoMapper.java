package com.eliminatorias.dtos;

import com.eliminatorias.entities.Resultado;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface ResultadoMapper {
    Resultado ResultadoDtoToResultado(ResultadoDto resultadoDto);
    ResultadoDto resultadoToResultadoDto(Resultado resultado);
}

package com.eliminatorias.services;

import com.eliminatorias.entities.Equipo;

import java.util.List;

public interface EquipoService extends BaseService<Equipo, Long> {
    List<Equipo> search(String nombre) throws Exception;
}

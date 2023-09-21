package com.example.eliminatorias.services;

import com.example.eliminatorias.entities.Equipo;

import java.util.List;

public interface EquipoService extends BaseService<Equipo, Long> {
    List<Equipo> search(String nombre) throws Exception;
}

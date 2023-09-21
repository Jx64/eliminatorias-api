package com.example.eliminatorias.services;

import com.example.eliminatorias.entities.Equipo;
import com.example.eliminatorias.repositories.BaseRepository;
import com.example.eliminatorias.repositories.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoServiceImpl extends BaseServiceImpl<Equipo, Long> implements EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public EquipoServiceImpl(BaseRepository<Equipo, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Equipo> search(String nombre) throws Exception {
        try {
            List<Equipo> equipos = equipoRepository.search(nombre);
            return equipos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

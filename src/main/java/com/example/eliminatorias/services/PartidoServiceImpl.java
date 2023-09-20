package com.example.eliminatorias.services;

import com.example.eliminatorias.entities.Partido;
import com.example.eliminatorias.repositories.BaseRepository;
import com.example.eliminatorias.repositories.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidoServiceImpl extends BaseServiceImpl<Partido, Long> implements PartidoService {

    @Autowired
    private PartidoRepository partidoRepository;

    public PartidoServiceImpl(BaseRepository<Partido, Long> baseRepository){
        super(baseRepository);
    }
}

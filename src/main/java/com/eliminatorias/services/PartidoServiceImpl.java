package com.eliminatorias.services;

import com.eliminatorias.entities.Partido;
import com.eliminatorias.repositories.BaseRepository;
import com.eliminatorias.repositories.PartidoRepository;
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

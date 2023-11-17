package com.eliminatorias.services;

import com.eliminatorias.entities.Resultado;
import com.eliminatorias.repositories.BaseRepository;
import com.eliminatorias.repositories.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultadoServiceImpl extends BaseServiceImpl<Resultado, Long>  implements ResultadoService {

    @Autowired
    private ResultadoRepository resultadoRepository;

    public ResultadoServiceImpl(BaseRepository<Resultado, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Resultado> findAll() throws Exception {
        Exception e = new Exception();
        throw new Exception(e.getMessage());
    }

    @Override
    public Resultado findById(Long id) throws Exception {
        Exception e = new Exception();
        throw new Exception(e.getMessage());
    }

    @Override
    public boolean delete(Long id) throws Exception {
        Exception e = new Exception();
        throw new Exception(e.getMessage());
    }
}

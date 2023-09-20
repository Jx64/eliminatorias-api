package com.example.eliminatorias.services;

import com.example.eliminatorias.entities.Equipo;
import com.example.eliminatorias.repositories.EquipoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoService implements BaseService<Equipo> {

    private EquipoRepository equipoRepository;

    public EquipoService(EquipoRepository equipoRepository){
        this.equipoRepository = equipoRepository;
    }

    @Override
    @Transactional
    public List<Equipo> findAll() throws Exception {
        try {
            List<Equipo> entities = equipoRepository.findAll();
            return entities;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Equipo findById(Long id) throws Exception {
        try {
            Optional<Equipo> entityOptional = equipoRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Equipo save(Equipo entity) throws Exception {
        try {
            entity = equipoRepository.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Equipo update(Long id, Equipo entity) throws Exception {
        try {
            Optional<Equipo> entityOptional = equipoRepository.findById(id);
            Equipo equipo = entityOptional.get();
            equipo = equipoRepository.save(entity);
            return equipo;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if(equipoRepository.existsById(id)){
                equipoRepository.deleteById(id);
                return true;
            } else{
                throw new Exception();
            }
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

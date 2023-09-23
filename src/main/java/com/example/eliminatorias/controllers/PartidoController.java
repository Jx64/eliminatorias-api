package com.example.eliminatorias.controllers;

import com.example.eliminatorias.dtos.PartidoDto;
import com.example.eliminatorias.dtos.PartidoMapper;
import com.example.eliminatorias.entities.Partido;
import com.example.eliminatorias.services.PartidoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/partidos")
public class PartidoController extends BaseControllerImpl<Partido, PartidoServiceImpl> {

    private final PartidoMapper partidoMapper;

    public PartidoController(PartidoMapper partidoMapper) {
        super();
        this.partidoMapper = partidoMapper;
    }

    @Override
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            List<Partido> listPartido = servicio.findAll();
            List<PartidoDto> partidoDtos = listPartido.stream().map(
                    partido -> partidoMapper.partidoToPartidoDto(partido)).collect(Collectors.toList());
            return ResponseEntity.status(HttpStatus.OK).body(partidoDtos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"ERROR NOT FOUND\"}");
        }
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            PartidoDto partidoDto = partidoMapper.partidoToPartidoDto(servicio.findById(id));
            return ResponseEntity.status(HttpStatus.OK).body(partidoDto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"ERROR NOT FOUND\"}");
        }
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Partido partido) {
        try {
            PartidoDto partidoDto = partidoMapper.partidoToPartidoDto(servicio.update(id, partido));
            return ResponseEntity.status(HttpStatus.OK).body(partidoDto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"ERROR CAN'T UPDATE\"}");
        }
    }
}

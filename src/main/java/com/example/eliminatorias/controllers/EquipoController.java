package com.example.eliminatorias.controllers;

import com.example.eliminatorias.dtos.EquipoDto;
import com.example.eliminatorias.dtos.EquipoMapper;
import com.example.eliminatorias.entities.Equipo;
import com.example.eliminatorias.services.EquipoServiceImpl;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/equipos")
public class EquipoController extends BaseControllerImpl<Equipo, EquipoServiceImpl> {

    private final EquipoMapper equipoMapper;
    public EquipoController(EquipoMapper equipoMapper){
        super();
        this.equipoMapper = equipoMapper;
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchByName(@RequestParam @NotBlank String nombre){
        try {
            List<Equipo> listEquipo = servicio.search(nombre);
            List<EquipoDto> equipoDtos = listEquipo.stream().map(
                    equipo -> equipoMapper.equitoToEquipoDto(equipo)).collect(Collectors.toList());
            return ResponseEntity.status(HttpStatus.OK).body(equipoDtos);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @Override
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            List<Equipo> listEquipo = servicio.findAll();
            List<EquipoDto> equipoDtos = listEquipo.stream().map(
                    equipo -> equipoMapper.equitoToEquipoDto(equipo)).collect(Collectors.toList());
            return ResponseEntity.status(HttpStatus.OK).body(equipoDtos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"ERROR NOT FOUND\"}");
        }
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable @NotNull Long id){
        try {
            EquipoDto equipoDtos = equipoMapper.equitoToEquipoDto(servicio.findById(id));
            return ResponseEntity.status(HttpStatus.OK).body(equipoDtos);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"ERROR NOT FOUND\"}");
        }
    }
}

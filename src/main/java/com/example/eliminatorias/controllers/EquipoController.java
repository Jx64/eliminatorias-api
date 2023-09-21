package com.example.eliminatorias.controllers;

import com.example.eliminatorias.entities.Equipo;
import com.example.eliminatorias.services.EquipoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/equipos")
public class EquipoController extends BaseControllerImpl<Equipo, EquipoServiceImpl> {

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String nombre){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(nombre));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
}

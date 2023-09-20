package com.example.eliminatorias.controllers;

import com.example.eliminatorias.entities.Equipo;
import com.example.eliminatorias.services.EquipoServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/equipos")
public class EquipoController extends BaseControllerImpl<Equipo, EquipoServiceImpl> {
}

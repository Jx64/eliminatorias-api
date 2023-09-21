package com.example.eliminatorias.controllers;

import com.example.eliminatorias.entities.Resultado;
import com.example.eliminatorias.services.ResultadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/resultados")
public class ResultadoController extends BaseControllerImpl<Resultado, ResultadoServiceImpl> {
}

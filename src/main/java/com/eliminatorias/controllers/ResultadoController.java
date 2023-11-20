package com.eliminatorias.controllers;

import com.eliminatorias.entities.Resultado;
import com.eliminatorias.services.ResultadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/resultados")
public class ResultadoController extends BaseControllerImpl<Resultado, ResultadoServiceImpl> {
}

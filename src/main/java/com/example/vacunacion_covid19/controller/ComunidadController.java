package com.example.vacunacion_covid19.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vacunacion_covid19.model.Comunidad;
import com.example.vacunacion_covid19.service.ComunidadService;

@RestController
@RequestMapping("/comunidades")
public class ComunidadController {
	@Autowired
	ComunidadService comunidadService;
}

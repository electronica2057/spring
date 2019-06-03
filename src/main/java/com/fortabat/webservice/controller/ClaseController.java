package com.fortabat.webservice.controller;


import com.fortabat.webservice.model.Clase;
import com.fortabat.webservice.model.Curso;
import com.fortabat.webservice.service.ClaseService;
import com.fortabat.webservice.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/api")
public class ClaseController {
	@Autowired
	ClaseService claseService;


	@PostMapping(value = "/clases", headers = "Accept= application/json")
	public ResponseEntity<Clase> addClase(@RequestBody Clase clase, Curso curso) {

		claseService.agregarClase(clase,curso);
		HttpHeaders header = new HttpHeaders();

		return new ResponseEntity<>(header, HttpStatus.CREATED);

	}



}

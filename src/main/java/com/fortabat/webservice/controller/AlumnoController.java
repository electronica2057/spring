package com.fortabat.webservice.controller;

import com.fortabat.webservice.model.Alumno;
import com.fortabat.webservice.model.Inscripcion;
import com.fortabat.webservice.model.container.DataAlumnos;
import com.fortabat.webservice.service.AlumnoService;
import com.fortabat.webservice.service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/api")

public class AlumnoController {

	@Autowired
	AlumnoService alumnoService;

	@Autowired
	InscripcionService inscripcionService;


	@GetMapping(path = "/alumnos")
	public @ResponseBody
	DataAlumnos retrieveAlumnos() {
		List<Alumno> alumnoList = alumnoService.obtenerTodosLosAlumnos();
		DataAlumnos dataAlumnos = new DataAlumnos();
		dataAlumnos.setAlumnoList(alumnoList);
		return dataAlumnos;
	}

	@GetMapping(path = "/alumnos/{id}")
	public @ResponseBody
	Alumno retrieveAlumno(@PathVariable int id) {
		Alumno a = alumnoService.getById(id);

		return a;
	}

	@GetMapping(path = "/alumnos/{id}/inscripciones")
	public @ResponseBody
	List<Inscripcion> retrieveInscripcionAlumno(@PathVariable int id) {

		List<Inscripcion> inscripcionList = inscripcionService.inscripcions(id);


		return inscripcionList;
	}


	/*
		@PostMapping(value = "/alumnos", headers = "Accept= application/json")
		public ResponseEntity<Alumno> addAlumno(@RequestBody Alumno alumno) {

			Integer id = alumnoService.agregarAlumno(alumno).getId();

			System.out.println("///////////////////////" + id);

			HttpHeaders header = new HttpHeaders();
			System.out.println(header);
			return new ResponseEntity<>(header, HttpStatus.CREATED);

		}
	*/
	@RequestMapping(method = RequestMethod.POST, value = "/alumnos")
	@ResponseBody
	public Alumno createUser(@RequestBody Alumno alumno) {
		alumnoService.agregarAlumno(alumno);
		return alumno;
	}


	@DeleteMapping(path = "/alumnos/{id}")
	public @ResponseBody
	ResponseEntity<Alumno> deleteAlumno(@PathVariable int id) {
		//la aplicacion debe conocer el id unico
		//obtener el alumno segun su id unico
		//Optional<Alumno> alumnoBuscado = alumnoService.getById(1);

		alumnoService.eliminarAlumno(id);

		HttpHeaders header = new HttpHeaders();

		return new ResponseEntity<>(header, HttpStatus.OK);
	}
}

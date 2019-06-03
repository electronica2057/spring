package com.fortabat.webservice.controller;

import com.fortabat.webservice.model.Baucher;
import com.fortabat.webservice.model.Inscripcion;
import com.fortabat.webservice.model.container.DataInscripciones;
import com.fortabat.webservice.service.AlumnoService;
import com.fortabat.webservice.service.BaucherService;
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
public class InscripcionController {
	@Autowired
	InscripcionService inscripcionService;
	@Autowired
	BaucherService baucherService;
	@Autowired
	AlumnoService alumnoService;

	/*    @PostMapping(value = "/alumnos", headers = "Accept= application/json")
		public ResponseEntity<Alumno> addAlumno(@RequestBody Alumno alumno) {

			alumnoService.agregarAlumno(alumno);
			HttpHeaders header = new HttpHeaders();

			return new ResponseEntity<>(header, HttpStatus.CREATED);

		}*/
/*	@PostMapping(value = "/inscripciones", headers = "Accept= application/json")
	public ResponseEntity<Inscripcion> addInscripcion(@RequestBody Inscriptor inscriptor) {
//necesito un objeto que tenga la responsabilidad de traer los id y ademas podria comprobar que los id existan
//el controller se encarga de recibir este objeto y delega la responsabilidad al servicio de inscripciones
		//el servicio de inscripciones puede devolver la incripcion creada o una excepcion en caso de error

		inscripcionService.crearInscripcion(inscriptor);

		HttpHeaders header = new HttpHeaders();

		return new ResponseEntity<>(header, HttpStatus.CREATED);

	}*/

	@PostMapping(value = "/inscripciones", headers = "Accept= application/json")
	public ResponseEntity<Inscripcion> addInscripcion(@RequestBody Inscripcion inscripcion) {
//necesito un objeto que tenga la responsabilidad de traer los id y ademas podria comprobar que los id existan
//el controller se encarga de recibir este objeto y delega la responsabilidad al servicio de inscripciones
		//el servicio de inscripciones puede devolver la incripcion creada o una excepcion en caso de error

		//inscripcionService.crearInscripcion(inscriptor);
		System.out.println(inscripcion.getAlumno().getNombre() + inscripcion.getCurso().getNameCurso() + inscripcion.getBaucher().getSerie());
		inscripcionService.agregarInscripcion(inscripcion);
		HttpHeaders header = new HttpHeaders();

		return new ResponseEntity<>(header, HttpStatus.CREATED);

	}

	@GetMapping(path = "/inscripciones")
	public @ResponseBody
	DataInscripciones retrieveAlumnos() {
		List<Inscripcion> inscripcionList = inscripcionService.obtenerTodasLasInscripciones();
		DataInscripciones dataInscripciones = new DataInscripciones();
		dataInscripciones.setInscripcionList(inscripcionList);
		return dataInscripciones;
	}


	@GetMapping(path = "/inscripciones/{id}")
	public @ResponseBody
	Inscripcion retrieveInscripciones(@PathVariable int id) {
		Inscripcion inscripcion = inscripcionService.getById(id);

		return inscripcion;
	}


	////////////////////////////////////////////////////////BAUCHER/////////////////////////////////////////////////////

	@PostMapping(value = "/baucher", headers = "Accept= application/json")
	public ResponseEntity<Baucher> addBaucher(@RequestBody Baucher baucher) {

		baucherService.agregarBaucher(baucher);
		HttpHeaders header = new HttpHeaders();

		return new ResponseEntity<>(header, HttpStatus.CREATED);

	}

	@GetMapping(path = "/baucher/{id}")
	public @ResponseBody
	Baucher retrieveBaucher(@PathVariable int id) {
		Baucher baucher = baucherService.getBySerie(id);

		return baucher;
	}


}

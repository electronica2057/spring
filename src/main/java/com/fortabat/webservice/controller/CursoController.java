package com.fortabat.webservice.controller;

import com.fortabat.webservice.model.Curso;
import com.fortabat.webservice.model.container.DataCursos;
import com.fortabat.webservice.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/api")

public class CursoController {

	@Autowired
	CursoService cursoService;

	//crear curso
	@PostMapping(value = "/cursos", headers = "Accept= application/json")


/*    @PostMapping(value = "/alumnos", headers = "Accept= application/json")
    public ResponseEntity<Alumno> addAlumno(@RequestBody Alumno alumno) {

        alumnoService.agregarAlumno(alumno);
        HttpHeaders header = new HttpHeaders();

        return new ResponseEntity<>(header, HttpStatus.CREATED);

    }*/


	public ResponseEntity<Curso> addCurso(@RequestBody Curso curso) {
		System.out.println("////////////////////////////////////xxxx  ENTRADA API  xxxx/////////////////////////////");
		System.out.println(curso);
		cursoService.agregarCurso(curso);
		HttpHeaders header = new HttpHeaders();

		return new ResponseEntity<>(header, HttpStatus.CREATED);


	}

	//listar cursos
	@GetMapping(path = "/cursos")
	public @ResponseBody
	DataCursos listaCursos() {
		List<Curso> cursoList = cursoService.listarCursos();
		DataCursos dataCursos = new DataCursos();
		dataCursos.setCursoList(cursoList);

		return dataCursos;
	}


	@GetMapping(path = "/cursos/{id}")
	public @ResponseBody
	Curso retrieveAlumno(@PathVariable int id) {
		Curso a = cursoService.getById(id);

		return a;
	}


	@DeleteMapping(path = "/cursos/{id}")
	public @ResponseBody
	ResponseEntity<Curso> deleteCurso(@PathVariable int id) {
		//la aplicacion debe conocer el id unico
		//obtener el alumno segun su id unico
		//Optional<Alumno> alumnoBuscado = alumnoService.getById(1);

		cursoService.quitarCurso(id);

		HttpHeaders header = new HttpHeaders();

		return new ResponseEntity<>(header, HttpStatus.OK);
	}

	//    @GetMapping(path = "/cursos/{id}/clases")

	//llamaria al servicio de cursos... el controller de clases por ahora va a servir por ejemplo para traer las clases de un dia particular
	//de esta forma al tener la lista de clases y los horarios, va a ser mas practico para tomar asistencia

	//al crear el curso son las clases integradas, efectivamente se generan las relaciones curso-clase






}

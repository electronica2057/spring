package com.fortabat.webservice.service;

import com.fortabat.webservice.model.Clase;
import com.fortabat.webservice.model.Curso;
import com.fortabat.webservice.repository.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaseService {
	@Autowired
	ClaseRepository claseRepository;
	@Autowired
	CursoService cursoService;

	//para agregar un curso se debe traer el objeto de la clase
	public Clase agregarClase(Clase clase, Curso curso) {

		cursoService.getById(curso.getId()).getClases().add(clase);

		System.out.println(clase);

		return clase;


	}


}

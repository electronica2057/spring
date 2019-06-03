package com.fortabat.webservice.service;

import com.fortabat.webservice.model.Inscripcion;
import com.fortabat.webservice.model.container.Inscriptor;
import com.fortabat.webservice.repository.InscripcionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InscripcionService {
    @Autowired
    InscripcionRepositorio inscripcionRepositorio;
    @Autowired
    CursoService cursoService;

    @Autowired
    AlumnoService alumnoService;

    @Autowired
    BaucherService baucherService;
    //buscar coutas por alumno

    public List<Inscripcion> inscripcions(Integer id) {
        return inscripcionRepositorio.getByAlumno_Id(id);
    }

    public Inscripcion agregarInscripcion(Inscripcion inscripcion) {
        inscripcionRepositorio.save(inscripcion);
        return inscripcion;
    }


    public List<Inscripcion> obtenerTodasLasInscripciones() {
        return inscripcionRepositorio.findAll();
    }

    public Inscripcion getById(Integer id) {


        return inscripcionRepositorio.getById(id);

    }

    public Inscripcion crearInscripcion(Inscriptor inscriptor) {
        System.out.println(inscriptor.getString());
        System.out.println(inscriptor.getIdAlumno());
        System.out.println(inscriptor.getIdBaucher());
        System.out.println(inscriptor.getIdCurso());

        System.out.println("////////////////////////////////////////////////////////////////");
        Inscripcion nuevaInscripcion = new Inscripcion();
        nuevaInscripcion.setCurso(cursoService.getById(Integer.parseInt(inscriptor.getIdCurso())));
        nuevaInscripcion.setBaucher(baucherService.getById(Integer.parseInt(inscriptor.getIdBaucher())));
        nuevaInscripcion.setAlumno(alumnoService.getById(Integer.parseInt(inscriptor.getIdAlumno())));
        System.out.println(nuevaInscripcion);
        inscripcionRepositorio.save(nuevaInscripcion);

        return nuevaInscripcion;
    }


/*
public Alumno agregarAlumno(Alumno alumno) {

    alumnosRepositorio.save(alumno);

    return alumno;

}*/

    //crear inscripcion
    //agregar cuotas
    //?la inscripcion tiene una fecha limite?? cuando caduca?


}

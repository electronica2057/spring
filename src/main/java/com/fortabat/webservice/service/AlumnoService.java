package com.fortabat.webservice.service;

import com.fortabat.webservice.model.Alumno;
import com.fortabat.webservice.model.Curso;
import com.fortabat.webservice.repository.AlumnosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;
import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {

    private final AlumnosRepositorio alumnosRepositorio;

    public AlumnoService(AlumnosRepositorio alumnosRepositorio) {
        this.alumnosRepositorio = alumnosRepositorio;
    }


    //agregar alumno

    public Alumno agregarAlumno(Alumno alumno) {

        alumnosRepositorio.save(alumno);

        return alumno;

    }

    //borrar alumno


    public void eliminarAlumno(int id) {
        Optional<Alumno> alumno = alumnosRepositorio.findById(id);
        alumnosRepositorio.deleteById(id);

    }

    //listar todos los alumnos

    public List<Alumno> obtenerTodosLosAlumnos() {
        return alumnosRepositorio.findAll();
    }

    //listar alumnos de un curso particular

    public List<Alumno> obtenerAlumnosDelCurso(Curso curso) {

        return alumnosRepositorio.findAll();
    }

    //obtener por id
    public Alumno getById(int id) {
    return alumnosRepositorio.getById(id);
    }
    public Optional<Alumno> findById(int id) {
        return alumnosRepositorio.findById(id);
    }

    //actualizar alumno... deberia buscar el alumno por id y cambiarle los datos

    public Alumno actualizar(int id,Alumno alumno){

        Optional<Alumno> alumnoBuscado = alumnosRepositorio.findById(id);

        return alumno;
    }




//podrian llegar los parametros del alumno y aca crearse o no el alumno...
    //podria ser la unica forma de crear un alumno?



    //??borrar alumno? de que forma podria afectr a la base de datos?

    //funcion de comprobacion de datos de alumno

    //equals de los alumnos?

}

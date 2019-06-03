package com.fortabat.webservice.service;

import com.fortabat.webservice.model.Curso;
import com.fortabat.webservice.model.Docente;
import com.fortabat.webservice.repository.CursoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    private final CursoRepositorio cursoRepositorio;

    public CursoService(CursoRepositorio cursoRepositorio) {
        this.cursoRepositorio = cursoRepositorio;
    }

    //agregar curso
    public Curso agregarCurso(Curso curso) {

        cursoRepositorio.save(curso);

        return curso;

    }

    //quitar curso

    public void quitarCurso(int id) {


        // implementar toda la logica que no permita la eliminacion de un curso que no este vacio..

        cursoRepositorio.deleteById(id);


    }

    //listar cursos

    public List<Curso> listarCursos() {
        return cursoRepositorio.findAll();
    }

    //podrian filtrarse cursos por activo o inactivo

    //setear docente

    public Curso asignarDocente(Curso curso, Docente docente) {

        curso.setDocente(docente);

        return curso;
    }

    public Curso getById(int id) {
        return cursoRepositorio.getById(id);
    }

}

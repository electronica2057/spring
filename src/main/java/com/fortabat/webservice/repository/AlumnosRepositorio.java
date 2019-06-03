package com.fortabat.webservice.repository;

import com.fortabat.webservice.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface AlumnosRepositorio extends JpaRepository<Alumno, Integer> {
    Alumno getAlumnoByApellido(String apellido);

    Alumno getAlumnoByNombre(String nombre);

    List<Alumno> findAll();

    Alumno getById(int id);

    @Override
    void deleteById(Integer integer);

}

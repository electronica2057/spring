package com.fortabat.webservice.repository;

import com.fortabat.webservice.model.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InscripcionRepositorio extends JpaRepository<Inscripcion,Integer> {
    Inscripcion getById(Integer id);
    List<Inscripcion> getByAlumno_Id(Integer id);
}

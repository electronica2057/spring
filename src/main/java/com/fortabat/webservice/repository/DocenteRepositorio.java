package com.fortabat.webservice.repository;

import com.fortabat.webservice.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepositorio extends JpaRepository<Docente,Integer> {
    Docente getById(int id);
}

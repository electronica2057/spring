package com.fortabat.webservice.repository;

import com.fortabat.webservice.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CursoRepositorio extends JpaRepository<Curso, Integer> {
    List<Curso> findAll();

    Curso findAllById(int id);

    @Override
    void deleteById(Integer integer);

    Curso getById(int id);

}

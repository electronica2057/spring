package com.fortabat.webservice.service;

import com.fortabat.webservice.model.Docente;
import com.fortabat.webservice.repository.DocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {
    @Autowired
    DocenteRepositorio docenteRepositorio;

    public Docente agregarDocente(Docente docente) {
        docenteRepositorio.save(docente);
        return docente;
    }

    public List<Docente> listarDocentes() {
        return docenteRepositorio.findAll();
    }

    public Docente getById(int id) {
        return docenteRepositorio.getById(id);
    }
}

package com.fortabat.webservice.model.container;

import com.fortabat.webservice.model.Inscripcion;

import java.util.List;

public class DataInscripciones {
    private List<Inscripcion> inscripcionList;

    public List<Inscripcion> getInscripcionList() {
        return inscripcionList;
    }

    public void setInscripcionList(List<Inscripcion> inscripcionList) {
        this.inscripcionList = inscripcionList;
    }

    public DataInscripciones() {
    }
}

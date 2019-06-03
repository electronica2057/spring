package com.fortabat.webservice.model.container;

import com.fortabat.webservice.model.Docente;

import java.util.List;

public class DataDocentes {
    private List<Docente> docenteList;

    public DataDocentes() {
    }

    public List<Docente> getDocenteList() {
        return docenteList;
    }

    public void setDocenteList(List<Docente> docenteList) {
        this.docenteList = docenteList;
    }

    public DataDocentes(List<Docente> docenteList) {

        this.docenteList = docenteList;
    }
}

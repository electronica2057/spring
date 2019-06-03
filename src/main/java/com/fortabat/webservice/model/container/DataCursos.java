package com.fortabat.webservice.model.container;

import com.fortabat.webservice.model.Curso;

import java.util.List;

public class DataCursos {
    private List<Curso> cursoList;

    public DataCursos() {
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    public DataCursos(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }
}

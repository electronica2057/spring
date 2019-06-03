package com.fortabat.webservice.model.container;

import com.fortabat.webservice.model.Alumno;
import org.springframework.stereotype.Repository;

import java.util.List;


public class DataAlumnos {
    private List<Alumno> alumnoList;

    public DataAlumnos() {
    }

    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    public DataAlumnos(List<Alumno> alumnoList) {

        this.alumnoList = alumnoList;
    }
}

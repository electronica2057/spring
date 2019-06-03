package com.fortabat.webservice.model.container;

import org.springframework.stereotype.Component;


@Component
public class Inscriptor {

    private String idCurso;
    private String idAlumno;
    private String idBaucher;
    private String string;

    public Inscriptor() {
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getIdBaucher() {
        return idBaucher;
    }

    public void setIdBaucher(String idBaucher) {
        this.idBaucher = idBaucher;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}

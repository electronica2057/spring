package com.fortabat.webservice.model;

import javax.persistence.*;

@Entity
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    public Boolean getPresente() {
        return presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }

    public Boolean getMediaFalta() {
        return mediaFalta;
    }

    public void setMediaFalta(Boolean mediaFalta) {
        this.mediaFalta = mediaFalta;
    }
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean presente;
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean mediaFalta;


}

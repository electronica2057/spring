package com.fortabat.webservice.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Cuota {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)

    private Integer id;
    private double monto;
    private Date fechaDeVencimimiento;

    public Cuota() {
    }

}

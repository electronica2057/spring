package com.fortabat.webservice.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Baucher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;
	private Integer serie;
	private Double monto;
	private Date fechaCreacion;

	//la matricula puede servir para varios alumnos?? cambiaria el modelo en caso afirmativo
	public Baucher() {
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getId() {
		return id;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public Double getMonto() {
		return monto;
	}

	//la matricula

	public void setMonto(Double monto) {
		this.monto = monto;
	}
}

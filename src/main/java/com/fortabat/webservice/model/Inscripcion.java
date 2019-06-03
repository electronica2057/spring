package com.fortabat.webservice.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Inscripcion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@OneToOne
	private Alumno alumno;
	@OneToOne
	private Curso curso;
	@OneToMany
	private List<Cuota> cuotaList;
	@OneToMany
	private List<Asistencia> asistenciaList;
	private Date fechaDeCreacion;
	@OneToOne
	private Baucher baucher;

	public Inscripcion() {
	}

	public Integer getId() {
		return id;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Cuota> getCuotaList() {
		return cuotaList;
	}

	public void setCuotaList(List<Cuota> cuotaList) {
		this.cuotaList = cuotaList;
	}

	public List<Asistencia> getAsistenciaList() {
		return asistenciaList;
	}

	public void setAsistenciaList(List<Asistencia> asistenciaList) {
		this.asistenciaList = asistenciaList;
	}


	//tengo que ver como conectar los horarios y fechas de las clases
	//podria generar una asistencia justo cuando es el horario de clases
	//obtener las clases de un curso y segun la fecha crear la asistencia necesaria

	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public Baucher getBaucher() {
		return baucher;
	}

	public void setBaucher(Baucher baucher) {
		this.baucher = baucher;
	}

}

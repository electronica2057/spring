package com.fortabat.webservice.model;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;


//tipo de curso

//bimestral
//semestral
//anual


//cantidad de clases con duracion
@Entity
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private Docente docente;
	private String codigo;
	private String nameCurso;
	private String descripcion;
//	@ManyToOne(cascade={PERSIST, MERGE, REMOVE, REFRESH, DETACH})

	@OneToMany(cascade = {PERSIST, MERGE, REMOVE, REFRESH, DETACH})
	private List<Clase> clases;

	public Curso() {
	}

	public List<Clase> getClases() {
		return clases;
	}

	public void setClases(List<Clase> clases) {
		this.clases = clases;
	}

	public Integer getId() {
		return id;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public String getNameCurso() {
		return nameCurso;
	}

	public void setNameCurso(String nameCurso) {
		this.nameCurso = nameCurso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}

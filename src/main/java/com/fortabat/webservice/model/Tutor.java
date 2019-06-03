package com.fortabat.webservice.model;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.CascadeType.*;


@Entity
public class Tutor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)

	private Integer id;
	private String parentesco;
	private Boolean jefeHogar;
	private String apellido;
	private String nombre;
	private String nacionalidad;
	private String profesionOcupacion;
	private String condicionActividad;
	private String nivelDeInstruccion;
	private String tipoDocumento;
	private String numeroDocumento;
	private String estadoDelDocumento;
	private Date fechaDeNacimiento;
	private String email;
	private String sexo;
	@OneToOne(cascade = {PERSIST, MERGE, REMOVE, REFRESH, DETACH})
	private Domicilio domicilio;

	public Tutor() {
	}

	public Integer getId() {
		return id;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public Boolean getJefeHogar() {
		return jefeHogar;
	}

	public void setJefeHogar(Boolean jefeHogar) {
		this.jefeHogar = jefeHogar;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getProfesionOcupacion() {
		return profesionOcupacion;
	}

	public void setProfesionOcupacion(String profesionOcupacion) {
		this.profesionOcupacion = profesionOcupacion;
	}

	public String getCondicionActividad() {
		return condicionActividad;
	}

	public void setCondicionActividad(String condicionActividad) {
		this.condicionActividad = condicionActividad;
	}

	public String getNivelDeInstruccion() {
		return nivelDeInstruccion;
	}

	public void setNivelDeInstruccion(String nivelDeInstruccion) {
		this.nivelDeInstruccion = nivelDeInstruccion;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getEstadoDelDocumento() {
		return estadoDelDocumento;
	}

	public void setEstadoDelDocumento(String estadoDelDocumento) {
		this.estadoDelDocumento = estadoDelDocumento;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
}

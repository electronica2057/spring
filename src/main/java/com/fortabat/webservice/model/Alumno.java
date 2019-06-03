package com.fortabat.webservice.model;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Date;

import static javax.persistence.CascadeType.*;

@Entity
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)

	private Integer id;
	private String nombre;
	private String email;
	private String apellido;
	private Date fechaDeNacimiento;
	private String numeroDocumento;
	private String tipoDocumento;
	private String estadoDelDocumento;
	private String sexo;
	private String lugarNacimiento;
	private String nacionalidad;
	private String nivelEstudios;
	@Column(nullable = false, columnDefinition = "TINYINT(1)")
	private Boolean estudiosCompletos;
	@OneToOne(cascade = {PERSIST, MERGE, REMOVE, REFRESH, DETACH})
	private Domicilio domicilio;
	@OneToOne(cascade = {PERSIST, MERGE, REMOVE, REFRESH, DETACH})
	private Tutor tutor;

	public Alumno() {
	}

	public String getNivelEstudios() {
		return nivelEstudios;
	}

	public void setNivelEstudios(String nivelEstudios) {
		this.nivelEstudios = nivelEstudios;
	}

	public Boolean getEstudiosCompletos() {
		return estudiosCompletos;
	}

	public void setEstudiosCompletos(Boolean estudiosCompletos) {
		this.estudiosCompletos = estudiosCompletos;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getEstadoDelDocumento() {
		return estadoDelDocumento;
	}

	public void setEstadoDelDocumento(String estadoDelDocumento) {
		this.estadoDelDocumento = estadoDelDocumento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


}

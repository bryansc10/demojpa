package com.soca.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "oficina")
public class Oficina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_oficina")
	private int id_oficina;
	
	@Column(name = "codigo_oficina", length = 10)
	private String codigo_oficina;
	
	@Column(name = "ciudad", length = 30)
	private String ciudad;
	
	@Column(name = "pais", length = 50)
	private String pais;
	
	@Column(name = "region", length = 50)
	private String region;
	
	@Column(name = "codigo_postal", length = 10)
	private String codigo_postal;
	
	@Column(name = "telefono", length = 20)
	private String telefono;

	// Void constructor
	public Oficina() {
	}

	// Setters and getters
	public int getId_oficina() {
		return id_oficina;
	}

	public void setId_oficina(int id_oficina) {
		this.id_oficina = id_oficina;
	}

	public String getCodigo_oficina() {
		return codigo_oficina;
	}

	public void setCodigo_oficina(String codigo_oficina) {
		this.codigo_oficina = codigo_oficina;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}

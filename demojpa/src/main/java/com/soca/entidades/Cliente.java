package com.soca.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private int id_cliente;
	
	@Column(name = "codigo_cliente")
	private int codigo_cliente;
	
	@Column(name = "nombre_cliente", length = 255)
	private String nombre_cliente;
	
	@Column(name = "nombre_contacto ", length = 255)
	private String nombre_contacto;
	
	@Column(name = "apellido_contacto", length = 255)
	private String apellido_contacto;
	
	@Column(name = "telefono", length = 255)
	private String telefono;
	
	@Column(name = "fax", length = 255)
	private String fax;
	
	@Column(name = "ciudad", length = 255)
	private String ciudad;
	
	@Column(name = "region", length = 255)
	private String region;
	
	@Column(name = "pais", length = 255)
	private String pais;
	
	@Column(name = "codigo_postal", length = 255)
	private String codigo_postal;
	
	@Column(name = "id_empleado")
	private int id_empleado;
	
	@Column(name = "limite_credito")
	private double limite_credito;

	// Void constructor
	public Cliente() {
	}

	// Setters and getters
	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getNombre_contacto() {
		return nombre_contacto;
	}

	public void setNombre_contacto(String nombre_contacto) {
		this.nombre_contacto = nombre_contacto;
	}

	public String getApellido_contacto() {
		return apellido_contacto;
	}

	public void setApellido_contacto(String apellido_contacto) {
		this.apellido_contacto = apellido_contacto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public double getLimite_credito() {
		return limite_credito;
	}

	public void setLimite_credito(double limite_credito) {
		this.limite_credito = limite_credito;
	}

	@Override
	public String toString() {
		return String.format("%-5s %-5s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s", id_cliente, codigo_cliente, nombre_cliente,
				nombre_contacto, apellido_contacto, telefono, fax, ciudad, region, pais, codigo_postal, id_empleado,
				limite_credito);
	}
	
	
	
}

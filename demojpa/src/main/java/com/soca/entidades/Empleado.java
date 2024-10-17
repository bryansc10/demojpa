package com.soca.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private int id_empleado;
	
	@Column(name = "codigo_empleado")
	private int codigo_empleado;
	
	@Column(name = "nombre", length = 50)
	private String nombre;
	
	@Column(name = "apellido", length = 50)
	private String apellido;
	
	@Column(name = "extension", length = 10)
	private String extension;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "id_oficina")
	private Oficina oficina; // private int id_oficina;
	
	@Column(name = "id_jefe")
	private int id_jefe;
	
	@Column(name = "puesto", length = 255)
	private String puesto;

	// Void constructor
	public Empleado() {
	}

	// Setters y getters
	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public int getCodigo_empleado() {
		return codigo_empleado;
	}

	public void setCodigo_empleado(int codigo_empleado) {
		this.codigo_empleado = codigo_empleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	public int getId_jefe() {
		return id_jefe;
	}

	public void setId_jefe(int id_jefe) {
		this.id_jefe = id_jefe;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
}

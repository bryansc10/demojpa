package com.soca.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gama_producto")
public class GamaProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_gama")
	private int id_gama;
	
	@Column(name = "gama", length = 255)
	private String gama;
	
	@Column(name = "descripcion_texto", length = 255)
	private String descripcion_texto;
	
	@Column(name = "descripcion_html", length = 255)
	private String descripcion_html;
	
	@Column(name = "imagen", length = 255)
	private String imagen;

	// Void constructor
	public GamaProducto() {
	}

	// Setters y getters
	public int getId_gama() {
		return id_gama;
	}

	public void setId_gama(int id_gama) {
		this.id_gama = id_gama;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public String getDescripcion_texto() {
		return descripcion_texto;
	}

	public void setDescripcion_texto(String descripcion_texto) {
		this.descripcion_texto = descripcion_texto;
	}

	public String getDescripcion_html() {
		return descripcion_html;
	}

	public void setDescripcion_html(String descripcion_html) {
		this.descripcion_html = descripcion_html;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return String.format("%-5s %-25s %-25s %-25s %-25s", id_gama, gama, descripcion_texto, descripcion_html, imagen);
	}
	
}

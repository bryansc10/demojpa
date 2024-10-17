package com.soca.entidades;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private int id_pedido;
	
	@Column(name = "codigo_pedido")
	private int codigo_pedido;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_pedido")
	private Date fecha_pedido;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_esperada")
	private Date fecha_esperada;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_entrega")
	private Date fecha_entrega;
	
	@Column(name = "estado", length = 255)
	private String estado;
	
	@Column(name = "comentarios", length = 255)
	private String comentarios;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente; // private int id_cliente;

	// Void constructor
	public Pedido() {
	}

	// Setters and getters
	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public int getCodigo_pedido() {
		return codigo_pedido;
	}

	public void setCodigo_pedido(int codigo_pedido) {
		this.codigo_pedido = codigo_pedido;
	}

	public Date getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(Date fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public Date getFecha_esperada() {
		return fecha_esperada;
	}

	public void setFecha_esperada(Date fecha_esperada) {
		this.fecha_esperada = fecha_esperada;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}

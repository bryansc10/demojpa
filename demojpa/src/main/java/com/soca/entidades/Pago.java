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
@Table(name = "pago")
public class Pago {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pago")
	private int id_pago;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente; //private int id_cliente;
	
	@Column(name = "forma_pago", length = 255)
	private String forma_pago;
	
	@Column(name = "id_transaccion", length = 255)
	private String id_transaccion;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_pago")
	private Date fecha_pago;
	
	@Column(name = "total")
	private double total;

	// Void constructor
	public Pago() {
	}

	// Setters and getters
	public int getId_pago() {
		return id_pago;
	}

	public void setId_pago(int id_pago) {
		this.id_pago = id_pago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getForma_pago() {
		return forma_pago;
	}

	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}

	public String getId_transaccion() {
		return id_transaccion;
	}

	public void setId_transaccion(String id_transaccion) {
		this.id_transaccion = id_transaccion;
	}

	public Date getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(Date fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}

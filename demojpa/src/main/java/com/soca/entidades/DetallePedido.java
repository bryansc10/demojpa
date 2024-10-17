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
@Table(name = "detalle_pedido")
public class DetallePedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = " id_detalle_pedido")
	private int id_detalle_pedido;
	
	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private Pedido pedido; //private int id_pedido;
	
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto producto; //private int id_producto;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "precio_unidad")
	private double precio_unidad;
	
	@Column(name = "numero_linea")
	private int numero_linea;

	// Void constructor
	public DetallePedido() {
	}

	// Setters y getters
	public int getId_detalle_pedido() {
		return id_detalle_pedido;
	}

	public void setId_detalle_pedido(int id_detalle_pedido) {
		this.id_detalle_pedido = id_detalle_pedido;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(double precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

	public int getNumero_linea() {
		return numero_linea;
	}

	public void setNumero_linea(int numero_linea) {
		this.numero_linea = numero_linea;
	}
	
	
}

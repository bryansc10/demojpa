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
@Table(name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private int id_producto;
	
	@Column(name = "codigo_producto", length = 255)
	private String codigo_producto;
	
	@Column(name = "nombre", length = 255)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "id_gama")
	private GamaProducto gamaProducto; //private int id_gama;
	
	@Column(name = "dimensiones", length = 255)
	private String dimensiones;
	
	@Column(name = "proveedor", length = 255)
	private String proveedor;
	
	@Column(name = "descripcion", length = 255)
	private String descripcion;
	
	@Column(name = "cantidad_en_stock")
	private int cantidad_en_stock;
	
	@Column(name = "precio_venta")
	private double precio_venta;
	
	@Column(name = "precio_proveedor")
	private double precio_proveedor;

	// Void constructor
	public Producto() {
	}

	// Setters and getters
	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(String codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public GamaProducto getGamaProducto() {
		return gamaProducto;
	}

	public void setGamaProducto(GamaProducto gamaProducto) {
		this.gamaProducto = gamaProducto;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad_en_stock() {
		return cantidad_en_stock;
	}

	public void setCantidad_en_stock(int cantidad_en_stock) {
		this.cantidad_en_stock = cantidad_en_stock;
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}

	public double getPrecio_proveedor() {
		return precio_proveedor;
	}

	public void setPrecio_proveedor(double precio_proveedor) {
		this.precio_proveedor = precio_proveedor;
	}
}

package com.soca.servicios;

import java.util.List;

import com.soca.entidades.Producto;
import com.soca.persistencia.ProductoDAO;

public class ProductoServicio {
	private final ProductoDAO daoProducto;

	public ProductoServicio() {
		this.daoProducto = new ProductoDAO();
	}

	public void listarProductos() {
		try {
			List<Producto> todosProductos = daoProducto.listarTodos();
			imprimirLista(todosProductos);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se realizo la solicitud.");
		}
	}

	public void imprimirLista(List<Producto> listaRecibida) {
		System.out.println("LISTA DE PRODUCTOS");
		System.out.printf("%-2s | %-60s | %-4s | %s\n", "ID", "Nombre producto", "Unid.", "Precio");
		for (Producto producto : listaRecibida) {
			System.out.printf("%-2s - %-60s - %-5s - $%s\n", producto.getId_producto(), producto.getNombre(),
					producto.getCantidad_en_stock(), producto.getPrecio_venta());
		}
	}
}

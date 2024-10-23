package com.soca.servicios;

import java.util.List;

import com.soca.entidades.GamaProducto;
import com.soca.persistencia.GamaProductoDAO;

public class GamaProductoServicio {
	private GamaProductoDAO daoGamaProducto;
	
	public GamaProductoServicio() {
		this.daoGamaProducto = new GamaProductoDAO();
	}
	
	public void crearGamaProducto(String gama, String descripcionTexto, String descripcionHTML, String imagen) {
		try {
			GamaProducto gamaProductoNueva = new GamaProducto();
			
			gamaProductoNueva.setGama(gama);
			gamaProductoNueva.setDescripcion_texto(descripcionTexto);
			gamaProductoNueva.setDescripcion_html(descripcionHTML);
			gamaProductoNueva.setImagen(imagen);
			
			daoGamaProducto.guardarGamaProducto(gamaProductoNueva);
			
			System.out.println("Se creo la gama del producto.");
			
		} catch (Exception e) {
			System.out.println(e.toString() + "No se guardo la nueva gama de manera correcta");
		}
	}
	
	public void buscarCliente(int id) {
		try {
			GamaProducto gamaProductoEncontrado = daoGamaProducto.encontrarGamaProducto(id);
			if (gamaProductoEncontrado==null) {
				System.out.println("No se encontro la gama del producto.");
			}
		
			System.out.println(gamaProductoEncontrado.toString());	
			
		} catch (Exception e) {
			System.out.println(e.toString() + "Problemas al encontrar la gama del producto.");
		}
	}
	
	public void modificarGama(int id, String gama) {
		try {
			daoGamaProducto.actualizarGama(id, gama);
			System.out.println("Gama de producto actualizada.");
			
		} catch (NullPointerException e) {
			System.out.println("Id de gama no encontrada.");
			
		} catch (Exception e) {
			System.out.println(e.toString() + "Problemas al actualizar la gama del producto.");
		}
	}
	
	public void listarGama() {
		try {
			List<GamaProducto> todosGama = daoGamaProducto.listarTodas();
			imprimirLista(todosGama);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se realizo la solicitud.");
		}
	}
	
	public void imprimirLista(List<GamaProducto> listaRecibida) {
		System.out.println("LISTA DE GAMAS DE PRODUCTOS");
		System.out.printf("%-5s %-25s %-50s %-25s %-25s\n", "ID", "Gama", "descripcion_texto", "descripcion_html", "imagen");
		for (GamaProducto gamaProducto : listaRecibida) {
			System.out.println(gamaProducto.toString());
		}
	}
}

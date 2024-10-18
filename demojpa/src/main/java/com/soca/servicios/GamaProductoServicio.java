package com.soca.servicios;

import com.soca.entidades.Cliente;
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
}

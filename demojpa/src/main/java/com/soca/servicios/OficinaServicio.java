package com.soca.servicios;

import java.util.List;

import com.soca.entidades.Oficina;
import com.soca.persistencia.OficinaDAO;

public class OficinaServicio {
	private final OficinaDAO daoOficina; //Instancio a la unidad de persistencia para acceder a los métodos del EM
	
	public OficinaServicio() {
		this.daoOficina = new OficinaDAO();
	}
	
	public void crearOficina(String codigoOficina, String ciudad, String pais, String region, String telefono, String codigoPostal) {
		try {
			Oficina oficinaNueva = new Oficina();
			
			oficinaNueva.setCodigo_oficina(codigoOficina);
			oficinaNueva.setCiudad(ciudad);
			oficinaNueva.setPais(pais);
			oficinaNueva.setRegion(region);
			oficinaNueva.setTelefono(telefono);
			oficinaNueva.setCodigo_postal(codigoPostal);
			
			daoOficina.guardarOficina(oficinaNueva);
			System.out.println("Se a creado la oficina.");
			
		} catch (Exception e) {
			System.out.println(e.toString() + "No se guardo la nueva oficina de manera correcta");
		}
	}
	
	public void listarOficinas() {
		try {
			List<Oficina> todasOficinas = daoOficina.listarTodas();
			imprimirLista(todasOficinas);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se realizo la solicitud.");
		}
	}
	
	public void imprimirLista(List<Oficina> listaRecibida) {
		for (Oficina oficina : listaRecibida) {
			System.out.printf("%s - %s - %s\n", oficina.getCodigo_oficina(), oficina.getCiudad(), oficina.getPais());
		}
	}
}

package com.soca.servicios;

import com.soca.persistencia.EmpleadoDAO;

public class EmpleadoServicio {
	private final EmpleadoDAO daoEmpleado;
	
	public EmpleadoServicio() {
		this.daoEmpleado = new EmpleadoDAO();
	}
	
	public void eliminarEmpleado(int id) {
		try {
			daoEmpleado.removerEmpleado(id);
			System.out.println("Se elimino el registro de la tabla.");
			
		} catch (IllegalArgumentException e) {
			System.out.println("El ID no se encuentra en la tabla.");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problemas al eliminar la BD.");
		}
	}
}

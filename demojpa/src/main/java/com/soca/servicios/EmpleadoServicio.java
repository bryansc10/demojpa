package com.soca.servicios;

import java.util.List;

import com.soca.entidades.Cliente;
import com.soca.entidades.Empleado;
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

	public void listarEmpleados() {
		try {
			List<Empleado> totalEmpleados = daoEmpleado.listarTodos();
			imprimirLista(totalEmpleados);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se realizo la consulta.");
		}
	}

	public void imprimirLista(List<Empleado> listaRecibida) {
		System.out.println("LISTA DE EMPLEADOS");
		System.out.printf("%-3s %-3s %-20s %-20s %-10s %-30s %-10s %-10s %-20s\n", "ID", "COD", "Nombre", "Apellido",
				"Extension", "Email", "OficinaID", "IDjefe", "Puesto");
		for (Empleado empleado : listaRecibida) {
			System.out.println(empleado.toString());
		}
	}
}

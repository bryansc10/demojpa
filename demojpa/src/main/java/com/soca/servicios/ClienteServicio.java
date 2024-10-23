package com.soca.servicios;

import java.util.List;

import com.soca.entidades.Cliente;
import com.soca.persistencia.ClienteDAO;

public class ClienteServicio {
	private final ClienteDAO daoCliente;

	public ClienteServicio() {
		this.daoCliente = new ClienteDAO();
	}

	public void crearCliente(int codigoCliente, String nombreCliente, String nombreContacto, String apellidoContacto,
			String telefono, String fax, String ciudad, String region, String pais, String codigoPostal, int idEmpleado,
			double limiteCredito) {
		try {
			Cliente clienteNuevo = new Cliente();
			
			clienteNuevo.setCodigo_cliente(codigoCliente);
			clienteNuevo.setNombre_cliente(nombreCliente);
			clienteNuevo.setNombre_contacto(nombreContacto);
			clienteNuevo.setApellido_contacto(apellidoContacto);
			clienteNuevo.setTelefono(telefono);
			clienteNuevo.setFax(fax);
			clienteNuevo.setCiudad(ciudad);
			clienteNuevo.setRegion(region);
			clienteNuevo.setPais(pais);
			clienteNuevo.setCodigo_postal(codigoPostal);
			clienteNuevo.setId_empleado(idEmpleado);
			
			daoCliente.guardarCliente(clienteNuevo);
			System.out.println("Se a creado el nuevo cliente.");
			
		} catch (Exception e) {
			System.out.println(e.toString() + "No se guardo el nuevo cliente de manera correcta");
		}
	}
	
	public void buscarCliente(int id) {
		try {
			Cliente clienteEncontrado = daoCliente.encontrarCliente(id);
			if (clienteEncontrado==null) {
				System.out.println("No se encontro el cliente.");
			}
			
			System.out.println(clienteEncontrado.toString());	
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString() + "Problemas al encontrar el cliente.");
		}
	}
	
	public void listarClientes() {
		try {
			List<Cliente> todosClientes = daoCliente.listarTodas();
			imprimirLista(todosClientes);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se realizo la solicitud.");
		}
	}
	
	public void imprimirLista(List<Cliente> listaRecibida) {
		for (Cliente cliente : listaRecibida) {
			System.out.printf("%s - %s - %s\n", cliente.getCodigo_cliente(), cliente.getNombre_contacto(), cliente.getLimite_credito());
		}
	}
}

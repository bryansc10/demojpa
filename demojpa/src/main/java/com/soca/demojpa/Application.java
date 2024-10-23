package com.soca.demojpa;

import com.soca.servicios.ClienteServicio;
import com.soca.servicios.EmpleadoServicio;
import com.soca.servicios.GamaProductoServicio;
import com.soca.servicios.OficinaServicio;
import com.soca.servicios.ProductoServicio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    public static void main(String[] args) {
    	// Crear la base de datos
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
        //EntityManager em = emf.createEntityManager();
    	
    	// Crear-buscar registros
    	//
    	//OficinaServicio oficinaServicio = new OficinaServicio();
    	//oficinaServicio.crearOficina("OFI01", "Mendoza", "Argentina", "Cuyo", "11111111", "CP5000");
    	//oficinaServicio.listarOficinas();
    	//
    	//GamaProductoServicio gamaProductoServicio = new GamaProductoServicio();
    	//gamaProductoServicio.crearGamaProducto("Ingreso gama", "Ingreso descripcion", "Ingreso HTML", "Ingreso imagen");
    	//gamaProductoServicio.buscarCliente(2);
    	//gamaProductoServicio.modificarGama(3, "Aromáticas");
    	//gamaProductoServicio.listarGama();
    	//
    	//ClienteServicio clienteServicio = new ClienteServicio();
    	//clienteServicio.crearCliente(100, "Dato1", "Dato2", "Dato3", "Dato4", "Dato5", "Dato6", "Dato7", "Dato8", "Dato9", 20, 2000.23);
    	//clienteServicio.buscarCliente(2);
    	//clienteServicio.listarClientes();
    	//
    	EmpleadoServicio empleadoServicio = new EmpleadoServicio();
    	//empleadoServicio.eliminarEmpleado(189);
    	empleadoServicio.listarEmpleados();
    	//
    	//ProductoServicio productoServicio = new ProductoServicio();
    	//productoServicio.listarProductos();
    }
}

package com.soca.persistencia;

import java.util.List;

import com.soca.entidades.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ClienteDAO {
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
	private final EntityManager em = emf.createEntityManager();
	
	public void guardarCliente(Cliente cliente) throws Exception {
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
	}
	
	public Cliente encontrarCliente(int id) throws Exception {
		Cliente cliente = em.find(Cliente.class, id);
		em.close();
		emf.close();
		
		return cliente;
	}
	
	public List<Cliente> listarTodas() throws Exception {
		return em.createQuery("SELECT c.codigo_cliente, c.nombre_contacto, c.limite_credito FROM Cliente c", Cliente.class).getResultList();
	}
}

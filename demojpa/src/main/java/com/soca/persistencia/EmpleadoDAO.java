package com.soca.persistencia;

import com.soca.entidades.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmpleadoDAO {
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
	private final EntityManager em = emf.createEntityManager();
	
	public void removerEmpleado(int id) throws Exception {
		Empleado empleado = em.find(Empleado.class, id);
		
		em.getTransaction().begin();
		em.remove(empleado);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}

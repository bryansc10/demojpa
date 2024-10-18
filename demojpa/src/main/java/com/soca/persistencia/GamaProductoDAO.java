package com.soca.persistencia;

import com.soca.entidades.GamaProducto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GamaProductoDAO {
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
	private final EntityManager em = emf.createEntityManager();
	
	public void guardarGamaProducto(GamaProducto gamaProducto) throws Exception {
		em.getTransaction().begin();
		em.persist(gamaProducto);
		em.getTransaction().commit();
	}
	
	public GamaProducto encontrarGamaProducto(int id) throws Exception {
		GamaProducto gamaProducto = em.find(GamaProducto.class, id);
		em.close();
		emf.close();
		
		return gamaProducto;
	}
	public void actualizarGama(int id, String gama) throws Exception {
		GamaProducto gamaProducto = em.find(GamaProducto.class, id);
		
		gamaProducto.setGama(gama);
		em.getTransaction().begin();
		em.merge(gamaProducto);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}

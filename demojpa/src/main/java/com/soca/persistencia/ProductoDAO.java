package com.soca.persistencia;

import java.util.List;

import com.soca.entidades.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProductoDAO {
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
	private final EntityManager em = emf.createEntityManager();

	public List<Producto> listarTodos() throws Exception {
		return em.createQuery("SELECT p.id_producto, p.nombre, p.cantidad_en_stock, p.precio_venta FROM Producto p",
				Producto.class).getResultList();
	}
}

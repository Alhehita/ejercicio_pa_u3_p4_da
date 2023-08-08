package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.repository.modelo.dto.ProductoDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ProductoRepositoryImpl implements ProductoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
//	@Transactional(value = TxType.MANDATORY)
	public void ingresar(Producto producto) {
		this.entityManager.persist(producto);
	}

	@Override
//	@Transactional(value = TxType.MANDATORY)
	public void actualizar(Producto producto) {
		this.entityManager.merge(producto);
	}

	@Override
	public Producto seleccionarPorNombre(String nombre) {

		TypedQuery<Producto> query = this.entityManager
				.createQuery("SELECT p FROM Producto p WHERE p.nombre= :datoNombre ", Producto.class);
		query.setParameter("datoNombre", nombre);

		return query.getSingleResult();
	}

	@Override
	public List<ProductoDTO> seleccionarPorCantidad(Integer stock) {
		TypedQuery<ProductoDTO> query = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.repository.modelo.dto.ProductoDTO(p.cantidad) FROM Producto p",
				ProductoDTO.class);
		return query.getResultList();
	}

}

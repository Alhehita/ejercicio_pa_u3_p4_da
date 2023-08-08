package com.example.demo.repository;

import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class FacturaRepositoryImpl implements FacturaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Factura factura) {
		this.entityManager.persist(factura);
	}


	
}

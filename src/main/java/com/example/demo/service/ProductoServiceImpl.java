package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ProductoRepository;
import com.example.demo.repository.modelo.Producto;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	//@Transactional(value = TxType.MANDATORY)

	public void guardar(Producto producto) {
		Producto producto1 = new Producto();
		Integer stock = producto.getStock();

		 if (stock == null) {
			this.productoRepository.ingresar(producto);
		} else {
			Producto productoExistente = productoRepository.seleccionarPorNombre(producto.getNombre());
			if (productoExistente != null) {
				int nuevoStock = productoExistente.getStock() + stock;
				productoExistente.setStock(nuevoStock);
				productoRepository.actualizar(productoExistente);
				System.out.println("Stock actualizado para " + productoExistente.getNombre() + ": " + nuevoStock);
			} else {
				productoRepository.ingresar(producto);
			}
		}
	}
}

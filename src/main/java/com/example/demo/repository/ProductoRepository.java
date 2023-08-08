package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.repository.modelo.dto.ProductoDTO;


public interface ProductoRepository {
	
	public void ingresar(Producto producto);

	public void actualizar(Producto producto);

	public Producto seleccionarPorNombre(String nombre);
	
	public List<ProductoDTO> seleccionarPorCantidad(Integer stock);

}

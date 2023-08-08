package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.FacturaRepository;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.dto.ProductoDTO;

import ch.qos.logback.classic.Logger;

@Service
public class FacturaServiceImpl implements FacturaService {
	


	@Autowired
	private FacturaRepository facturaRepository;
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public void guardar(Factura factura) {
		this.facturaRepository.ingresar(factura);
	}

	@Override
	public Factura detallesFacturacion(LocalDate fecha, String ctgProducto, Integer cantProd) {
		// TODO Auto-generated method stub
		
		return null;
	}

	public void generarFactura(String codBarras, Integer cantidad, String cedCliente) {
		ProductoDTO producto = new ProductoDTO();
		List<ProductoDTO> productos = productoRepository.seleccionarPorCantidad(cantidad);

		if(productos == null) {
			
			
			
		} else {
			
			
		}
	}
}

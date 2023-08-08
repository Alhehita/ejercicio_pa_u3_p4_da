package com.example.demo.service;

import java.time.LocalDate;

import com.example.demo.repository.modelo.Factura;

public interface FacturaService {

	public void guardar(Factura factura);
	
	public Factura detallesFacturacion(LocalDate fecha, String ctgProducto, Integer cantProd);
}

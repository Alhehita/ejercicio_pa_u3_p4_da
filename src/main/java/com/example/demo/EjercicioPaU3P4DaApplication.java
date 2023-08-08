package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.ProductoService;

@SpringBootApplication
public class EjercicioPaU3P4DaApplication implements CommandLineRunner {

	@Autowired
	private ProductoService productoService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4DaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Producto producto = new Producto();
		Producto producto2 = new Producto();
		Producto producto3 = new Producto();

		producto.setCategoria("Embutidos");
		producto.setCodBarras("12bh564j");
		producto.setNombre("Salchichas");
		producto.setPrecio(new BigDecimal(1.5));
		producto.setStock(5);

		producto2.setCategoria("Leche");
		producto2.setCodBarras("12bhu66j");
		producto2.setNombre("Vita Leche");
		producto2.setPrecio(new BigDecimal(2.8));
		producto2.setStock(5);

		producto3.setCategoria("jjh");
		producto3.setCodBarras("45ttt");
		producto3.setNombre("salsa");
		producto3.setPrecio(new BigDecimal(1.5));
		producto3.setStock(5);

		this.productoService.guardar(producto);
		this.productoService.guardar(producto);

		this.productoService.guardar(producto2);
		this.productoService.guardar(producto2);

	}

}

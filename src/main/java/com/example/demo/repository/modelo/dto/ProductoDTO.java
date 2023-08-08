package com.example.demo.repository.modelo.dto;

public class ProductoDTO {

	private String codBarras;

	private Integer cantidad;

	public ProductoDTO() {

	}

	public ProductoDTO(Integer cantidad) {
		super();

		this.cantidad = cantidad;
	}

	public ProductoDTO(String codBarras, Integer cantidad) {
		super();
		this.codBarras = codBarras;
		this.cantidad = cantidad;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ProductoDTO [codBarras=" + codBarras + ", cantidad=" + cantidad + "]";
	}

}

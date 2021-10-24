package br.edu.unidep.execpoo.models;


public abstract class Bebida {
	
	
	private String marca;
	private String unidadeMedida;
	private Double precoCompra;
	private Double precoVenda;
	
	public abstract double calcularValorVenda();
	
	public Bebida() {
	}

	public Bebida(String marca, String unidadeMedida, Double precoCompra, Double precoVenda) {
		this.marca = marca;
		this.unidadeMedida = unidadeMedida;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public String toString() {
		return "Marca: " + marca + "\nUnidade de Medida: " + unidadeMedida + "\nPreço de Compra R$: " + precoCompra + "\nPreço de Venda: " + precoVenda;
	}
}

package br.edu.unidep.execpoo.models;

import br.edu.unidep.execpoo.interfaces.Imposto;
import br.edu.unidep.execpoo.util.TaxaImposto;

public class Queijo implements Imposto{
	
	private String marca;
	private String tipo;
	private Double precoCompra;
	private Double precoVenda;
	
	public Queijo() {
	}

	public Queijo(String marca, String tipo, Double precoCompra, Double precoVenda) {
		this.marca = marca;
		this.tipo = tipo;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public Double getPrecovenda() {
		return precoVenda;
	}

	public void setPrecovenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

	@Override
	public double calcularFunFural() {
		return precoCompra * TaxaImposto.TAXA_IMPOSTO_FUNRURAL;
	}
	
	public String toString() {
		return "Marca: " + marca + "\nTipo: " + tipo + "\nPreço de Compra R$: " + precoCompra + "\nPreço de Venda; " + precoVenda + "\nValor Funrural R$: " + calcularFunFural();
	}
}


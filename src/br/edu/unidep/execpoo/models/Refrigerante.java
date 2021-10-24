package br.edu.unidep.execpoo.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.edu.unidep.execpoo.exceptions.ValorInvalido;

public class Refrigerante extends Bebida { 
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public String sabor;
	private Date dataVencimento;
	
	public Refrigerante() {
	}
	
	public Refrigerante(String marca, String unidadeMedida, Double precoCompra, Double precoVenda, String sabor,
			Date dataVencimento) {
		super(marca, unidadeMedida, precoCompra, precoVenda);
		this.sabor = sabor;
		this.dataVencimento = dataVencimento;
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public double calcularValorVenda() {
		return getPrecoVenda() - getPrecoCompra();
	}
	
	public String mostrarValorVenda() {		
		double valorCalculado = calcularValorVenda();
		
		if (valorCalculado < getPrecoCompra() * 0.75) {
			throw new ValorInvalido("O valor de venda é abaixo do valor calculado");
		}
		else {
			return "Preço de Venda R$: " + valorCalculado;
		}
	}
	
	public String toString() {
		return super.toString() + "\nSabor: " + sabor + "\nData de Vencimento: " + sdf.format(dataVencimento);
	}
}

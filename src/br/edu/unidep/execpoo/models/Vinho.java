package br.edu.unidep.execpoo.models;

import br.edu.unidep.execpoo.exceptions.ValorInvalido;
import br.edu.unidep.execpoo.interfaces.Imposto;
import br.edu.unidep.execpoo.util.TaxaImposto;

public class Vinho extends Bebida implements Imposto{
	
	private Double teorAlcoolico;
	private Integer anoSafra;
	
	public Vinho() {
	}

	public Vinho(String marca, String unidadeMedida, Double precoCompra, Double precoVenda, Double teorAlcoolico,
			Integer anoSafra) {
		super(marca, unidadeMedida, precoCompra, precoVenda);
		this.teorAlcoolico = teorAlcoolico;
		this.anoSafra = anoSafra;
	}

	public Double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(Double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public Integer getAnoSafra() {
		return anoSafra;
	}

	public void setAnoSafra(Integer anoSafra) {
		this.anoSafra = anoSafra;
	}

	@Override
	public double calcularValorVenda() {
		return getPrecoVenda() - getPrecoCompra();
	}
	
	public String mostrarValorVenda() {		
		double valorCalculado = calcularValorVenda();
		
		if (valorCalculado < getPrecoCompra()) {
			throw new ValorInvalido("O valor de venda é abaixo do valor calculado");
		}
		else {
			return "Preço de Venda R$: " + valorCalculado;
		}
	}
	
	@Override
	public double calcularFunFural() {
		return getPrecoCompra() * TaxaImposto.TAXA_IMPOSTO_FUNRURAL;
	}
	
	public String toString() {
		return super.toString() + "\nTeor Alcoolico: " + teorAlcoolico + "\nAno de Safra: " + anoSafra;
	}

}
	

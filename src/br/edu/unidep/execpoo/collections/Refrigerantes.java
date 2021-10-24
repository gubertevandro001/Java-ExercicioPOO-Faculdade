package br.edu.unidep.execpoo.collections;

import java.util.ArrayList;
import java.util.List;

import br.edu.unidep.execpoo.models.Refrigerante;
import br.edu.unidep.execpoo.servicos.ServicoRelatorio;

public class Refrigerantes {
	
	static List<Refrigerante> refrigerantes = new ArrayList<>();
	
	
	public void adicionarRefrigerante(Refrigerante refrigerante) {
		refrigerantes.add(refrigerante);
	}
			
	public List<Refrigerante> getRefrigerantes() {
		return refrigerantes;
	}

	public void mostrarRefrigerantes() {
		if (refrigerantes.isEmpty()) {
			System.out.println("\nNenhum Refrigerante Cadastrado!");
		}
		else {
			for (Refrigerante refrigerante : refrigerantes) {
				System.out.println("\n");
				System.out.println(refrigerante);
		 }	
	   }
	}
  }

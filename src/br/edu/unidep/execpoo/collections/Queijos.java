package br.edu.unidep.execpoo.collections;

import java.util.ArrayList;
import java.util.List;

import br.edu.unidep.execpoo.models.Queijo;

public class Queijos {

	List<Queijo> queijos = new ArrayList<>();
	
	
	public void adicionarQueijo(Queijo queijo) {
		queijos.add(queijo);
	}
	
	public void mostrarQueijos() {
		if (queijos.isEmpty()) {
			System.out.println("\nNenhum Queijo Cadastrado!");
		}
		else {
			for (Queijo queijo : queijos) {
				System.out.println("\n");
				System.out.println(queijo);
		}
	  }
	}
  }

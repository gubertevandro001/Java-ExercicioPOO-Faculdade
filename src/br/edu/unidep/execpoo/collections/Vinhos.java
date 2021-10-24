package br.edu.unidep.execpoo.collections;

import java.util.ArrayList;
import java.util.List;

import br.edu.unidep.execpoo.models.Vinho;

public class Vinhos {
	
	static List<Vinho> vinhos = new ArrayList<>();
	
	
	public void adicionarVinho(Vinho vinho) {
		vinhos.add(vinho);
	}	
	
	public List<Vinho> getVinhos() {
		return vinhos;
	}
	
	public void mostrarVinhos() {
		if (vinhos.isEmpty()) {
			System.out.println("\nNenhum Vinho Cadastrado!");
		}
		else {
			for (Vinho vinho : vinhos) {
				System.out.println("\n");
				System.out.println(vinho);
		}
	  }
	}
  }

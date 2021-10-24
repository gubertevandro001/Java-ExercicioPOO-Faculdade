package br.edu.unidep.execpoo.collections;

import java.util.ArrayList;
import java.util.List;

import br.edu.unidep.execpoo.models.Bebida;

public class Bebidas {
	
	List<Bebida> bebidas = new ArrayList<>();
	
	public void adicionarBebida(Bebida bebida) {
		bebidas.add(bebida);
	}
	
	public List<Bebida> getBebidas() {
		return bebidas;
	}
	
	public void mostrarBebidas() {
		if (bebidas.isEmpty()) {
			System.out.println("\nNenhuma Bebida Cadastrada!");
		}
		else {
			for (Bebida bebida : bebidas) {
				System.out.println("\n");
				System.out.println(bebida);
		}
	  }
    }
  }

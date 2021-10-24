package br.edu.unidep.execpoo.servicos;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.unidep.execpoo.collections.Queijos;
import br.edu.unidep.execpoo.exceptions.ConversaoInvalida;
import br.edu.unidep.execpoo.models.Queijo;
import br.edu.unidep.execpoo.repositorios.RepositorioQueijo;

public class ControleQueijo implements RepositorioQueijo{
	
	Scanner sc = new Scanner(System.in);
	
	Queijos queijos = new Queijos();

	@Override
	public void cadastrarQueijo() {
		
		try {
			System.out.print("\nMarca: ");
			String marca = sc.next();
			sc.nextLine();
			System.out.println("Tipo: ");
			String tipo = sc.next();
			sc.nextLine();
			System.out.println("Preço de Compra R$: ");
			Double precoCompra = sc.nextDouble();
			System.out.println("Preço de Venda: ");
			Double precoVenda = sc.nextDouble();
			
			Queijo queijo = new Queijo(marca, tipo, precoCompra, precoVenda);
			
			queijos.adicionarQueijo(queijo);
			
			System.out.println("\nValor do Cálculo FUNFURAL R$: " + queijo.calcularFunFural());
			
		}
		catch (InputMismatchException e) {
			throw new ConversaoInvalida("Dados Inadequados!");
		}
	}

	@Override
	public void mostrarQueijo() {
		queijos.mostrarQueijos();
	}
	

}

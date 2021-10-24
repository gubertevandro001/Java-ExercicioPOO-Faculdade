package br.edu.unidep.execpoo.servicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import br.edu.unidep.execpoo.collections.Bebidas;
import br.edu.unidep.execpoo.collections.Vinhos;
import br.edu.unidep.execpoo.exceptions.ConversaoInvalida;
import br.edu.unidep.execpoo.models.Bebida;
import br.edu.unidep.execpoo.models.Vinho;
import br.edu.unidep.execpoo.repositorios.RepositorioVinho;

public class ControleVinho implements RepositorioVinho {
	
	Scanner sc = new Scanner(System.in);
	
	Vinhos vinhos = new Vinhos();
	Bebidas bebidas = new Bebidas();
	ServicoRelatorio servicoRelatorio = new ServicoRelatorio();

	@Override
	public void cadastrarVinho() {
		
		try {
			System.out.print("\nMarca: ");
			String marca = sc.next();
			sc.nextLine();
			System.out.print("Unidade de Medida: ");
			String unidadeMedida = sc.next();
			sc.nextLine();
			System.out.print("Preço de Compra R$: ");
			Double precoCompra = sc.nextDouble();
			System.out.print("Preço de Venda R$: ");
			Double precoVenda = sc.nextDouble();
			System.out.print("Teor Alcoolico: ");
			Double teorAlcoolico = sc.nextDouble();
			System.out.print("Ano da Safra: ");
			Integer anoSafra = sc.nextInt();
			
			Vinho vinho = new Vinho(marca, unidadeMedida, precoCompra, precoVenda, teorAlcoolico, anoSafra);
			vinhos.adicionarVinho(vinho);
			bebidas.adicionarBebida(vinho);
			
			System.out.println("\nValor do Cálculo FUNRURAL R$: " + vinho.calcularFunFural());
			System.out.println("\nValor do Cálculo de Venda R$: " + vinho.mostrarValorVenda());
			
		}
		catch (InputMismatchException e) {
			throw new ConversaoInvalida("Dados Inadequados!");
		}
	}

	@Override
	public void mostrarVinho() {
		bebidas.mostrarBebidas();
		}
	}


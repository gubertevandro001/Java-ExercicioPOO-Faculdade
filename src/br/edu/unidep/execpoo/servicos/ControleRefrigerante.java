package br.edu.unidep.execpoo.servicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.unidep.execpoo.collections.Bebidas;
import br.edu.unidep.execpoo.collections.Refrigerantes;
import br.edu.unidep.execpoo.collections.Vinhos;
import br.edu.unidep.execpoo.exceptions.ConversaoInvalida;
import br.edu.unidep.execpoo.exceptions.DataInvalida;
import br.edu.unidep.execpoo.models.Refrigerante;
import br.edu.unidep.execpoo.models.Vinho;
import br.edu.unidep.execpoo.repositorios.RepositorioRefrigerante;

public class ControleRefrigerante implements RepositorioRefrigerante {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
    Scanner sc = new Scanner(System.in);
	
	Refrigerantes refrigerantes = new Refrigerantes();
	Bebidas bebidas = new Bebidas();
	ServicoRelatorio servicoRelatorio = new ServicoRelatorio();

	@Override
	public void cadastrarRefrigerante() {
		
		try {		
  		        System.out.print("\nMarca: ");
			String marca = sc.next();
			sc.nextLine();
			System.out.println("Unidade de Medida: ");
			String unidadeMedida = sc.next();
			sc.nextLine();
			System.out.println("Preço de Compra R$: ");
			Double precoCompra = sc.nextDouble();
			System.out.println("Preço de Venda R$: ");
			Double precoVenda = sc.nextDouble();
			System.out.println("Sabor: ");
			String sabor = sc.next();
			sc.nextLine();
			System.out.println("Data de Vencimento (DD/MM/YYYY): ");
			Date dataVencimento = sdf.parse(sc.next());
			sc.nextLine();
			
			Refrigerante refrigerante = new Refrigerante(marca, unidadeMedida, precoCompra, precoVenda, sabor, dataVencimento);
			refrigerantes.adicionarRefrigerante(refrigerante);
			bebidas.adicionarBebida(refrigerante);
			
			System.out.println("\nValor do Cálculo de Venda R$: " + refrigerante.mostrarValorVenda());

		}
		catch (ParseException e) {
			throw new DataInvalida("Data fora dos padrões ou inválida!");
		}
		catch (InputMismatchException e) {
			throw new ConversaoInvalida("Dados Inadequados!");
		}
	}

	@Override
	public void mostrarRefrigerante() {
		bebidas.mostrarBebidas();
	}
}


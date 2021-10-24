package br.edu.unidep.execpoo.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.unidep.execpoo.exceptions.ConversaoInvalida;
import br.edu.unidep.execpoo.exceptions.OpcaoInvalida;
import br.edu.unidep.execpoo.servicos.ControleQueijo;
import br.edu.unidep.execpoo.servicos.ControleRefrigerante;
import br.edu.unidep.execpoo.servicos.ControleVinho;
import br.edu.unidep.execpoo.servicos.ServicoRelatorio;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	ControleVinho controleVinho = new ControleVinho();
	ControleRefrigerante controleRefrigerante = new ControleRefrigerante();
	ControleQueijo controleQueijo = new ControleQueijo();
	ServicoRelatorio servicoRelatorio = new ServicoRelatorio();
	
	public void menuPrincipal() {
		
		try {
			System.out.println("\n---Menu Principal---");
			System.out.print("\n1 - Entrar Menu Bebidas\n2 - Entrar Menu Queijo\n3 - Mostrar Relatório de Preços de Venda\n4 - Sair\nInforme: ");
			Integer opcao = sc.nextInt();
			
			switch(opcao) {
			
			    case 1:
			    	menuBebidas();
			    	break;
			    
			    case 2:
			    	menuQueijo();
			    	break;
			    	
			    case 3:
			    	servicoRelatorio.imprimeRelatorio();
			    	servicoRelatorio.mostrarRelatorio();
			    	menuPrincipal();
			    	break;
			    case 4:
			    	System.out.close();
			    	break;
			    
			    default:
			    	throw new OpcaoInvalida("Opção Inválida!");
			}
		}
		catch (InputMismatchException | ConversaoInvalida e) {
			System.out.println("Dados Inadequados!");
		}
	}
	
	public void menuBebidas() {
		
		try {
			System.out.println("\n---Menu de Bebidas---");
			System.out.print("\n1 - Vinhos\n2 - Refrigerantes\n3 - Menu Principal\n4 - Sair\n\nInforme: ");
			Integer opcao = sc.nextInt();
			
			switch(opcao) {
			
				case 1:
					menuVinho();
					break;
					
				case 2:
					menuRefrigerante();
					break;
					
				case 3:
					menuPrincipal();
					break;
				
				case 4:
					menuPrincipal();
					break;
					
				default:
					throw new OpcaoInvalida("Opção Inválida!");
			}
		}
		catch (InputMismatchException | ConversaoInvalida e) {
			System.out.println("Dados Inadequados!");
		}
	}
	
	public void menuVinho() {
		
		try {
			System.out.print("\n1 - Cadastrar\n2 - Mostrar Vinhos\n3 - Sair\n\nInforme: ");
			Integer opcao = sc.nextInt();
			
			switch (opcao) {
			
				case 1:
					controleVinho.cadastrarVinho();
					menuVinho();
					break;
				
				case 2:
					controleVinho.mostrarVinho();
					menuVinho();
					break;
				
				case 3:
					menuBebidas();
					break;
	
				default:
					throw new OpcaoInvalida("Opção Inválida!");
			}
		}
		catch (InputMismatchException | ConversaoInvalida e) {
			System.out.println("Dados Inadequados!");
		}
	}
	
	public void menuRefrigerante() {
		
		try {
			System.out.print("\n1 - Cadastrar\n2 - Mostrar Refrigerantes\n3 - Sair\n\nInforme: ");
			Integer opcao = sc.nextInt();
			
			switch (opcao) {
			
				case 1:
					controleRefrigerante.cadastrarRefrigerante();
					menuRefrigerante();
					break;
				
				case 2:
					controleRefrigerante.mostrarRefrigerante();
					menuRefrigerante();
					break;
	
				case 3:
					menuBebidas();
					break;
				
				default:
					throw new OpcaoInvalida("Opção Inválida!");
			}
		}
		catch (InputMismatchException | ConversaoInvalida e) {
			System.out.println("Dados Inadequados!");
		}
	}
	
	public void menuQueijo() {
		
		try {
			System.out.print("\n---Menu de Queijos---\n1 - Cadastrar\n2 - Mostrar Queijos\n3 - Sair\n\nInforme: ");
			Integer opcao = sc.nextInt();
			
			switch (opcao) {
			
				case 1:
					controleQueijo.cadastrarQueijo();
					menuQueijo();
					break;
				
				case 2:
					controleQueijo.mostrarQueijo();
					menuQueijo();
					break;
					
				case 3:
					menuPrincipal();
					break;
					
				default:
					throw new OpcaoInvalida("Opção Inválida!");
			}
		}
		catch (InputMismatchException | ConversaoInvalida e) {
			System.out.println("Dados Inadequados!");
		}
	}
}

package br.edu.unidep.execpoo.servicos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.unidep.execpoo.collections.Bebidas;
import br.edu.unidep.execpoo.collections.Refrigerantes;
import br.edu.unidep.execpoo.collections.Vinhos;
import br.edu.unidep.execpoo.models.Bebida;
import br.edu.unidep.execpoo.models.Refrigerante;
import br.edu.unidep.execpoo.models.Vinho;

public class ServicoRelatorio {
	
	static Vinhos vinhos = new Vinhos();
	static Refrigerantes refrigerantes = new Refrigerantes();
	
	List<String> valores = new ArrayList<>();
	
	public void imprimeRelatorio() {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\PerfLogs\\exercício_poo.txt", true))) {
			
			for (Vinho vinho : vinhos.getVinhos()) {
				bw.append(String.valueOf(vinho.calcularValorVenda() + "\n"));
			}
			
			vinhos.getVinhos().clear();
			
			for (Refrigerante refrigerante : refrigerantes.getRefrigerantes()) {
				bw.append(String.valueOf(refrigerante.calcularValorVenda() + "\n"));
			}
			
			refrigerantes.getRefrigerantes().clear();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void mostrarRelatorio() {
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\PerfLogs\\exercício_poo.txt"))) {
			
			String ler = br.readLine();
			
			while (ler != null) {
				valores.add(ler);
				ler = br.readLine();
			}
			
			System.out.println("\nRelatório de Preços Permitidos Para Venda:\n");
			for (String valor : valores) {
				System.out.println("-> R$: " + valor);
			}
			
			valores.clear();
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
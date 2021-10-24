package br.edu.unidep.execpoo.exceptions;

public class OpcaoInvalida extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public OpcaoInvalida(String mensagem) {
		super(mensagem);
	}
}

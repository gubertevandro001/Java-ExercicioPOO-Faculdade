package br.edu.unidep.execpoo.exceptions;

public class ConversaoInvalida extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ConversaoInvalida(String mensagem) {
		super(mensagem);
	}
}

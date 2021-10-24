package br.edu.unidep.execpoo.exceptions;

public class ValorInvalido extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ValorInvalido(String mensagem) {
		super(mensagem);
	}
}

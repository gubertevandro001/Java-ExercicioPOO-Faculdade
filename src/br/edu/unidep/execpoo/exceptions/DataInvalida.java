package br.edu.unidep.execpoo.exceptions;

public class DataInvalida extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public DataInvalida(String mensagem) {
		super(mensagem);
	}
}

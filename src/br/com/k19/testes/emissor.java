package br.com.k19.testes;

import java.io.PrintStream;

public class emissor {

	private PrintStream saida;
	
	public void emsissor(PrintStream saida){
		this.saida = saida;
	}
	
	public void envia(String mensagem){
		
		this.saida.println(mensagem);
	}
}

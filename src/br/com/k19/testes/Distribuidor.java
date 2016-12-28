package br.com.k19.testes;

import java.util.ArrayList;
import java.util.Collection;

public class Distribuidor {

	private Collection <emissor> emissores = new ArrayList<emissor>();
	
	public void adcionaEmissor(emissor emissor){
		this.emissores.add(emissor);
	}
	public void distribuiMensagem(String mensagem){
		for (emissor emissor : this.emissores) {
			emissor.envia(mensagem);
		}
	}
	
}

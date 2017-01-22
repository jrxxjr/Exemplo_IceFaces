package br.com.tidicas.bean.impl;

import br.com.tidicas.bean.Index;

/**
 * Classe que implementada a interface de geração de mensagens
 * @author Evaldo Junior
 *
 */
public class IndexImpl implements Index{
	private String mensagem; 
	
	public String getMensagem() {		
		return mensagem;
	}

	@Override
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;		
	}
	
 
}
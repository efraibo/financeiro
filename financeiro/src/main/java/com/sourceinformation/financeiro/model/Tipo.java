package com.sourceinformation.financeiro.model;

public enum Tipo {
	
	ENTRADA("Entrada"),
	SAIDA("Saída");
	
	private String descricao;
	
	private Tipo(String descricao) {
		this.descricao = descricao;		
	}
	
	public String getDescricao(){
		return descricao;
	}

}

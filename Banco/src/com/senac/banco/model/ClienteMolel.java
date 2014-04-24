package com.senac.banco.model;

public class ClienteMolel {

	private String nome;
	private ContaModel conta;

	public ClienteMolel(String nome, ContaModel conta) {
		this.nome = nome;
		this.conta = conta;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ContaModel getConta() {
		return this.conta;
	}

	public void setConta(ContaModel conta) {
		this.conta = conta;
	}
}
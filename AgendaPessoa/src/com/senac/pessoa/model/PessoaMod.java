package com.senac.pessoa.model;

public class PessoaMod {
	
	//Cria��o de atributos
	private String nome;
	private String Sobrenome;
	private String endereco;
	private String telefone;
	private String tipo;
	
	
	//M�todos get
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	//M�todos set
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome) {
		this.Sobrenome = sobrenome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
 
	
}

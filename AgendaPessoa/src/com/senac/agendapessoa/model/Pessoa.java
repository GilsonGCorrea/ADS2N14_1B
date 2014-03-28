package com.senac.agendapessoa.model;

public class Pessoa {
		//atributos    
	    private String nome;
	    private String telefone;
	    private String sexo;
	    private int idade;   
	    
	    // Métodos Get
	    
	    public String getNome(){
	        return nome;
	    }

	    public String getTelefone(){
	        return telefone;
	    }

	    public String getSexo(){
	        return sexo;
	    }
	    
	    public int getIdade(){
	        return idade;
	    }
	    

	    //  Métodos Set
	    
	    
	    public void setNome(String nome){
	        this.nome = nome;
	    }
	    
	    public void setTelefone(String telefone){
	        this.telefone = telefone;
	    }
	    
	    public void setSexo(String sexo){
	        this.sexo = sexo;
	    }
	    
	    public void setIdade(int idade){
	        this.idade = idade;
	    }
	    
	
}

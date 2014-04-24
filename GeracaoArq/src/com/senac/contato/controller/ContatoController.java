package com.senac.contato.controller;


import java.util.Random;

import com.senac.contato.model.contatoModel;

import com.senac.contato.view.contatoView;


public class contatoController {
	
	private contatoModel contato = new contatoModel();
	private contatoView view = new contatoView();
	Random geraRandom = new Random(); 

	
	public String gerarNome(){
		
		 int nomeAleatorio,sobrenomeAleatorio;  
         
	     String nomes [] = {"Michel","Marisa","Julia","Sofia","Lara","Maria","Joao","Pedro","Paulo","Mario","Joana","Homer","Bruno","Carlos","Eduardo","Breno","Mara","Douglas","Camila","Paula"};
	     String sobrenomes [] ={"Chagas","Knob","Gomes","Silva","Pereira","Oliveira","Sedano","Castro","Silveira","Java","Linux","Simpson","Kratos","Rene","Alves","Testa","Santos","Bros","Coimbra","Cotto"};
	     String nome = "";
	     String sobrenome = "";
	               
	     nomeAleatorio = geraRandom.nextInt(20);
	     sobrenomeAleatorio = geraRandom.nextInt(20);  
              
         nome = nomes[nomeAleatorio];
         sobrenome = sobrenomes[sobrenomeAleatorio]; 
		
	     return nome+" "+sobrenome;
	                
	}
	
	public String gerarEndereco(){
		
		 int enderecoAleatorio;  
        
	     String enderecos [] = {"Olavo Bilac","Marechal Floriano","Getulio Vargas","A","B","C","Sem saída","Sem saída","S","Das Grotas","das Paineiras","das Pedras"};
	                             
	     enderecoAleatorio = geraRandom.nextInt(12);
	                      
         return enderecos[enderecoAleatorio];
	                
	}
	
	public String gerarTipoTelefone(){
		
		 int tipoTelefoneAleatorio;  
       
	     String tipos [] = {"R","C","T"};
	                             
	     tipoTelefoneAleatorio = geraRandom.nextInt(3);
	                      
        return tipos[tipoTelefoneAleatorio];
	                
	}
	
	public String geraTelefone(){
		
		return (this.geraRandom.nextInt(1000-100)+100) + "-" + (this.geraRandom.nextInt(10000-1000)+1000);
		
	}
	
	public void gerarCadastro(){
		
		this.contato.setNome(this.gerarNome());
		this.contato.setEndereco(this.gerarEndereco());
		this.contato.setTelefone(this.geraTelefone());
		this.contato.setTipo(this.gerarTipoTelefone());
	
		view.imprimeContato(this.contato.getNome(), this.contato.getEndereco(), this.contato.getTelefone(), this.contato.getTipo());
		
	}

}
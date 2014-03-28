package com.senac.pessoa.controller;


import java.util.Random;

import com.senac.pessoa.model.PessoaMod;

import com.senac.pessoa.view.PessoaView;


public class PessoaContr {
	//Atributos Gerados
	private PessoaMod pessoa = new PessoaMod(); 
	private PessoaView view = new PessoaView();
	Random geraAleatorio = new Random(); 

	
	// M�todo de cria��o aleat�ria de nomes.
	public String gerarNome(){  
		
		 int nomeAleatorio,sobrenomeAleatorio;  
         
	     String nomes [] = {"Gilson","Janaina","Sthefany","Veronica","Aline","Valter","Daniel","Ivan","Pedro","Renata","Eloisa","Rubilar","Marilva","Susan","Marcos","Soraia","Lucas","Ramiro","Thiago","Marta"};
	     String sobrenomes [] ={"Correa","Silva","Borba","Fernandes","Rossin","Braga","Brum","Alves","Silveira","Jobim","Ribeiro","Cardoso","Duarte","Boile","Tupper","Maia","Queiroz","Barcelos","Iorc","Vivian"};
	     String nome = "";
	     String sobrenome = "";
	               
	     nomeAleatorio = geraAleatorio.nextInt(20);
	     sobrenomeAleatorio = geraAleatorio.nextInt(20);  
              
         nome = nomes[nomeAleatorio];
         sobrenome = sobrenomes[sobrenomeAleatorio]; 
		
	     return nome+" "+sobrenome;
	                
	}
	
	// M�todo de cria��o aleat�ria de logradouros.
	public String gerarLogradouros(){ 
		
		 int logAlt;  
        
	     String enderecos [] = {"Abelino Nicolau de Almeida","Don�rio Braga","Alba Garcia","Assis Brasil","�lvaro Chaves","Cel. Genu�no","Borges de Medeiros","Ipiranga","Jo�o Pessoa","Jos� do Patroc�nio","Lima e Silva","24 de outubro"};
	                             
	     logAlt = geraAleatorio.nextInt(12);
	                      
         return enderecos[logAlt];
	                
	}
	
	// M�todo de cria��o de tipos de telefones.
	public String gerarTipoFone(){   
		
		 int tipoTelefoneAleatorio;  
       
	     String tipos [] = {"Res.","Cel.","Com."};
	                             
	     tipoTelefoneAleatorio = geraAleatorio.nextInt(3);
	                      
        return tipos[tipoTelefoneAleatorio];
	                
	}
	
	// M�todo de cria��o de n�meros de telefones.
	public String geraFone(){ 
		
		return (this.geraAleatorio.nextInt(1000-100)+100) + "-" + (this.geraAleatorio.nextInt(10000-1000)+1000);
		
	}
	
	// M�todo de cria��o de lista com os resultados da agenda.
	public void gerarLista(){  
		
		this.pessoa.setNome(this.gerarNome());
		this.pessoa.setEndereco(this.gerarLogradouros());
		this.pessoa.setTelefone(this.geraFone());
		this.pessoa.setTipo(this.gerarTipoFone());
	
		view.imprimeCliente(this.pessoa.getNome(), this.pessoa.getEndereco(), this.pessoa.getTelefone(), this.pessoa.getTipo()); // 
		
	}

}
package com.senac.palindromo;

import java.util.Scanner;
import com.senac.pilha.Pilha;
import com.senac.view.View;

public class Palindromo {
	
	Pilha pilha = new Pilha();
	View view = new View();
	
	boolean controle = true;
	int tam;
	
	public void verificaPalindromo(){
		
		String palav = view.pegaPalavra();
		tam = palav.length();
	
		for(int i = 0; i < tam; i++){
			pilha.push(palav.charAt(i)); 
		}
		
		int i = 0;
		int j = tam -1;
	
		while(controle == true && i < tam &j > 0){
			if(pilha.vetor[i]==pilha.vetor[j]){
				i++;
				j--;
			}
			else
				controle = false;
			}
		}

	public void mostraResultado(){
		if(controle){
			
			view.simPalindromo();
			for(int k = 0; k < tam; k++){
				System.out.print(pilha.pop());
			}
		}
			else
		if(controle == false){
			
			view.naoPalindromo();
			for(int z = 0; z < tam; z++){
				
				System.out.print(pilha.pop());
			
			}
		
		}
	}

}





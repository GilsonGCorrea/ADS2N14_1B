package com.senac.decBin;

import com.senac.pilha.Pilha;
import com.senac.view.View;


public class DecimalBinario {
	Pilha pilha = new Pilha();
	View view = new View();
	
	String ent;
	
	public void numero(){
		
		int numero = view.pegaNumero();
		
		int cont = 0;
		
		while(numero > 0){
			int x = numero %2;
			ent = ""+x+"";
			pilha.push(ent);
			
			numero = numero / 2;
			cont = cont + 1;
		}
		
		for(int j = 0; j < cont; j++){
			System.out.print(pilha.pop());
		}
	}
	
}

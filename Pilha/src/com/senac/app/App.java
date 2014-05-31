package com.senac.app;
import com.senac.decBin.DecimalBinario;
import com.senac.palindromo.Palindromo;
import com.senac.view.View;



public class App {

	public static void main(String[] args) {
		
		View view = new View();
		Palindromo palindromo = new Palindromo();
		DecimalBinario decBin = new DecimalBinario();
		
		switch(view.menu()){
		case 1: palindromo.verificaPalindromo();
				palindromo.mostraResultado();
		break;
		case 2: decBin.numero();
		break;
		}
	}

}

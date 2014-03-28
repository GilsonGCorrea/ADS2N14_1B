package com.senac.pessoa.app;

import com.senac.pessoa.controller.PessoaContr;

public class PessoaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaContr pessoa = new PessoaContr();
		
		for(int i = 0; i < 50; i++){
		
			pessoa.gerarLista();
		}
	}

}
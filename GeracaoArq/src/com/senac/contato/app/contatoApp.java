package com.senac.contato.app;

import com.senac.contato.controller.contatoController;

public class contatoApp {

	public static void main(String[] args) {

		contatoController contato = new contatoController();
		
		for(int i = 0; i < 20; i++){
		
			contato.gerarCadastro();
		}
	}

}

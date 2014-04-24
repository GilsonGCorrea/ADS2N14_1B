package com.senac.banco.app;


import com.senac.banco.controller.ContaController;

public class BancoApp {

	public static void main(String[] args) {
		
		ContaController controller = new ContaController();

		do {
			
			controller.iniciaSistema();
		
		} while (true);
	}
}
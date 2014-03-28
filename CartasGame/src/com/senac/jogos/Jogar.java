package com.senac.jogos;

import com.senac.jogos.controller.JogoController;

public class Jogar {
    public static void main(String[] args) {
        JogoController controller = new JogoController();
        controller.iniciarJogo();
        do {    
            controller.jogada();
        } while(controller.verificarSeTemCarta());
        controller.informaGanhador();
    }
    
}

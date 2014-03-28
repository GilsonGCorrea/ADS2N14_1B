package com.senac.jogos.view;

import java.util.Scanner;
import static java.lang.System.*;

public class JogoView {
    private static Scanner teclado = new Scanner(System.in);
    
    public String lerComando() {
        return teclado.nextLine();
    }
    
    public void imprimirCartaMesa(String cartaMesa) {
        out.println("Carta na mesa: " + cartaMesa);
    }

    public void imprimirSelecionarComando(int posicao) {
        out.print(String.format("Jogador %d. Digite 'jogar' ou 'pular': ", posicao));
    }

    public void imprimirCartaJogador(String cartaJogador) {
        out.println("Carta do jogador: " + cartaJogador);
        out.println("---------------------------------");
    }

    public void imprimirPontosJogador(String pontosJogador) {
        out.println("Pontos do Jogador: " + pontosJogador);
        
    }
    
    public void imprimirMensagemComandoRepetido() {
        out.println("Voce nao pode pular outra vez");
        out.println("---------------------------------");
    }
    
    public void imprimirGanhador(int posicao, int pontos) {
        out.println(String.format("O ganhador foi o jogador %d com %d ponto(s)", posicao, pontos));
    }
}

package com.senac.jogos.controller;

import com.senac.jogos.cartas.Carta;
import com.senac.jogos.model.MatchingCardGame;
import com.senac.jogos.view.JogoView;


public class JogoController {

    private MatchingCardGame jogo;
    private Carta cartaJogador;
    private JogoView view;
    
    private int jogadorDaVez = 0;
	
    public JogoController()	{
        jogo = new MatchingCardGame();
        view = new JogoView();
        cartaJogador = null;
    }
    
    public void setPosicaoJogador(int posicao) {
        if(posicao >= jogo.getNumeroJogadores() || posicao < 0) {
        	jogadorDaVez = 0;
        } else {
        	jogadorDaVez = posicao;
        }
    }
    
    public void iniciarJogo() {
        view.imprimirCartaMesa(showMesa());
    }

    public boolean verificarSeTemCarta() {
        return jogo.verificarSeTemCarta();
    }

    public void jogada() {
        view.imprimirSelecionarComando(jogadorDaVez+1);
        String comando = view.lerComando();
        if(executarComandoJogador(comando)) {
            if(cartaJogador != null) {
                view.imprimirCartaJogador(showCarta(cartaJogador));
            }
            view.imprimirPontosJogador(showJogador());
            setPosicaoJogador(jogadorDaVez+1);
        } else {
            view.imprimirMensagemComandoRepetido();
        }
    }

    public void pularVezJogador() {
        jogo.getJogador(jogadorDaVez).subtractPontos(2);
    }

    public void playTurno() {
        int pontos = jogo.matchCarta(cartaJogador);
        jogo.getJogador(jogadorDaVez).addPontos(pontos);
        jogo.setMesa(cartaJogador);
    }
    
    public String showJogador() {
        return String.format("%d", jogo.getJogador(jogadorDaVez).getPontos());
    }
	
    private String showCarta(Carta carta) {
        return String.format("%d%c", carta.getValor(), carta.getNaipe());
    }

    public String showMesa() {
        return showCarta(jogo.getMesa());
    }
	
    public void setCartaJogador() {
        cartaJogador = jogo.drawCarta();
        playTurno();
    }

    public boolean executarComandoJogador(String comando) {
        comando = comando.equalsIgnoreCase("JOGAR") ? "JOGAR" : "PULAR";
        
        
        if(comando.equals("PULAR") && jogo.getJogador(jogadorDaVez).getUltimoComando().equals("PULAR")) {
            return false;
        } else if(comando.equalsIgnoreCase("JOGAR")) {
            this.setCartaJogador();
        } else {
            this.pularVezJogador();
        }
        jogo.getJogador(jogadorDaVez).setUltimoComando(comando);
        return true;
    }
    
    public void informaGanhador() {
        int[] vencedor = jogo.getVencedor();
        view.imprimirGanhador((vencedor[0]+1), vencedor[1]);
    }
            
}

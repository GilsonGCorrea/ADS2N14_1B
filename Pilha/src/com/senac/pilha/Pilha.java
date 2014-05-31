package com.senac.pilha;

public class Pilha {
	
	public Object[] vetor;
	public int i;
	
	
	public Pilha(){
		this.i = -1;
		this.vetor =  new Object[10000];
	}

	public boolean vazio(){
		if(this.i == -1){
			return true;
		}
		return false;
	}

	public int tamanho(){
		if(this.vazio()){
			return 0;
		}
		return this.i +1;
	}

	public Object topo(){
		if(this.vazio()){
			return null;
		}
		return this.vetor[this.i];
	}

	public Object pop(){
		if(this.vazio()){
			return null;
		}
		return this.vetor[this.i--];
	}

	public void push(Object valor){
		if(this.i < this.vetor.length - 1){
			this.vetor[++i] = valor;
		}
	}

}

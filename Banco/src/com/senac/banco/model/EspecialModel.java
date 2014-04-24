package com.senac.banco.model;

import com.senac.banco.exception.SaldoInsuficienteException;

public class EspecialModel extends ContaModel {

	private double limite;
	
	public EspecialModel(int numConta, double saldo, double limite) {
		super(numConta, saldo);
		this.limite = limite;
		
		// TODO Auto-generated constructor stub
		
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacar(double valorSaque) throws SaldoInsuficienteException {
		double limiteSaque = this.getSaldo() + this.getLimite();

		if (valorSaque > limiteSaque) {
			throw new SaldoInsuficienteException();
		}

		super.setSaldo(this.getSaldo() - valorSaque);
	}
}
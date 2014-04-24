package com.senac.banco.model;

import java.sql.Date;

public class InvestimentoModel extends ContaModel {

	private int dataCriacao;

	public InvestimentoModel(int numConta, double saldo) {
		super(numConta, saldo);
		this.setDataCriacao();
		
		// TODO Auto-generated constructor stub
		
	}

	public int getDataCriacao() {
		return this.dataCriacao;
	}

	public void setDataCriacao() {
		Date data = new Date(System.currentTimeMillis());
		
		String dataStr = data.toString();
		dataStr = dataStr.replaceAll("[^\\d.]", "");

		this.dataCriacao = Integer.parseInt(dataStr);
	}

	public void dividendos(double taxa) {
		double acrescimo = super.getSaldo() * (taxa/100);

		super.setSaldo(super.getSaldo() + acrescimo);
	}
}

package com.senac.banco.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.senac.banco.exception.SaldoInsuficienteException;
import com.senac.banco.model.ClienteMolel;
import com.senac.banco.model.ContaModel;
import com.senac.banco.model.EspecialModel;
import com.senac.banco.model.InvestimentoModel;

import com.senac.banco.view.SistemaView;

public class ContaController {
	SistemaView View;
	ClienteMolel cliente;

	public ContaController() {
		this.View = new SistemaView();
		cliente = null;
	}

	public void iniciaSistema() {
		String opcao = View.menuInicial();

		switch (opcao) {
			case "1":
				this.cadastrarConta();
				break;

			case "2":
				this.transacoesConta();
				break;

			case "S":
				View.encerrar();
				break;

			default:
				View.mensagemOpInvalida();
				break;
		}
	}

	public void cadastrarConta() {
		ContaModel conta = null;
		String nome = View.entrarNome();

		boolean continuar = true;
		
		do {
			String tipoConta = View.menuTipoConta();
			
			switch (tipoConta) {
				case "C":
					conta = this.cadastrarContaComum();
					continuar = false;
					break;

				case "E":
					conta = this.cadastrarContaEspecial();
					continuar = false;
					break;

				case "I":
					conta = this.cadastrarContaInvestimento();
					continuar = false;
					break;

				default:
					View.mensagemOpInvalida();
					break;
			}
		} while (continuar);

		this.cliente = new ClienteMolel(nome, conta);

		View.cadastroEfetuado(Integer.toString(this.cliente.getConta().getNumConta()),Integer.toString(this.cliente.getConta().getNumVerificacao()));
	}

	public ContaModel cadastrarContaComum() {
		int numConta = Integer.parseInt(View.entrarNumeroConta());
		double saldo = Double.parseDouble(View.entrarSaldo());

		ContaModel conta = new ContaModel(numConta, saldo);

		return conta;
	}

	public ContaModel cadastrarContaEspecial() {
		int numConta = Integer.parseInt(View.entrarNumeroConta());
		double saldo = Double.parseDouble(View.entrarSaldo());
		double limite = Double.parseDouble(View.entrarLimite());

		EspecialModel conta = new EspecialModel(numConta, saldo, limite);

		return conta;
	}

	public ContaModel cadastrarContaInvestimento() {
		int numConta = Integer.parseInt(View.entrarNumeroConta());
		double saldo = Double.parseDouble(View.entrarSaldo());

		InvestimentoModel conta = new InvestimentoModel(numConta, saldo);

		return conta;
	}

	public void transacoesConta() {
		if (this.cliente == null) {
			View.clienteNaoCadastrado();

			return;
		}

		String opcao = View.menuTransacoesConta();

		switch (opcao.toUpperCase()) {
			case "1":
				this.sacar();
				break;

			case "2":
				this.depositar();
				break;

			case "3":
				this.taxaDividendo();
				break;

			case "4":
				this.consultarSaldo();
				break;

			case "V":
				break;

			default:
				View.mensagemOpInvalida();
				break;
		}
	}

	public void sacar() {
		double valorSaque = Double.parseDouble(View.entrarValorSaque());

		try {
			
			this.cliente.getConta().sacar(valorSaque);
			View.saqueEfetuado();
			
		} catch (SaldoInsuficienteException sf) {
			
			View.saldoInsuficiente();
			
		} catch (Exception e) {
			
			System.out.print(e.getMessage());
			e.getStackTrace();
		}
	}

	public void depositar() {
		double valorDeposito = Double.parseDouble(View.entrarValorDeposito());

		try {
			
			this.cliente.getConta().depositar(valorDeposito);
			View.depositoEfetuado();
			
		} catch (Exception e) {
			
			System.out.print(e.getMessage());
			e.getStackTrace();
		}
	}

	public void taxaDividendo() {
		try {
			
			if (this.cliente.getConta() instanceof InvestimentoModel) {
				
				double taxaDividendo = Double.parseDouble(View.entrarTaxaDividendo());

				((InvestimentoModel) this.cliente.getConta()).dividendos(taxaDividendo);
				View.dividendoEfetuado();
			} else {
				
				View.operacaoInexistente();
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
			e.getStackTrace();
		}
	}

	public void consultarSaldo() {
		View.exibirSaldo(this.cliente.getNome(),this.cliente.getConta().getNumConta(),this.cliente.getConta().getNumVerificacao(),this.cliente.getConta().getSaldo());

		if (this.cliente.getConta() instanceof EspecialModel) {
			
			View.exibirLimite(((EspecialModel) this.cliente.getConta()).getLimite());
			
		} else if (this.cliente.getConta() instanceof InvestimentoModel) {
			
			try {
				
				Date dataNum;
				dataNum = new SimpleDateFormat("yyyyMMdd").parse(Integer.toString(((InvestimentoModel) this.cliente.getConta()).getDataCriacao()));
				String data = new SimpleDateFormat("dd/MM/yyyy").format(dataNum);
				View.exibirDataCriacao(data);
			
			} catch (Exception e) {}
		}
	}
}
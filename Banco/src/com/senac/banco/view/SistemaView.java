package com.senac.banco.view;

import static java.lang.System.out;
import static java.lang.System.err;
import java.util.Scanner;

public class SistemaView {
	private static Scanner ler = new Scanner(System.in);

	public void encerrar() {
		out.println("FIM!");

		System.exit(0);
	}

	public void mensagemOpInvalida() {
		err.println("Opção inválida...");
	}

	public String menuInicial() {
		out.println("Digite uma opção: "+"\n1 - Cadastar Conta"+"\n2 - Transações Conta"+"\nS - Sair");

		return ler.next();
	}

	public String entrarNome() {
		out.print("Nome: ");

		return ler.next();
	}

	public String menuTipoConta() {
		out.println("Digite uma opção para modalidade da conta: "+"\nC - Conta Comum"+"\nE - Conta Especial"+"\nI - Conta Investimento");

		return ler.next();
	}

	public String entrarNumeroConta() {
		out.print("Informe número da conta: ");

		return ler.next();
	}

	public String entrarSaldo() {
		out.print("Informe o saldo: ");

		return ler.next();
	}

	public String entrarLimite() {
		out.print("Informe o limite: ");

		return ler.next();
	}

	public void cadastroEfetuado(String numConta, String numVerificacao) {
		out.println("Cadastro da conta realizado com sucesso \nConta nº: " + numConta + "-" + numVerificacao);
	}

	public String menuTransacoesConta() {
		out.println("Digite a opção:"+"\n1 - Sacar"+"\n2 - Depositar"+"\n3 - Investimento"+"\n4 - Saldo"+"\nV - Voltar");

		return ler.next();
	}

	public String entrarValorSaque() {
		out.print("SAQUE - Informe o valor: ");

		return ler.next();
	}

	public void saqueEfetuado() {
		out.println("Saque realizado com sucesso");
	}

	public String entrarValorDeposito() {
		out.print("DEPOSITO - Informe o valor: ");

		return ler.next();
	}

	public void depositoEfetuado() {
		out.println("Deposito realizado com sucesso!");
	}

	public String entrarTaxaDividendo() {
		out.print("Informe a taxa: (%) ");

		return ler.next();
	}

	public void dividendoEfetuado() {
		out.println("Dividendo OK!");
	}

	public void exibirSaldo(String nome, int numConta, int numVerificacao, Double saldo) {
		out.println("Cliente: " + nome);
		out.println("Conta: " + numConta + "-" + numVerificacao);
		out.println(String.format("Saldo: %.2f", saldo));
	}

	public void exibirLimite(double limite) {
		out.println("Limite: " + String.format("Saldo: %.2f", limite));
	}

	public void exibirDataCriacao(String dataCriacao) {
		out.println("Data Cricação: " + dataCriacao);
	}

	public void saldoInsuficiente() {
		err.println("Saldo insuficiente.");
	}

	public void clienteNaoCadastrado() {
		err.println("Cliente não cadastrado.");
	}

	public void operacaoInexistente() {
		err.println("Operação invalida!!");
	}
}
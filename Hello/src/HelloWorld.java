import java.util.Scanner;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// criada variável ler  recebe o que for digitado no teclado;
		Scanner ler = new Scanner(System.in);
		
		//variável username, criada para receber o que for captado pela variável ler;
		String username;
		
		//exibe mensagem na tela solicitando que o susuário digite o nome;
		System.out.println("Digite seu nome:");
		
		//username recebe o que for digitado e captado pela varíavel ler;
		username = ler.next();
		
		// Exibe mensagem na tela;
		System.out.println("Hello "+username+"!!!");
		
	}

}

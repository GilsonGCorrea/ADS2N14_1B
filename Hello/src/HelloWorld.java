import java.util.Scanner;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// criada vari�vel ler  recebe o que for digitado no teclado;
		Scanner ler = new Scanner(System.in);
		
		//vari�vel username, criada para receber o que for captado pela vari�vel ler;
		String username;
		
		//exibe mensagem na tela solicitando que o susu�rio digite o nome;
		System.out.println("Digite seu nome:");
		
		//username recebe o que for digitado e captado pela var�avel ler;
		username = ler.next();
		
		// Exibe mensagem na tela;
		System.out.println("Hello "+username+"!!!");
		
	}

}

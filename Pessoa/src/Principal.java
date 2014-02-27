import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// aqui com a classe Scanner criamos a variavel capta que vai acumular os dados digitados no teclado	
		Scanner capta = new Scanner(System.in);

		// aqui criamos o nosso objeto pessoa
		Pessoa hum = new Pessoa();
		
		// aqui inicializo os m�todos que mandam mensagens pedindo a digita��o dos dados
		System.out.println("Informe seu nome: ");
		// aqui digo que a variavel nome recebe o que foi digitado no teclado pela variavel capta
		String nome = capta.next();

		//mensagem solicitando o sexo do usu�rio
		System.out.println("Entre com o Sexo: ");
		
		//metodo que verifica se o sexo � v�lido
		try{  
			String sexo = capta.next();
			hum.setSexo(sexo);
		}catch (Exception e){
			System.out.println(e.getMessage());
			return;
		}
		
		//mensagem solicitando a altura do usu�rio
		System.out.println("Entre com a altura: ");
		
		//metodo que verifica se a altura � v�lida
		try{
			double altura = capta.nextDouble();
			hum.setAltura(altura);
		}catch (Exception e){
			System.out.println(e.getMessage());
			return;
		}
		
		//mensagem solicitando a idade do usu�rio
		System.out.println("Informe seu idade: ");
		int idade = capta.nextInt();
		
		//mensagem solicitando a cor dos olhos do usu�rio
		System.out.println("Informe cor dos olhos: ");
		String corOlhos = capta.next();
		
		//mensagem solicitando a cor dos cabelos do usu�rio
		System.out.println("Informe cor cabelos: ");
		String corCabelos = capta.next();

		//metodos que passam a informa�ao digitada para a variavel da classe pessoa 
		hum.setNome(nome);
		hum.setIdade(idade);
		hum.setcorCabelos(corCabelos);
		hum.setCorOlhos(corOlhos);

		//mensagem exibindo todos os dados captados pelo teclado	
		System.out.println("Dados Informados");
		System.out.println("Nome: "+ hum.getNome());
		System.out.println("Idade: "+hum.getIdade()+" anos");
		System.out.println("Altura: "+hum.getAltura()+" m");
		System.out.println("Sexo: "+hum.getSexo());
		System.out.println("Cor dos Olhos: "+hum.getCorOlhos());
		System.out.println("Cor Cabelo: "+hum.getCorCabelos());
	}

}
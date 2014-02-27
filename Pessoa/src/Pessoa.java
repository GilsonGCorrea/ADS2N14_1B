public class Pessoa {

	private String nome;
	private double altura;
	private String sexo;
	private int idade;
	private String corOlhos;
	private String corCabelos;

	//inicialização dos metodos Getters and Setters	

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setaltura(double altura){
		this.altura = altura;
	}
		
	public String getSexo() {
		return sexo;
	}
	
	public void setsexo(String sexo){
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public String getCorOlhos() {
		return corOlhos;
	}

	public void setCorOlhos(String corOlhos){
		this.corOlhos = corOlhos;
	}

	public String getCorCabelos() {
		return corCabelos;
	}

	public void setcorCabelos(String corCabelos){
		this.corCabelos = corCabelos;
	}




	// metodo que verifica a altura para ver se a digitação foi feita corretamente

	public void setAltura(double altura) throws Exception {

		if (altura > 1 && altura <=2.20){

			this.altura = altura;

		}else{

		throw new Exception ("Altura Invalida");
		}
	}

	//metodo que verifica o sexo para ver se a digitação foi feita corretamente

	public void setSexo(String sexo) throws Exception {

		if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Masculino") ||
			sexo.equalsIgnoreCase("F")|| sexo.equalsIgnoreCase("Feminino")){

			this.sexo=sexo;

		}else{

		throw new Exception ("Opção invalida. Digite Feminino ou (F)/ Masculino ou (M)");
		}

	}

	
}
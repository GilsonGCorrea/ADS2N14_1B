package senac.com.Deserto;

public class Controller {

	private Deserto deserto = null;
	private Caminhao caminhao = null;
	private View view = null;
	
	public Controller(){
		this.deserto = new Deserto();
		this.caminhao = new Caminhao();
		this.view = new View();
	}
	
	public void jogar(){
		this.view.apresentacao();
		while(this.caminhao.getPosicao() != 9){
			String resp = this.view.exibirMenuInicial();
			this.tratarEntrada(resp);
			this.exibirStatus();
		}
		this.view.gameOver();
	}
	
	
	private void tratarEntrada(String resp){
		switch(resp){
			case "avancar":
				this.avancar();
				break;
			case "voltar":
				this.voltar();
				break;
			case "descarregar":
				this.descarregar();
				break;
			case "carregar":
				this.carregar();
				break;
			default:
				this.view.opcaoInvalida();
				break;
		}
	}
	
	
	private void avancar(){		
		try {
			this.caminhao.avancar();
		} catch (OutOfDesertException e) { 
			e.printStackTrace();
		}		
	}
	
	
	private void voltar(){
		try {
			this.caminhao.voltar();
		} catch (OutOfDesertException e) {
			e.printStackTrace();
		}
	}
	
	private void descarregar(){
		this.deserto.setValorNaPosicao(this.caminhao.getPosicao());
		try {
			this.caminhao.descarregar();
		} catch (OutOfGasException e) {
			e.printStackTrace();
		}
	}
	
	
	private void carregar(){
		int valor = this.deserto.getValorDaPosicao(this.caminhao.getPosicao());
		if(valor > 0){
			try {
				this.caminhao.carregar();
				this.deserto.retirarValorDaPosicao(this.caminhao.getPosicao());
			} catch (MaxOfGasException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void exibirStatus(){
		this.view.montaFichaStatus();
		this.view.statusCaminhaoPosicao(this.caminhao.getPosicao());
		this.view.statusCaminhaoCombustivel(this.caminhao.getQtdCombustivel());
		if(this.caminhao.getPosicao() == 0){
			this.view.statusDesertoCombustivelPosicaoInicial();
		}else{
		this.view.statusDesertoCombustivelPosicao(this.deserto.getValorDaPosicao(this.caminhao.getPosicao()));
		}
		this.view.montaFichaStatus();
	}
	
}



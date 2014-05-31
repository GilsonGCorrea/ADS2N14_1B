package senac.com.Deserto;
import senac.com.Deserto.DesertoException;
public class Caminhao {

	private int qtdCombustivel = 0;
	private int posicao;
	
	public Caminhao(){
		this.qtdCombustivel = 6;
		this.posicao = 0;
	}

	public int getQtdCombustivel() {
		return this.qtdCombustivel;
	}

	public int getPosicao() {
		return this.posicao;
	}

	public void avancar() throws DesertoException {
		if(this.posicao == 9){
			throw new DesertoException();
		}
		this.posicao++;
		this.qtdCombustivel--;
	}

	public void voltar() throws DesertoException{			
		if(this.posicao == 0){
			throw new DesertoException();
		}
		this.posicao--;		
		this.qtdCombustivel--;
		recarregarNaPosicaoInicial();
	}
		
	private void recarregarNaPosicaoInicial(){
		if(this.posicao == 0){
			this.qtdCombustivel = 6;
		}
	}
	
	public void descarregar() throws CombustivelException{
		if(this.qtdCombustivel == 0){
			throw new CombustivelException();
		}
		this.qtdCombustivel--;
	}
	
	
	public void carregar() throws LimiteCombException{
		if(this.qtdCombustivel == 6){
			throw new LimiteCombException();
		}
		this.qtdCombustivel++;
	}
}



package Interface;

public class FormaRadio implements Radio {

	private boolean ligado;
	private int vol=0;
	
	@Override
	public void ligar() {
		this.ligado=true;
		
	}

	@Override
	public void desligar() {
		this.ligado=false;
		
	}

	@Override
	public void maisVol() {
		this.vol++;
		
	}

	@Override
	public void menosVol() {
		this.vol--;
		
	}

	@Override
	public void trocarEstacao() {
		System.out.println("Trocando a estação do radio...");
		
	}
	
}

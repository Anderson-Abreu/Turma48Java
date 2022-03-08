package IntroducaoPOO;

public class Caneta {
	
	//ATRIBUTOS  => caracteristicas
	
	private String cor;
	private double ponta;
	private int carga;
	private boolean tampada;
	
	//METODO CONSTRUTOR
	
	public Caneta(String x, double y, int z)
	{
		this.cor=x;
		this.ponta=y;
		this.carga=z;
		this.tampada=true;
	}

	//METODOS => comportamentos
	
	public void escrever()
	{
		if (this.tampada==true)
			System.out.println("ERRO caneta tampada!!!");
		else
			System.out.println("Escrevendo...");
	}
	
	public void tampar()
	{
		this.tampada=true;
	}
	
	public void destampar()
	{
		this.tampada=false;
	}
	
	public void estado()
	{
		System.out.println("Cor: "+ this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Esta tampada? "+ this.tampada);
		System.out.println("A carga esta em "+this.carga+"%");
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean getTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public double getPonta() {
		return ponta;
	}
	
	//METODOS ACESSORES(GETTERS) E MODIFICADORES(SETTERS)
	
	
	
}

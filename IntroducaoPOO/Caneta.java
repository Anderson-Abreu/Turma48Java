package IntroducaoPOO;

public class Caneta {
	
	//ATRIBUTOS  => caracteristicas
	
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
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
}

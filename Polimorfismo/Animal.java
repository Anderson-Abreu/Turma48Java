package Polimorfismo;

public abstract class Animal {
	private String Cor;
	private double peso;

	public abstract void EmitirSom();
	
	public void locomover()
	{
		System.out.println("correndo...");
	}
	
}

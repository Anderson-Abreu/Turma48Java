package Heranca;

public class Professor extends Pessoa{

	private double salario;
	private String modulo;
	
	public void aumento(double aum)
	{
		this.salario=salario+aum;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	
	
	
}

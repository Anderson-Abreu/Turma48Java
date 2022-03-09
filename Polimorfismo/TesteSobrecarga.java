package Polimorfismo;

public class TesteSobrecarga {

	public void soma(int x, int y)//dois parametros do tipo int
	{
		System.out.println(x+y);
	}
	
	public void soma(int x, int y, int z)//3 parametros do tipo int
	{
		System.out.println(x+y+z);
	}
	
	public void soma(double x, double y)//dois parametros do tipo double
	{
		System.out.println(x+y);
	}
}

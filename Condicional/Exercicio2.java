package Condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int x,y,z,troca;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros: ");
		
		x=ler.nextInt();
		y=ler.nextInt();
		z=ler.nextInt();
		
		if(x>y)
		  {
			troca=y;
			y=x;
			x=troca;
		  }
		if(y>z)
		  {
			troca=z;
			z=y;
			y=troca;
		  }
		if(x>y)
		  {
			troca=y;
			y=x;
			x=troca;
		  }
		System.out.println(x+"\t"+y+"\t"+z);
	}

}

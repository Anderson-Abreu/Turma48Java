package Condicional;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		
		x=ler.nextInt();
		
		if (x<=12)
			System.out.println("crian�a");
		else if (x>12 && x<=21)
			System.out.println("adolecente");
		else 
			System.out.println("adulto");
		
		System.out.println("FIM DO PROGRAMA");
	}

}

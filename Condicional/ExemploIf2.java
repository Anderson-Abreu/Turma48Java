package Condicional;

import java.util.Scanner;

public class ExemploIf2 {

	public static void main(String[] args) {
		String x;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		x=ler.nextLine();
		
		if(x=="a" || x=="e" || x=="i" || x=="o" || x=="u")
			System.out.println("Vogal");
		else
			System.out.println("Consoante");

	}

}

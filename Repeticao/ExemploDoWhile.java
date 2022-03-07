package Repeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		double n1,n2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		n1=ler.nextDouble();
		
		System.out.println("Digite o numero que ira dividir: ");
		n2=ler.nextDouble();
		
		do
		{
			System.out.println("A divisao é: "+ n1/n2);
			System.out.println("Digite um numero: ");
			n1=ler.nextDouble();	
			System.out.println("Digite o numero que ira dividir: ");
			n2=ler.nextDouble();
		}while(n2>0);
		
		System.out.println("FIM DO PROGRAMA");
	}

}

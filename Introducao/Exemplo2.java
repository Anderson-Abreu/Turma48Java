package Introducao;

import java.util.Scanner;

/*
 +
 -
 *
 /
 %
 */

public class Exemplo2 {

	public static void main(String[] args) {
		
	double n1, n2, soma, media;
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Digite o primeiro numero: ");
	n1=ler.nextDouble();
	System.out.println("Digite o segundo numero: ");
	n2=ler.nextDouble();
	
	soma=n1+n2;
	media=soma/2;
	
	System.out.println("A soma é: "+soma+"\n A media é: "+media);
	}

}

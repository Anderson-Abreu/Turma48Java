package Erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1, n2;
		
		try {
			System.out.println("Digite um numero: ");
			n1=ler.nextInt();
			System.out.println("Digite um numero: ");
			n2=ler.nextInt();
			System.out.println(n1/n2);
		}catch (ArithmeticException erro) {
			System.out.println("Não é possível dividir por ZERO!!! "+ erro);
		}catch (InputMismatchException erro) {
			System.out.println("Só pode digitar valores inteiros!!!"+erro);
		}
		
		System.out.println("FIM DO PROGRAMA");
		
	

	}

}

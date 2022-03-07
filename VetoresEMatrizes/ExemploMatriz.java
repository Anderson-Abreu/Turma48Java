package VetoresEMatrizes;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		Scanner ler = new Scanner(System.in);
		
	/*	for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.println("Digite um numero:");
				mat[linha][coluna]=ler.nextInt();
			}
		}*/
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.print(mat[linha][coluna]+"\t");
			}
			System.out.println();
		}
	}

}

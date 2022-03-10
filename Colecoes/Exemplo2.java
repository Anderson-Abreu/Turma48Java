package Colecoes;

import java.util.ArrayList;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("laços", 40);
		Aula a2 = new Aula("POO", 90);
		Aula a3 = new Aula("Herança", 60);
		
		ArrayList<Aula> curso = new ArrayList<>();
		
		System.out.println(curso);
		
		curso.add(a1);
		curso.add(a2);
		curso.add(a3);
		
		System.out.println(curso);

	}

}

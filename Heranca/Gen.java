package Heranca;

public class Gen {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno a1 = new Aluno();
		Professor prof1 = new Professor();
		ProfessorMatematica pm = new ProfessorMatematica();
		
		pm.
		
		p1.setNome("Luiz");
		a1.setNome("João");
		prof1.setNome("Maria");
		
		prof1.aumento(30);
		a1.entregarAtividade();
		

		System.out.println("O nome da pessoa é "+p1.getNome());
		System.out.println("O nome do aluno é "+a1.getNome());
		System.out.println("O nome do professor é "+prof1.getNome());
	}

}

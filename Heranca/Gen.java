package Heranca;

public class Gen {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno a1 = new Aluno();
		Professor prof1 = new Professor();
		ProfessorMatematica pm = new ProfessorMatematica();
		
		pm.
		
		p1.setNome("Luiz");
		a1.setNome("Jo�o");
		prof1.setNome("Maria");
		
		prof1.aumento(30);
		a1.entregarAtividade();
		

		System.out.println("O nome da pessoa � "+p1.getNome());
		System.out.println("O nome do aluno � "+a1.getNome());
		System.out.println("O nome do professor � "+prof1.getNome());
	}

}

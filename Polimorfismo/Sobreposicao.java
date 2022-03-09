package Polimorfismo;

public class Sobreposicao {

	public static void main(String[] args) {
		//Animal a = new Animal();
		Mamifero m = new Mamifero();
		Cavalo spirit = new Cavalo();
		Gato tom = new Gato();
		Cachorro toto = new Cachorro();
		
	//	a.EmitirSom();
		
		m.EmitirSom();
		spirit.EmitirSom();
		spirit.locomover();
		
		tom.EmitirSom();
		tom.locomover();
		
		toto.EmitirSom();
		toto.locomover();
	}

}

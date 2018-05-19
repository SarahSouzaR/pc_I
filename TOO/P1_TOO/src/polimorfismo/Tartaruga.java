package polimorfismo;

public class Tartaruga extends Réptil{
//Herança de terceiro nível, herda da classe Réptil

	//Métodos herdados da classe Réptil com sobrescrita
	@Override
	public void locomover() {
		System.out.println("Andando bem devagar");
	}
}
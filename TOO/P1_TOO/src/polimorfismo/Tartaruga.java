package polimorfismo;

public class Tartaruga extends R�ptil{
//Heran�a de terceiro n�vel, herda da classe R�ptil

	//M�todos herdados da classe R�ptil com sobrescrita
	@Override
	public void locomover() {
		System.out.println("Andando bem devagar");
	}
}
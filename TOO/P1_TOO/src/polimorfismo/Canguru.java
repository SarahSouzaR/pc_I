package polimorfismo;

public class Canguru extends Mam�fero {
//Heran�a de terceiro n�vel, herda da classe Mam�fero

	//m�todo pr�prio do canguru
	public void usarBolsa() {
		System.out.println("Usando a  bolsa");
	}

	//m�todo de sobreposi��o, herdado da classe Mam�fero
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
}
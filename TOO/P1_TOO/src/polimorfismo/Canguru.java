package polimorfismo;

public class Canguru extends Mamífero {
//Herança de terceiro nível, herda da classe Mamífero

	//método próprio do canguru
	public void usarBolsa() {
		System.out.println("Usando a  bolsa");
	}

	//método de sobreposição, herdado da classe Mamífero
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
}
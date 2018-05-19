package polimorfismo;

public class Peixe extends Animal{
//Heran�a de segundo n�vel, herda da classe abstrata Animal

	private String corEscama;
	
	//m�todos herdados da classe Animal com sobrescrita
	@Override
	public void locomover() {
		System.out.println("Nadando");		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo subst�ncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe n�o faz som");
	}

	//m�todo pr�prio do peixe
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}

	//Encapsulamento
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}	
}
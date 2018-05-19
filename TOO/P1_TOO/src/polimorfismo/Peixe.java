package polimorfismo;

public class Peixe extends Animal{
//Herança de segundo nível, herda da classe abstrata Animal

	private String corEscama;
	
	//métodos herdados da classe Animal com sobrescrita
	@Override
	public void locomover() {
		System.out.println("Nadando");		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}

	//método próprio do peixe
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
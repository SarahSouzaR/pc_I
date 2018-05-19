package polimorfismo;

public class Réptil extends Animal{
//Herança de segundo nível, herda da classe abstrata Animal
	
	private String corEscama;

	//métodos herdados da classe Animal com sobrescrita
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de réptil");
	}

	//Encapsulamento
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
package polimorfismo;

public class R�ptil extends Animal{
//Heran�a de segundo n�vel, herda da classe abstrata Animal
	
	private String corEscama;

	//m�todos herdados da classe Animal com sobrescrita
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
		System.out.println("Som de r�ptil");
	}

	//Encapsulamento
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
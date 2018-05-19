package polimorfismo;

public class Ave extends Animal{
//Heran�a de segundo n�vel, herda da classe abstrata Animal
	
	private String corPena;
	
	//M�todos herdados da classe Animal com sobrescrita
	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som da ave");
	}
	
	//m�todo pr�prio das aves
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}

	//Encapsulamento
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}
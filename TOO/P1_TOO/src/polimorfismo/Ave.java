package polimorfismo;

public class Ave extends Animal{
//Herança de segundo nível, herda da classe abstrata Animal
	
	private String corPena;
	
	//Métodos herdados da classe Animal com sobrescrita
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
	
	//método próprio das aves
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
package polimorfismo;

public class Mam�fero extends Animal {
//Heran�a de segundo n�vel, herda da classe abstrata Animal
	
	private String corPelo;
	
	/* Exemplo de um Construtor, onde definimos dentro dele o peso,
	idade e membros do mam�fero */
	public Mam�fero() {
		this.setPeso(85.3);
		this.setIdade(2);
		this.setMembros(4);
	}

	/*m�todos herdados da classe Animal com sobrescrita/sobreposi��o
	que s�o m�todos com a mesma assinatura em classes diferentes */
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som de mam�fero");
	}
	
	//Encapsulamento
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
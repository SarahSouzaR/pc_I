package polimorfismo;

public class Mamífero extends Animal {
//Herança de segundo nível, herda da classe abstrata Animal
	
	private String corPelo;
	
	/* Exemplo de um Construtor, onde definimos dentro dele o peso,
	idade e membros do mamífero */
	public Mamífero() {
		this.setPeso(85.3);
		this.setIdade(2);
		this.setMembros(4);
	}

	/*métodos herdados da classe Animal com sobrescrita/sobreposição
	que são métodos com a mesma assinatura em classes diferentes */
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
		System.out.println("Som de mamífero");
	}
	
	//Encapsulamento
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
package polimorfismo;

public abstract class Animal {
//classe abstrata, só possui métodos abstratos. Não é possível transformá-la em um objeto
	
	protected double peso;
	protected int idade, membros;
	
	//criando os métodos abstratos
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
		
	//fazendo o encapsulamento, criando os getters e setters
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}	
}
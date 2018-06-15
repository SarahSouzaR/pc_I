package aula2;

public class PessoaFisica extends Pessoa{

	private String nome;

	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void main (String args []) {
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setNome("Sarah");
		pessoa.getNome();
	}
}

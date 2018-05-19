package polimorfismo;

public class Principal {
/* classe com o m�todo est�tico main, onde s�o instanciados os objetos.
Chamamos os m�todos e eles retornam os valores de acordo
com a sobrescrita de cada animal/objeto */

	public static void main(String[] args) {
		Mam�fero m = new Mam�fero();
		R�ptil r = new R�ptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cachorro c1 = new Cachorro();
		
		/*instanciamos o objeto c1 da classe Cachorro,
		onde os resultados mostram o funcionamento do polimorfismo de sobrecarga*/
		c1.reagir("Ol�");
		c1.reagir("Vai apanhar");
		c1.reagir(11, 45);
		c1.reagir(20, 00);
		c1.reagir(true);
		c1.reagir(false);
		c1.reagir(2, 12.5);
		c1.reagir(17, 4.5);
				
		System.out.println("\n");
		
		/*nos pr�ximos objetos foram definidos os atributos de
		peso, idade e quantidade de membros de cada animal.
		Tamb�m foram chamados os m�todos locomover, alimentar e emitirSom.
		Em cada objeto � retornado um resultado diferente nestes m�todos,
		mostrando o funcionamento do polimorfismo de sobreposi��o.
		Nas classes que tinham m�todos pr�prios tamb�m foram chamados retornando os seus valores */
		
		c.setPeso(55.3);
		c.setIdade(3);
		c.setMembros(4);
		c.locomover();
		c.alimentar();
		c.usarBolsa();
		
		System.out.println("\n");
		
		k.setPeso(3.94);
		k.setIdade(5);
		k.setMembros(4);
		k.locomover();
		k.alimentar();
		k.emitirSom();
		k.abanarRabo();
		
		System.out.println("\n");
		
		m.getPeso();
		m.getIdade();
		m.getMembros();
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		System.out.println("\n");
		
		p.setPeso(0.35);
		p.setIdade(1);
		p.setMembros(0);
		p.locomover();
		p.alimentar();
		p.emitirSom();
		p.soltarBolha();
		
		System.out.println("\n");
		
		a.setPeso(0.89);
		a.setIdade(2);
		a.setMembros(2);
		a.locomover();
		a.alimentar();
		a.emitirSom();
		a.fazerNinho();
	}
}
package polimorfismo;

public class Cachorro extends Mamífero{
//Herança de terceiro nível, herda da classe Mamífero

	//método próprio do cachorro
	public void enterrarOsso() {
		System.out.println("Enterrando osso");
	}
	
	//método próprio do cachorro
	public void abanarRabo() {
		System.out.println("Abanando o rabo");
	}
	
	/*método reagir: sobrecarga de métodos,
	onde temos métodos com diferentes assinaturas na mesma classe */
	public void reagir(String frase) {
		if (frase.equals("toma comida") || frase.equals("Olá")) {
			System.out.println("Abanar e latir");
		}
		else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar");
		}
		else if (hora >= 18) {
			System.out.println("Ignorar");
		}
		else {
			System.out.println("Abanar e latir");
		}
	}
	
	public void reagir(boolean dono) {
		if (dono == true) {
			System.out.println("Abanar");
		}
		else {
			System.out.println("Rosnar e latir");
		}
	}
	
	public void reagir (int idade, double peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			}
			else {
				System.out.println("Latir");
			}
		}
		else {
			if (peso < 10) {
				System.out.println("Rosnar");
			}
			else {
				System.out.println("Ignorar");
			}
		}
	}
}
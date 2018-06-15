package aula;

public class CarroImportado extends Veiculo implements Carro{
	
	public static void acelerar() {
		System.out.println("Acelerando!!! Muito!!!");
	}
	
	public static void main (String args []) {
		CarroImportado carro = new CarroImportado();
		carro.acelerar();
		carro.setModelo("Ferrari");
	}

}
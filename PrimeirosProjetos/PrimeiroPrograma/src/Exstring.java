package Aula;

public class Exstring {

	public static void main (String args []){
		
		String str = "Isto � uma String do Java";
		String xyz = new String ("Isto � uma String do Java");
		
		if (str.equals(xyz)) {
		System.out.println("IGUAL");	}
		else System.out.println("DIFERENTE"); //maneira correta de comparar o conte�do das Strings
		
		System.out.println( "Tamanho da String: " + str.length());
		System.out.println( "SubStrin: " + str.substring(0, 10));
		System.out.println( "Caracter na posi��o 5: " + str.charAt(5) );
		
	}
}

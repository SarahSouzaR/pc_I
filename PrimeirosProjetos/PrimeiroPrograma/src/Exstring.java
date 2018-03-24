package Aula;

public class Exstring {

	public static void main (String args []){
		
		String str = "Isto é uma String do Java";
		String xyz = new String ("Isto é uma String do Java");
		
		if (str.equals(xyz)) {
		System.out.println("IGUAL");	}
		else System.out.println("DIFERENTE"); //maneira correta de comparar o conteúdo das Strings
		
		System.out.println( "Tamanho da String: " + str.length());
		System.out.println( "SubStrin: " + str.substring(0, 10));
		System.out.println( "Caracter na posição 5: " + str.charAt(5) );
		
	}
}

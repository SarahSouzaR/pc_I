package exercicios;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		
		//Exercício 3
		
		Scanner user = new Scanner(System.in);
		
		System.out.print("Tabuada do: ");
		int num = user.nextInt();
		
		for(int i = 0; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}

	}

}

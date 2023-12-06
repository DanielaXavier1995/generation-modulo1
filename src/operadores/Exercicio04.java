package operadores;

import java.util.Scanner;

class Exercicio04 {

	public static void main(String[] args) {
	   
Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero1: ");
		float n1 = sc.nextFloat();
		System.out.print("Numero2: ");
		float n2 = sc.nextFloat();
		System.out.print("Numero3: ");
		float n3 = sc.nextFloat();
		System.out.print("Numero4: ");
		float n4 = sc.nextFloat();
		
		float diferenca = n1*n2 - n3*n4;
		
		System.out.println(diferenca);
		
		sc.close();

	}
}

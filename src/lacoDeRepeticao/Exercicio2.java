package lacoDeRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int qPares = 0, qImpares = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print("Digite o " + i + "° número: ");
			int numero = sc.nextInt();
			
			if(numero%2 == 0) {
				qPares++;
			}else {
				qImpares++;
			}
		}
		
		System.out.println("\nTotal de números pares: " + qPares);
		System.out.println("\nTotal de números pares: " + qImpares);
		
		sc.close();

	}
}

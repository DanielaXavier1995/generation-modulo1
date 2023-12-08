package lacoDeRepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o 1° numero do intervalo: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o 1° numero do intervalo: ");
		int n2 = sc.nextInt();

		if (n1 < n2) {

			System.out.println("\nNo intervalo entre 10 e 100: ");
			System.out.println();

			for (int i = n1; i <= n2; i++) {
				
				if(i == 0) {
					continue;
				}
				
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é multiplo de 3 e 5");
				}
			}

		} else {
			System.out.println("\nIntervalo Inválido!");
		}
	}

}

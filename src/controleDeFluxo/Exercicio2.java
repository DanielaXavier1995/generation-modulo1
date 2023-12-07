package controleDeFluxo;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		int n = sc.nextInt();
		
		sc.close();
		
		int resto = n%2;
		
		if(resto == 0) {
			System.out.println((n > 0) ? "O Número " + n + " é PAR e POSITIVO!" : "O Número " + n + " é PAR e NEGATIVO!");
		} else {
			System.out.println((n > 0) ? "O Número " + n + " é ÍMPAR e POSITIVO!" : "O Número " + n + " é ÍMPAR e NEGATIVO!");
		}

	}

}

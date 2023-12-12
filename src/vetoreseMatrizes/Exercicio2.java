package vetoreseMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int [10];
		int par[] = new int [10];
		int impar[] = new int [10];
		int soma = 0;
		float media;
		
		//Entrada de dados no array
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "° numero: ");
			numeros[i] = sc.nextInt();
		}
		
		//Regras
		for(int i = 0; i < numeros.length; i++) {
			if(i%2 == 0) {
				par[i] = numeros[i];
			} else {
				impar[i] = numeros[i];
			}
			
			soma += numeros[i];
		}
		
		
		media = (float) soma/(numeros.length);
		
		
		System.out.print("Elementos nos índices ímpares: ");
		Arrays.stream(impar)
		      .filter(n -> n != 0)
		      .forEach(n -> System.out.print(n + " "));
		System.out.print("\nElementos pares: ");
		Arrays.stream(par)
	          .filter(n -> n != 0)
	          .forEach(n -> System.out.print(n + " "));
		System.out.println("\nSoma: " + soma);
		System.out.printf("\nMédia: %.2f", media);
		
		sc.close();
	}
}

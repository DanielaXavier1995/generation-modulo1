package vetoreseMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.print("Digite o número que voçê quer encontrar: ");
		int numero = sc.nextInt();
		
		Arrays.sort(vetor);
		
		System.out.println("***************");
		for(int v: vetor) {
			System.out.println(v);
		}
		System.out.println("***************");
		
		int posicao = Arrays.binarySearch(vetor, numero);
		
		if (posicao >= 0) {
		    System.out.println("O número 7 está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		sc.close();
	}
}

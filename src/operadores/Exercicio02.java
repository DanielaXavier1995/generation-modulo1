package operadores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a 1° nota: ");
		float nota1 = sc.nextFloat();
		System.out.print("Digite a 2° nota: ");
		float nota2 = sc.nextFloat();
		System.out.print("Digite a 3° nota: ");
		float nota3 = sc.nextFloat();
		System.out.print("Digite a 4° nota: ");
		float nota4 = sc.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Média final: %.1f", media);
		
		sc.close();
	}
}

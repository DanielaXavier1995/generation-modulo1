package lacoDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int n, soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		
		if (n > 0) {
			soma += n;
		}
			
		} while (n != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		sc.close();
		
	}
}

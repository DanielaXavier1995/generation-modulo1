package lacoDeRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade = 1, i = 0, n = 0;
		
		while(idade >= 0) {
			System.out.print("\nDigite a idade: ");
			idade = sc.nextInt();
			
			if(idade < 21) {
				i++;
			}
			
			if(idade > 50) {
				n++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + (i - 1));
		System.out.println("Total de pessoas maiores de 50 anos: " + n);
		
		sc.close();
	}

}

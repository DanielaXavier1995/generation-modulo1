package controleDeFluxo;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite A:");
		int a = sc.nextInt();
		System.out.print("Digite B:");
		int b = sc.nextInt();
		System.out.print("Digite C:");
		int c = sc.nextInt();
		
		sc.close();
		
		int soma = a + b;
		
		if(soma > c) {
			System.out.println(a + " + " + b + " = " + soma + " > " + c);
			System.out.println("A Soma de A + B é MAIOR do que C");
		} else if (soma < c) {
			System.out.println(a + " + " + b + " = " + soma + " < " + c);
			System.out.println("A Soma de A + B é MENOR do que C");
		} else {
			System.out.println(a + " + " + b + " = " + soma + " = " + c);
			System.out.println("A Soma de A + B é IGUAL a C");
		}
	}
}

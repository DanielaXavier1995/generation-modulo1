package controleDeFluxo;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("# ## ### #### ##### Menu #### ### ## # ");
		System.out.println("\n-- Soma 1  ");
		System.out.println("\n-- Subtração 2 ");
		System.out.println("\n-- Multiplicação 3 ");
		System.out.println("\n-- Divisão 4 ");
		System.out.println("\nDigite o 1° número: ");
		float n1 = sc.nextFloat();
		System.out.println("\nDigite o 2° número: ");
		float n2 = sc.nextFloat();
		System.out.println("\nOperação: ");
		int op = sc.nextInt();

		sc.close();
		
		switch (op) {
		case 1:
			float soma = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + soma);
			break;
		case 2:
			float subtracao = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + subtracao);
			break;
		case 3:
			float multiplicacao = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + multiplicacao);
			break;
		case 4:
			if(n2 != 0) {
			float divisao = n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + divisao);
			} else {
				System.out.println("Impossível a divisão por zero");
			}
			break;
		default:
			System.out.println("Opção inválida!");
			break;
			
		}
	}
}

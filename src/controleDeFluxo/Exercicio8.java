package controleDeFluxo;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		float saldo = 1000.0f;

		Scanner sc = new Scanner(System.in);

		System.out.println("# ## ### #### ##### Menu #### ### ## # ");
		System.out.println("\n-- Saldo 1  ");
		System.out.println("\n-- Saque 2 ");
		System.out.println("\n-- Depósito 3 ");
		System.out.println("# ## ### #### ############### ### ## # ");

		System.out.print("\nOperação: ");
		int op = sc.nextInt();
		System.out.print("\nValor: ");
		float valor = sc.nextFloat();
		
		sc.close();

		switch (op) {
		case 1:
			System.out.println("\nOperação - SALDO");
			System.out.println("\nSaldo: " + saldo);
			break;
		case 2:
			System.out.println("\nOperação - SAQUE");
			float resultado = saldo - valor;
			if(resultado == 0) {
			System.out.println("\nSaldo insuficiente!!");
			} else {
			System.out.println("\nNovo Saldo: " + (resultado));
			}
			break;
		case 3:
			System.out.println("\nOperação - DEPÓSITO");
			System.out.println("\nNovo Saldo: " + (saldo + valor));
			break;
		default:
			System.out.println("\nOpção inválida!");
			break;

		}

	}

}

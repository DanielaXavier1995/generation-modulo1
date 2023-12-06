package operadores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Salário: ");
		float salario = sc.nextFloat();
		
		System.out.print("Digite o Abono: ");
		float abono = sc.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.println(novoSalario);
		
		sc.close();	
	}
}

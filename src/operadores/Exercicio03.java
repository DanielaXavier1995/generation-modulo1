package operadores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o Salário Bruto: ");
		float salarioBruto = sc.nextFloat();
		System.out.println("Entre com o Adicional Noturno: ");
		float adicionalNoturno = sc.nextFloat();
		System.out.println("Entre com as Horas Extras: ");
		float horaExtra = sc.nextFloat();
		System.out.println("Entre com o Desconto: ");
		float desconto = sc.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra * 5) - desconto;
		
		System.out.println(salarioLiquido);
		
		sc.close();
	}
}

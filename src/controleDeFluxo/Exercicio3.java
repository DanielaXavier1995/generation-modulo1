package controleDeFluxo;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o NOME do doador:");
		String nome = sc.nextLine();
		System.out.print("Digite a IDADE do doador:");
		int idade = sc.nextInt();
		System.out.print("Primeira doação de sangue:");
		boolean primeiraDoacao = sc.nextBoolean();
		
		sc.close();
		
		if(idade >= 18 && idade <= 59) {
			System.out.printf("%s está APTO(A) para doar sangue!", nome);
		} else if ((idade >= 60 && idade <= 69) && primeiraDoacao == false) {
			System.out.printf("%s está APTO(A) para doar sangue!", nome);
		}else {
			System.out.printf("%s NÃO está APTO(A) para doar sangue!", nome);
		}
	
	}

}

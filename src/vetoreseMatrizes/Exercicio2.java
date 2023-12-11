package vetoreseMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int [3][3];
		
		//Populando a matriz:
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.print("posicao [" + linha + "] [" + coluna + "] :" );
				matriz[linha][coluna] = sc.nextInt();
			}
		}
		
		System.out.println("\n**************************");
		
		//Exibindo a diagonal principal:
		System.out.println("Elementos da diagonal principal: " + matriz[0][0] + "," + matriz[1][1] + "," + matriz[2][2]);
		
		System.out.println("\n**************************");
		
		// Exibindo a diagonal secundária:
		System.out.println("Elementos da diagonal secundária: " + matriz[0][2] + "," + matriz[1][1] + "," + matriz[2][0]);
		
		System.out.println("\n**************************");
		
		// Soma diagonal principal:
		System.out.println("Soma dos elementos da diagonal principal: " + (matriz[0][0] + matriz[1][1] + matriz[2][2]));
		
		System.out.println("\n**************************");
		
		// Soma diagonal secundaria:
		System.out.println("Soma dos elementos da diagonal secundaria: " + (matriz[0][2] + matriz[1][1] + matriz[2][0]));
		
		System.out.println("\n**************************");
		
		sc.close();
		
	}
}

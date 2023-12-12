package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int index = 0;
		
		List<Integer> numerosList = new ArrayList<Integer>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
		
		System.out.print("Digite o número que voçê deseja encontrar: ");
		int numero = sc.nextInt();
		
		//Pesquisando na Lista
		for(int i = 0; i < numerosList.size(); i++) {
			   index = numerosList.indexOf(numero);
		}
		
		//Verificando se item esta presente na lista;
		if(index > 0) {
			System.out.println("O número " + numero + " está localizado na posição: " + index);
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		sc.close();

	}

}

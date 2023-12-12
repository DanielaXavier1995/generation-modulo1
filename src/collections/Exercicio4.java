package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner (System.in);
        
       boolean resposta = false;
		
		Set<Integer> numerosSet = new HashSet<Integer>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
		
		System.out.print("Digite o número que voçê deseja encontrar: ");
		int numero = sc.nextInt();
		
		//Pesquisando na Lista
		for(int i = 0; i < numerosSet.size(); i++) {
			   resposta = numerosSet.contains(numero);
		}
		
		//Verificando se item esta presente na lista;
		if(resposta == true) {
			System.out.println("O número " + numero + " foi encontrado!");
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		sc.close();
	}
}

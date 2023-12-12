package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		Set<Integer> numerosSet = new HashSet<Integer>();
		
		//Inserindo Elementos:
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "° numero: ");
			numerosSet.add(sc.nextInt());
		}
		
		System.out.println("\n**********************************\n");
		System.out.println("Listar dados do Set: \n");
		
		//Percorrendo o set e mostrando os elementos:
		Iterator<Integer> iNumeros =  numerosSet.iterator();
		
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		sc.close();
	}
}

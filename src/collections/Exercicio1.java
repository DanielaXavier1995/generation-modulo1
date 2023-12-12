package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		List<String> coresList = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite a " + (i+1) + "° cor: ");
			coresList.add(sc.nextLine());
		}
		
		System.out.println("\n Lista de todas as cores: \n");
		
		for(String cores: coresList) {
			System.out.println(cores);
		}
		
		System.out.println("\n Ordenar Cores: \n");
		
		Collections.sort(coresList);
		
		for(String cores: coresList) {
			System.out.println(cores);
		}
		
		sc.close();
	}
}

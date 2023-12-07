package controleDeFluxo;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		String nome1 = sc.nextLine();
		String nome2 = sc.nextLine();
		String nome3= sc.nextLine();
		
		sc.close();
		
		if(nome1.equalsIgnoreCase("vertebrado")) {
			
			if (nome2.equalsIgnoreCase("ave")) {
				
				System.out.println((nome3.equalsIgnoreCase("carnivoro") ? "Águia" : "Pomba"));
				
			} else {
				
				System.out.println((nome3.equalsIgnoreCase("onivoro") ? "Homem" : "Vaca"));
				
			}
			
		}else if (nome1.equalsIgnoreCase("invertebrado")) {
			
			if (nome2.equalsIgnoreCase("inseto")) {
				
				System.out.println((nome3.equalsIgnoreCase("hematofago") ? "Pulga" : "Lagarta"));
				
			} else  {
				
				System.out.println((nome3.equalsIgnoreCase("hematofago") ? "Sanguessuga" : "Minhoca"));
				
			}
			
		}

	}

}

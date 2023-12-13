package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		Stack<String> pilhaLivros = new Stack<String>();
		
		int op = 1;
		
		System.out.println("********************************************************\n");
		
		System.out.println(" 1 - Adicionar um novo livro na pilha");
		System.out.println(" 2 - Listar todos os livros da Pilha");
		System.out.println(" 3 - Retirar um livro da pilha ");
		System.out.println(" 0 - O programa deve ser finalizado");
		
		System.out.println("\n********************************************************\n");
		
		do {
			System.out.print("\nEntre com a opção desejada: ");
			op = sc.nextInt();
			
			switch(op) {
			case 1:

				System.out.print("\nDigite o nome do cliente: ");
				sc.nextLine();
				pilhaLivros.push(sc.nextLine());
			
				System.out.println("\nPilha:\n");
				for(String pilha: pilhaLivros) {
					System.out.println(pilha);
				}
				
				System.out.println("\nLivro adicionado! \n");

				break;
			case 2:
				
				System.out.println("\nPilha:\n");
				
				for(String pilha: pilhaLivros) {
					System.out.println(pilha);
				}
				
				break;
			case 3:
				
				if(!pilhaLivros.isEmpty()) {
					pilhaLivros.pop();
					
					System.out.println("\nPilha:\n");	
					
				    for(String pilha: pilhaLivros) {
						System.out.println(pilha);
					}
				    
				    System.out.println("\nUm livro foi retirado da pilha! \n");
				} else {
					System.out.println("\nA Fila está vazia!\n");
				}
				
				break; 
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			}
			
		} while(op != 0);
		
		sc.close();
	}
}

package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Queue<String> filaNomes = new LinkedList<String>();
		
		int op = 1;
		
		System.out.println("********************************************************\n");
		
		System.out.println(" 1 - Adicionar cliente na fila");
		System.out.println(" 2 - Listar todos os clientes na fila");
		System.out.println(" 3 - Chamar (retirar) uma pessoa da fila ");
		System.out.println(" 0 - O programa deve ser finalizado");
		
		System.out.println("\n********************************************************\n");
		
		do {
			System.out.print("\nEntre com a opção desejada: ");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				System.out.print("\nDigite o nome do cliente: ");
				sc.nextLine();
				filaNomes.add(sc.nextLine());
			
				System.out.println("\nFila:\n");
				for(String fila: filaNomes) {
					System.out.println(fila);
				}
				
				System.out.println("\nCliente Adicionado! \n");
				
				break;
			case 2:
				System.out.println("\nFila:\n");
				for(String fila: filaNomes) {
					System.out.println(fila);
				}
				break;
			case 3:
				if(!filaNomes.isEmpty()) {
				    filaNomes.poll();
				    System.out.println("\nFila:\n");
				    for(String fila: filaNomes) {
						System.out.println(fila);
					}
				    System.out.println("\nCliente foi chamado! \n");
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

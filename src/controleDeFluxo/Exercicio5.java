package controleDeFluxo;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("# ## ### #### ##### Menu #### ### ## # ");
        System.out.println("\n-- Cachorro quente digite 1  ");
        System.out.println("\n-- X-Salada digite 2 ");
        System.out.println("\n-- X-Bacon digite 3 ");
        System.out.println("\n-- Bauru digite 4 ");
        System.out.println("\n-- Refrigerante digite 5 ");
        System.out.println("\n-- Suco de laranja digite 6 ");
        System.out.println("\nCodigo do produto: ");
        int cod = sc.nextInt();
        System.out.println("Quantidade: ");
        int quant = sc.nextInt();
        
        sc.close();
        
        switch(cod) {
        case 1:
        	System.out.println("Produto: Cachorro Quente");
        	System.out.println("Valor total: R$ " + (10*quant));
        	break;
        case 2:
        	System.out.println("Produto: X-Salada");
        	System.out.println("Valor total: R$ " + (15*quant));
        	break;
        case 3:
        	System.out.println("Produto: X-Bacon");
        	System.out.println("Valor total: R$ " + (18*quant));
        	break;
        case 4:
        	System.out.println("Produto: Bauru");
        	System.out.println("Valor total: R$ " + (12*quant));
        	break;
        case 5:
        	System.out.println("Produto: Refrigerante");
        	System.out.println("Valor total: R$ " + (8*quant));
        	break;
        case 6:
        	System.out.println("Produto: Suco de laranja");
        	System.out.println("Valor total: R$ " + (13*quant));
        	break;
        	
        }
	}
}

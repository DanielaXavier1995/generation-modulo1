package controleDeFluxo;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("# ## ### #### ##### Menu #### ### ## # ");
        System.out.println("\n-- Gerente 1  ");
        System.out.println("\n-- Vendedor 2 ");
        System.out.println("\n-- Supervisor 3 ");
        System.out.println("\n-- Motorista 4 ");
        System.out.println("\n-- Estoquista 5 ");
        System.out.println("\n-- Técnico de TI 6 ");
        System.out.println("\nNome do Colaborador: ");
        String nome = sc.nextLine();
        System.out.println("Cargo: ");
        int cargo = sc.nextInt();
        System.out.println("Salário: ");
        double salario = sc.nextDouble();
        
        sc.close();
        
        System.out.println("Nome: " + nome);
        
        switch(cargo) {
        case 1:
        	System.out.println("Cargo: Gerente");
        	System.out.println("Valor total: R$ " + (salario + (0.1*salario)));
        	break;
        case 2:
        	System.out.println("Cargo: Vendedor");
        	System.out.println("Valor total: R$ " + (salario + (0.07*salario)));
        	break;
        case 3:
        	System.out.println("Cargo: Supervisor");
        	System.out.println("Valor total: R$ " + (salario + (0.09*salario)));
        	break;
        case 4:
        	System.out.println("Cargo: Motorista");
        	System.out.println("Valor total: R$ " + (salario + (0.06*salario)));
        	break;
        case 5:
        	System.out.println("Cargo: Estoquista");
        	System.out.println("Valor total: R$ " + (salario + (0.05*salario)));
        	break;
        case 6:
        	System.out.println("Cargo: Técnico de TI");
        	System.out.println("Valor total: R$ " + (salario + (0.08*salario)));
        	break;

	}
        
	}
}



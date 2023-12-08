package lacoDeRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int idade, genero, tipo;
		
		int cond1 = 0, cond2 = 0, cond3 = 0, cond4 = 0, cond5 = 0, quantPessoas = 0, somaIdade = 0;
		
		double mediaIdade = 0;
		
		String resp = "s";
		
		Scanner sc = new Scanner(System.in);

		System.out.println("# ## ### #### ##### Gênero #### ### ## # ");
		System.out.println("\n 1 - Mulher Cis  ");
		System.out.println("\n 2 - Homem Cis  ");
		System.out.println("\n 3 - Não Binário  ");
		System.out.println("\n 4 - Mulher Trans  ");
		System.out.println("\n 5 - Homem Trans  ");
		System.out.println("\n 6 - Outros  ");
		
		System.out.println("\n# ## ### #### ##### Pessoa Desenvolvedora #### ### ## # ");
		System.out.println("\n 1 - Backend  ");
		System.out.println("\n 2 - Frontend  ");
		System.out.println("\n 3 - Mobile  ");
		System.out.println("\n 4 - FullStack  ");
		
		while(resp.equalsIgnoreCase("s")) {
			
		System.out.println("Idade: ");
		idade = sc.nextInt();
		System.out.println("Identidade de Gênero: ");
		genero = sc.nextInt();
		System.out.println("Pessoa Desenvolvedora: ");
		tipo = sc.nextInt();
		
		sc.nextLine();
        System.out.println("\nDeseja continuar (S/N): ");
        resp = sc.nextLine();
		
        if(tipo == 1) {
        	cond1++;
        }
        
        if((genero == 1 || genero == 4) && tipo == 2) {
        	cond2++;
        }
        
        if((genero == 2 || genero == 5) && tipo == 3 && idade > 40) {
        	cond3++;
        }
        
        if(genero == 3 && tipo == 4 && idade < 30) {
        	cond4++;
        }
  
        quantPessoas++;
        
        somaIdade += idade;
        
        mediaIdade = somaIdade/quantPessoas;
        
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + cond1);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + cond2);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + cond3);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + cond4);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + quantPessoas);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);

		sc.close();

	}

}

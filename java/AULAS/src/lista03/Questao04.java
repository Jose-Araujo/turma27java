package lista03;

import java.util.Locale;
import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		//LISTA 03
		//QUESTÃO 04
		//Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma 
		//das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 
		//2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 
		//pessoas, calcule e mostre: (WHILE) 
		//o número de pessoas calmas; 
		//o número de mulheres nervosas; 
		//o número de homens agressivos; 
		//o número de outros calmos; 
		//o número de pessoas nervosas com mais de 40 anos;
		// o número de pessoas calmas com menos de 18 ano
				
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numeroEntrevistados = 1, numeroPessoaCalmas = 0, numeroMulheresNervosas = 0, numeroHomensAgrassivos = 0, numeroOutrosCalmos = 0, numeroPessoasNervosasIdadeMaior40 = 0, numeroPessoasCalmasIdadeMenor18 = 0; 
		int idadeEntrevistado, sexoEntrevistado, humorEntrevistado;
		final int LIMITE = 3;
		char operacao = 'S';
		
		System.out.println("\t\tCOLETA DE DADOS");
		
		while(numeroEntrevistados <= LIMITE && operacao == 'S') {
			System.out.printf(">>> %dº ENTREVISTADO <<<\n", numeroEntrevistados);
			System.out.print("Idade entrevistado: ");
			idadeEntrevistado = leia.nextInt();
			
			System.out.println("Sexo entrevistado: ");
			System.out.println("\t1 - Feminino \n\t2 - Masculino \n\t3 - Outros");
			System.out.print("\t");
			sexoEntrevistado = leia.nextInt();
			
			System.out.println("Humor entrevistado: ");
			System.out.println("\t1 - Calma \n\t2 - Nervosa \n\t3 - Agressiva");
			System.out.print("\t");
			humorEntrevistado = leia.nextInt();
			
			if(humorEntrevistado == 1) {
				numeroPessoaCalmas++;									//o número de pessoas calmas;
				
			}
			if(sexoEntrevistado == 1 && humorEntrevistado == 2) {
				numeroMulheresNervosas++;								//o número de mulheres nervosas; 
			
			}
			if(sexoEntrevistado == 2 && humorEntrevistado == 3) {
				numeroHomensAgrassivos++;								//o número de homens agressivos; 
				
			}
			if(sexoEntrevistado == 3 && humorEntrevistado == 1) {
				numeroOutrosCalmos++;									//o número de outros calmos; 
				
			}
			if(humorEntrevistado == 2 && idadeEntrevistado > 40) {
				numeroPessoasNervosasIdadeMaior40++;					//o número de pessoas nervosas com mais de 40 anos;
				
			}
			if(humorEntrevistado == 1 && idadeEntrevistado < 18) {
				numeroPessoasCalmasIdadeMenor18++;					// o número de pessoas calmas com menos de 18 ano
				
			}
			
			numeroEntrevistados++;
			if(numeroEntrevistados <= LIMITE) {
				System.out.print("Continuar S/N: "); 
				operacao = leia.next().toUpperCase().charAt(0);
				System.out.print("\n"); 
				
			}

			
		}
		
		System.out.println("O número de pessoas calmas: " + numeroPessoaCalmas); 
		System.out.println("O número de mulheres nervosas: " + numeroMulheresNervosas);
		System.out.println("O número de homens agressivos: " + numeroHomensAgrassivos);
		System.out.println("O número de outros calmos: " + numeroOutrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + numeroPessoasNervosasIdadeMaior40);
		System.out.println("O número de pessoas calmas com menos de 18 ano: " + numeroPessoasCalmasIdadeMenor18);

	}

}

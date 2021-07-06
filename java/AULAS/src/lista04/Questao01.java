package lista04;

import java.util.Locale;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//LISTA 04
		//QUEST�O 01
		//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
		//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		final int LIMITE = 5;
		double pontuacao[] = new double[LIMITE]; 
		double maiorPontuacao = 0;
		
		System.out.println("REGISTRO DE PONTUA��O:");
		for(int x = 0; x < LIMITE; x++) {
			System.out.printf("Informe  a %d� pontua��o: ", (x+1));
			pontuacao[x] = leia.nextDouble();
			
			if(maiorPontuacao < pontuacao[x]) {
				maiorPontuacao = pontuacao[x];
				
			}
			
		}
		
		System.out.println("\nPONTUA��O:");
		for(int x = 0; x < LIMITE; x++) {
			System.out.printf("%d� pontua��o: %.2f\n", (x+1), pontuacao[x]);
			
		}
		
		System.out.printf("\nA maior pontua��o �: %.2f", maiorPontuacao);
 
	}

}

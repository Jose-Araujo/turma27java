package lista04;

import java.util.Locale;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//LISTA 04
		//QUESTÃO 01
		//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		final int LIMITE = 5;
		double pontuacao[] = new double[LIMITE]; 
		double maiorPontuacao = 0;
		
		System.out.println("REGISTRO DE PONTUAÇÃO:");
		for(int x = 0; x < LIMITE; x++) {
			System.out.printf("Informe  a %dº pontuação: ", (x+1));
			pontuacao[x] = leia.nextDouble();
			
			if(maiorPontuacao < pontuacao[x]) {
				maiorPontuacao = pontuacao[x];
				
			}
			
		}
		
		System.out.println("\nPONTUAÇÃO:");
		for(int x = 0; x < LIMITE; x++) {
			System.out.printf("%dº pontuação: %.2f\n", (x+1), pontuacao[x]);
			
		}
		
		System.out.printf("\nA maior pontuação é: %.2f", maiorPontuacao);
 
	}

}

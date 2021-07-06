package lista04;

import java.util.Locale;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		//LISTA 04
		//QUESTÃO 02
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.*/

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int valoresDadosAnotados[] = new int[10];
		int contaOcorrenciaMaiorPontuacao = 0, maiorValor = 0;
		double mediaDosLancamentos = 0, somaDosLancamentos = 0, contaNumeroDeLancamentos = 0;

		for(int lancamentoDado = 0; lancamentoDado < 10; lancamentoDado++){
			valoresDadosAnotados[lancamentoDado] = 1 + (int)(Math.random()*6);
			
			somaDosLancamentos += valoresDadosAnotados[lancamentoDado];
			contaNumeroDeLancamentos++;

			if(maiorValor < valoresDadosAnotados[lancamentoDado]){
				maiorValor = valoresDadosAnotados[lancamentoDado];
				
			}
		}
		
		for(int lancamentoDado = 0; lancamentoDado < 10; lancamentoDado++){
			if(maiorValor==valoresDadosAnotados[lancamentoDado]){
				contaOcorrenciaMaiorPontuacao++;
				
			}
			
		}

		System.out.println("Os valores dos lançamentos anotados são: ");
		for(int lancamentoDado = 0; lancamentoDado < 10; lancamentoDado++){
			System.out.println("\t" + valoresDadosAnotados[lancamentoDado]);
		}

		mediaDosLancamentos = somaDosLancamentos/contaNumeroDeLancamentos;
		
		System.out.println("\nA média dos lançamentos é " + mediaDosLancamentos + ".");
		System.out.println("A maior pontuação ocorreu " + contaOcorrenciaMaiorPontuacao + ".\n");

	}


}

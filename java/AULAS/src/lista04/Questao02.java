package lista04;

import java.util.Locale;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		//LISTA 04
		//QUEST�O 02
		/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		quantas foram as ocorr�ncias da maior pontua��o.*/

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

		System.out.println("Os valores dos lan�amentos anotados s�o: ");
		for(int lancamentoDado = 0; lancamentoDado < 10; lancamentoDado++){
			System.out.println("\t" + valoresDadosAnotados[lancamentoDado]);
		}

		mediaDosLancamentos = somaDosLancamentos/contaNumeroDeLancamentos;
		
		System.out.println("\nA m�dia dos lan�amentos � " + mediaDosLancamentos + ".");
		System.out.println("A maior pontua��o ocorreu " + contaOcorrenciaMaiorPontuacao + ".\n");

	}


}

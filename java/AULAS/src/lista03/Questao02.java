package lista03;

import java.util.Locale;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		//LISTA 03
		//QUEST�O 02
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int contadorNumeroPar = 0, contadorNumeroImpar = 0;
		double recebeNumero;
		
		System.out.println("INFORME VALORES INTEIROS");
		
		for(int leituraNumero = 1; leituraNumero <= 10; leituraNumero++) {
			System.out.print("Informe o " + leituraNumero + "� n�meor: ");
			recebeNumero = leia.nextDouble();
			
			if(recebeNumero%2 == 0 || recebeNumero%2 == 1) {
				if(recebeNumero%2 == 0) {
					contadorNumeroPar++;
					
				}else {
					contadorNumeroImpar++;
					
				}
				
			}else {
				System.out.println("\nO valor informado � inv�lido!\n");
				leituraNumero--;
				
			}

		}
		
		System.out.printf("Foram informados %d n�meros pares e %d n�meros �mpares.", contadorNumeroPar, contadorNumeroImpar);

	}

}

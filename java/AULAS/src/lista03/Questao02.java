package lista03;

import java.util.Locale;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		//LISTA 03
		//QUESTÃO 02
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int contadorNumeroPar = 0, contadorNumeroImpar = 0;
		double recebeNumero;
		
		System.out.println("INFORME VALORES INTEIROS");
		
		for(int leituraNumero = 1; leituraNumero <= 10; leituraNumero++) {
			System.out.print("Informe o " + leituraNumero + "º númeor: ");
			recebeNumero = leia.nextDouble();
			
			if(recebeNumero%2 == 0 || recebeNumero%2 == 1) {
				if(recebeNumero%2 == 0) {
					contadorNumeroPar++;
					
				}else {
					contadorNumeroImpar++;
					
				}
				
			}else {
				System.out.println("\nO valor informado é inválido!\n");
				leituraNumero--;
				
			}

		}
		
		System.out.printf("Foram informados %d números pares e %d números ímpares.", contadorNumeroPar, contadorNumeroImpar);

	}

}

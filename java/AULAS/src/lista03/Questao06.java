package lista03;

import java.util.Locale;
import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		//LISTA 03
		//QUEST�O 05
		//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
		//Para sair digitar 0(zero).(DO...WHILE
				
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double entradaNumero, mediaNumeroMultiplo3;
		double contaEntradaNumero = 0, somaEntradaNumero = 0;
		
		do {
			System.out.print("Informe um n�mero inteiro: ");
			entradaNumero = leia.nextDouble();
			
			if(entradaNumero%2 == 1 || entradaNumero%2 == 0) {
				if(entradaNumero%3 == 0 && entradaNumero != 0) {
					somaEntradaNumero += entradaNumero;
					contaEntradaNumero++;
					
				}
				
			}else {
				System.out.println("O valor informado n�o � inteiro, por favor, digite um valor inteiro!");
				
			}
			
		}while(entradaNumero != 0);
		
		if(somaEntradaNumero == 0 && contaEntradaNumero == 0) {
			mediaNumeroMultiplo3 = 0;
			
		}else {
			mediaNumeroMultiplo3 = somaEntradaNumero/contaEntradaNumero;
			
		}

		System.out.printf("A m�dia dos n�meros m�ltiplos de 3 � %.2f.", mediaNumeroMultiplo3);

	}

}

package lista03;

import java.util.Locale;
import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		//LISTA 03
		//QUESTÃO 05
		//Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números 
		//digitados.(DO...WHILE)
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numeroDigitado;
		double somaNumeroDigitado = 0;
		
		do {
			System.out.print("Digite um número: ");
			numeroDigitado = leia.nextDouble();
			
			somaNumeroDigitado += numeroDigitado;
			
		}while(numeroDigitado != 0);
		
		System.out.println("A soma dos números digitados é " + somaNumeroDigitado);
		
	}

}

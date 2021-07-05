package lista03;

import java.util.Locale;
import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		//LISTA 03
		//QUEST�O 05
		//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros 
		//digitados.(DO...WHILE)
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numeroDigitado;
		double somaNumeroDigitado = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			numeroDigitado = leia.nextDouble();
			
			somaNumeroDigitado += numeroDigitado;
			
		}while(numeroDigitado != 0);
		
		System.out.println("A soma dos n�meros digitados � " + somaNumeroDigitado);
		
	}

}

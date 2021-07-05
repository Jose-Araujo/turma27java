package lista02;

import java.util.Locale;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//LISTA 02
		//QUESTÃO 01
		//Faça um programa que receba três inteiros e diga qual deles é o maior
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, terceiroNumero; 
		
		System.out.println("Informe três números inteiro!");
		System.out.print("informe o primeiro númeor: ");
		primeiroNumero = leia.nextInt();
		System.out.print("informe o segundo númeor: ");
		segundoNumero = leia.nextInt();
		System.out.print("informe o terceiro númeor: ");
		terceiroNumero = leia.nextInt();
		
		if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O primeiro número é maior!");
			
		}else if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero){
			System.out.println("O segundo número é maior!");
			
		}else {
			System.out.println("O terceiro número é maior!");
			
		}
	}
}

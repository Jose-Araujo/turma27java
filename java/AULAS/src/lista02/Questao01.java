package lista02;

import java.util.Locale;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//LISTA 02
		//QUEST�O 01
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, terceiroNumero; 
		
		System.out.println("Informe tr�s n�meros inteiro!");
		System.out.print("informe o primeiro n�meor: ");
		primeiroNumero = leia.nextInt();
		System.out.print("informe o segundo n�meor: ");
		segundoNumero = leia.nextInt();
		System.out.print("informe o terceiro n�meor: ");
		terceiroNumero = leia.nextInt();
		
		if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O primeiro n�mero � maior!");
			
		}else if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero){
			System.out.println("O segundo n�mero � maior!");
			
		}else {
			System.out.println("O terceiro n�mero � maior!");
			
		}
	}
}

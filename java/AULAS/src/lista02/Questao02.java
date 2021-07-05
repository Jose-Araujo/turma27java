package lista02;

import java.util.Locale;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		//LISTA 02
		//QUESTÃO 02
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
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
		
		if(primeiroNumero <= segundoNumero && segundoNumero <= terceiroNumero) {
			System.out.printf("%d %d %d", primeiroNumero, segundoNumero, terceiroNumero );
			
		}else if(primeiroNumero <= terceiroNumero && terceiroNumero <= segundoNumero) {
			System.out.printf("%d %d %d",  primeiroNumero, terceiroNumero, segundoNumero );
			
		}else if(segundoNumero <= primeiroNumero && primeiroNumero <= terceiroNumero) {
			System.out.printf("%d %d %d",  segundoNumero, primeiroNumero, terceiroNumero);
			
		}else if(segundoNumero <= terceiroNumero && terceiroNumero <= terceiroNumero) {
			System.out.printf("%d %d %d",  segundoNumero, terceiroNumero, terceiroNumero );
			
		}else if(terceiroNumero <= primeiroNumero && primeiroNumero <= segundoNumero) {
			System.out.printf("%d %d %d",  terceiroNumero, primeiroNumero, segundoNumero );
			
		}else if(terceiroNumero <= segundoNumero && segundoNumero <= primeiroNumero) {
			System.out.printf("%d %d %d",  terceiroNumero, segundoNumero, primeiroNumero );
			
		}

	}

}

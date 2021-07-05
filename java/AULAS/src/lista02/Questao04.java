package lista02;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao04 {

	public static void main(String[] args) {
		//LISTA 02
		//QUESTÃO 04
		//Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		//ímpar exiba o número elevado ao quadrado.
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double entradaNumero;
		
		System.out.println("Entre com um valor: ");
		entradaNumero = leia.nextDouble();
		
		if(entradaNumero%2 == 0) {
			System.out.println("O número " + entradaNumero + " é par.");
			System.out.println("Sua raíz quadrada é " + new DecimalFormat("0.000").format(Math.sqrt(entradaNumero)) + ".");
			
		}else {
			System.out.println("O número " + entradaNumero + " é ímpar.");
			System.out.println("Sua raíz quadrada é " +  new DecimalFormat("0.000").format(Math.pow(entradaNumero, 2)) + ".");
		}

	}

}

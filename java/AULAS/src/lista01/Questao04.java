package lista01;

import java.util.Locale;
import java.util.Scanner;

public class Questao04 {
	
	public static void main(String[] args) {
		//LISTA 01
		//QUESTÃO 04:
		//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
		//D = (R + S)/2, onde R = (A + B)^2 e S = (B + C)^2
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int A, B, C;
		double  R, S, D;
		
		System.out.println("Digite três números interios e positivos (A, B, C)! ");
		System.out.print("\nDigite o primeiro número (A):\t");
		A = leia.nextInt();
		System.out.print("Digite o segundo número (B):\t");
		B = leia.nextInt();
		System.out.print("Digite o terceiro número (C):\t");
		C = leia.nextInt();
	
		R = Math.pow((A + B), 2);
		S =  Math.pow((B + C), 2);
		D = (R + S)/2;
	
		System.out.println("\nA espressão D = (R + S)/2, tem como resultado: " + D + "\n");
		
	}

}

package lista01;

import java.util.Locale;
import java.util.Scanner;

public class Questao04 {
	
	public static void main(String[] args) {
		//LISTA 01
		//QUEST�O 04:
		//Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
		//D = (R + S)/2, onde R = (A + B)^2 e S = (B + C)^2
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int A, B, C;
		double  R, S, D;
		
		System.out.println("Digite tr�s n�meros interios e positivos (A, B, C)! ");
		System.out.print("\nDigite o primeiro n�mero (A):\t");
		A = leia.nextInt();
		System.out.print("Digite o segundo n�mero (B):\t");
		B = leia.nextInt();
		System.out.print("Digite o terceiro n�mero (C):\t");
		C = leia.nextInt();
	
		R = Math.pow((A + B), 2);
		S =  Math.pow((B + C), 2);
		D = (R + S)/2;
	
		System.out.println("\nA espress�o D = (R + S)/2, tem como resultado: " + D + "\n");
		
	}

}

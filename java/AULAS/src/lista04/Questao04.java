package lista04;

import java.util.Locale;
import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		//LISTA 04
		//QUESTÃO 04
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.*/
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int matrizPrincipal[][] = new int[3][3];
		int somaDosValoresMatriz = 0, somaDiagonalPrincipal = 0; 

		System.out.println("Preencha a matriz.");
		for(int linha = 0; linha < 3; linha++){
			for(int coluna = 0; coluna < 3; coluna++){
				System.out.print("[" + (linha + 1) + "x" + (coluna + 1) + "]: ");
				matrizPrincipal[linha][coluna] = leia.nextInt();

				somaDosValoresMatriz += matrizPrincipal[linha][coluna];
				
			}
			somaDiagonalPrincipal += matrizPrincipal[linha][linha];
			
		}

		System.out.println("\nA MATRIZ DIGITADA :");
		
		for(int linha = 0; linha < 3; linha++){
			for(int coluna = 0; coluna < 3; coluna++){
				System.out.print("[" + matrizPrincipal[linha][coluna] + "]\t");
			}
			System.out.println("");
		}

		System.out.println("\nA soma do seus valores é: " + somaDosValoresMatriz + ".");
		System.out.println("A soma dos valores da diagonal principal é: " + somaDiagonalPrincipal + ".");

	}

}

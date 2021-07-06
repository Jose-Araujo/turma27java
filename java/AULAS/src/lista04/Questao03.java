package lista04;

public class Questao03 {

	public static void main(String[] args) {
		//LISTA 04
		//QUESTÃO 03
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
			posição das matrizes N1 e N2.*/

		int N1[][] = new int[4][6]; 
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];

		//Preencher Matrizes
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				N1[linha][coluna] = 0 + (int)(Math.random()*3);
				N2[linha][coluna] = 4 + (int)(Math.random()*6);
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
				
			}
			
		}
		
		//Mostra Matriz N1
		System.out.println("A MATRIZ N1 É:");
		
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				System.out.print("[" + N1[linha][coluna] + "]\t");
				
			}
			System.out.println();
			
		}

		//Mostra Matriz N2
		System.out.println("\nA MATRIZ N2 É:");
		
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				System.out.print("[" + N2[linha][coluna] + "]\t");
				
			}
			System.out.println();
			
		}

		//Mostra Matriz M1	
		System.out.println("\nA MATRIZ M1 É:");
		
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				System.out.print("[" + M1[linha][coluna] + "]\t");
			}
			System.out.println();
		}

		//Mostra Matriz M2
		System.out.println("\nA MATRIZ M2 É:");
		
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				System.out.print("[" + M2[linha][coluna] + "]\t");
			}
			System.out.println();
		}

	}

}

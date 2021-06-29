programa
{
	inclua biblioteca Util 
	
	funcao inicio()
	{
		//LISTA 04
		//QUESTÃO 03
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
			posição das matrizes N1 e N2.*/

		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]

		//Preencher Matrizes
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				N1[linha][coluna] = Util.sorteia(1, 3)
				N2[linha][coluna] = Util.sorteia(4, 6)
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
			}
		}
		
		//Mostra Matriz N1
		escreva("A MATRIZ N1 É:\n")
		
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva("[", N1[linha][coluna], "]\t")
			}
			escreva("\n")
		}

		//Mostra Matriz N2
		escreva("\nA MATRIZ N2 É:\n")
		
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva("[", N2[linha][coluna], "]\t")
			}
			escreva("\n")
		}

		//Mostra Matriz M1	
		escreva("\nA MATRIZ M1 É:\n")
		
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva("[", M1[linha][coluna], "]\t")
			}
			escreva("\n")
		}

		//Mostra Matriz M2
		escreva("\nA MATRIZ M2 É:\n")
		
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva("[", M2[linha][coluna], "]\t")
			}
			escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 773; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		//LISTA 04
		//QUESTÃO 04
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.*/

		inteiro matrizPrincipal[3][3]
		inteiro somaDosValoresMatriz = 0, somaDiagonalPrincipal = 0 

		escreva("Preencha a matriz.\n")
		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				escreva("[", (linha + 1), "x", (coluna + 1), "]: ")
				leia(matrizPrincipal[linha][coluna])

				somaDosValoresMatriz += matrizPrincipal[linha][coluna]
			}
			somaDiagonalPrincipal += matrizPrincipal[linha][linha]
		}
		limpa()

		escreva("\nA MATRIZ DIGITADA :\n")
		
		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				escreva("[", matrizPrincipal[linha][coluna], "]\t")
			}
			escreva("\n")
		}

		escreva("\nA soma do seus valores é: ", somaDosValoresMatriz, ".\n")
		escreva("A soma dos valores da diagonal principal é: ", somaDiagonalPrincipal, ".\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 927; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
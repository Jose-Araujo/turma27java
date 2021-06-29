programa
{
	
	funcao inicio()
	{	
		//LISTA 04
		//QUESTÃO 01
		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

		inteiro pontuacaoAtividade[5]
		inteiro maiorValor = 0

		para(inteiro posicaoPontuacao = 0; posicaoPontuacao < 5; posicaoPontuacao++){
			escreva("Informe a ", (posicaoPontuacao + 1), "ª pontuação: ")
			leia(pontuacaoAtividade[posicaoPontuacao])

			se(maiorValor < pontuacaoAtividade[posicaoPontuacao]){
				maiorValor = pontuacaoAtividade[posicaoPontuacao]
			}
		}

		escreva("\nAs pontuações da atividade são: \n")
		para(inteiro posicaoPontuacao = 0; posicaoPontuacao < 5; posicaoPontuacao++){
			escreva((posicaoPontuacao + 1), "ª pontuação: ", pontuacaoAtividade[posicaoPontuacao], ".\n")

		}

		escreva("\nA maior pontuação é ", maiorValor, ".\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 899; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
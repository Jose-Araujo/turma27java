programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		//LISTA 04
		//QUESTÃO 02
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.*/

		inteiro valoresDadosAnotados[10]
		inteiro contaOcorrenciaMaiorPontuacao = 0, maiorValor = 0
		real mediaDosLancamentos = 0, somaDosLancamentos = 0, contaNumeroDeLancamentos = 0

		para(inteiro lancamentoDado = 0; lancamentoDado < 10; lancamentoDado++){
			valoresDadosAnotados[lancamentoDado] = Util.sorteia(1, 6)

			somaDosLancamentos += valoresDadosAnotados[lancamentoDado]
			contaNumeroDeLancamentos++

			se(maiorValor < valoresDadosAnotados[lancamentoDado]){
				maiorValor = valoresDadosAnotados[lancamentoDado]
			}
		}
		
		para(inteiro lancamentoDado = 0; lancamentoDado < 10; lancamentoDado++){
			se(maiorValor==valoresDadosAnotados[lancamentoDado]){
				contaOcorrenciaMaiorPontuacao++
			}
			
		}

		escreva("\nOs valores dos lançamentos anotados são:\n")
		para(inteiro lancamentoDado = 0; lancamentoDado < 10; lancamentoDado++){
			escreva("\t", valoresDadosAnotados[lancamentoDado], "\n")
		}

		mediaDosLancamentos = somaDosLancamentos/contaNumeroDeLancamentos
		
		escreva("A média dos lançamentos é ", mediaDosLancamentos, ".\n")
		escreva("A maior pontuação ocorreu ", contaOcorrenciaMaiorPontuacao, " vezes.\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 695; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
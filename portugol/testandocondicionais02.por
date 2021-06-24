programa
{
	
	funcao inicio()
	{
		//Digite um número e veja se ele é par ou ímpar
		inteiro valorDigitado

		escreva("Digite um número inteiro: ")
		leia(valorDigitado)

		se(valorDigitado%2 == 0){
			escreva("O número digitado é ", valorDigitado, ", ele é par!\n")
		}senao{
			escreva("O número digitado é ", valorDigitado, ", ele é ímpar!\n")
		}

		escreva("FIM DO PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		//LISTA 03
		//QUESTÃO 04 - LAÇO ENQUANTO
		/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
		três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
		digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.*/
		
		const inteiro MULPIPLICADOR = 3
		inteiro entradaNumero = 0

		escreva("Informe o número: ")
		leia(entradaNumero)
		
		enquanto(entradaNumero <= 100){
			escreva(entradaNumero, " ")
			entradaNumero *= MULPIPLICADOR
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
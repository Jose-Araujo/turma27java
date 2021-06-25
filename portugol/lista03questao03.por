programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//LISTA 03
		//QUESTÃO 03 - LAÇO ENQUANTO
		/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
		apresente no final o total do somatório, a média e o total de valores lidos. O programa
		deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
		positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
		negativo.*/

		inteiro entradaDeNumeros = 0, quantidadeDeNumerosDigitados = -1
		real mediaDosNumeros = 0.0, somatoriaDosNumeros = 0.0

		enquanto(entradaDeNumeros >= 0){
			somatoriaDosNumeros += entradaDeNumeros
			quantidadeDeNumerosDigitados++
			
			escreva("Digite um valor numérico: ")
			leia(entradaDeNumeros)
			//limpa()
			
		}

		mediaDosNumeros = mat.arredondar(somatoriaDosNumeros/quantidadeDeNumerosDigitados, 2)

		escreva("Somatória total			: ", somatoriaDosNumeros, "\n")
		escreva("Média				: ", mediaDosNumeros, "\n")
		escreva("Quantidade de números lidos	: ", quantidadeDeNumerosDigitados, "\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 498; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//PROGRAMA SEQUENCIAL
		//QUESTÃO 04:
		//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
		//D = (R + S)/2, onde R = (A + B)^2 e S = (B + C)^2
		inteiro A, B, C
		real  R, S, D
		escreva("Digite três números interios e positivos (A, B, C)! ")
		escreva("\nDigite o primeiro número (A): ")
		leia(A)
		escreva("Digite o primeiro segundo (B): ")
		leia(B)
		escreva("Digite o primeiro terceiro (C): ")
		leia(C)

		R = mat.potencia(A + B, 2)
		S = mat.potencia(B + C, 2)
		D = (R + S)/2

		escreva("\nA espressão D = (R + S)/2, tem como resultado: ", D, "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		//LISTA 02
		//QUESTÃO 08
		/*Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
		for maior que 100, caso contrário imprimi-la com o valor zero.*/

		real valorDeN

		escreva("Informe o valor da variável N: ")
		leia(valorDeN)

		se(valorDeN > 100){
			escreva("O valor de N é ", valorDeN, ".\n")
		}senao{
			valorDeN = 0.0
			escreva("O valor de N é ", valorDeN, ".\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
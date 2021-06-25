programa
{
	
	funcao inicio()
	{
		//LISTA 03
		//QUESTÃO 06
		/*Faça um programa que pegue um número do teclado e calcule a soma de todos os
		números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
		1+2+3+4+5+6+7=28.*/

		inteiro numeroDoTeclado
		inteiro contaAteoNumeroTeclado = 0, somaDosNumeros = 0

		escreva("Digite um número no Teclado: ")
		leia(numeroDoTeclado)

		faca{
			somaDosNumeros += contaAteoNumeroTeclado
			contaAteoNumeroTeclado++
			
		}enquanto(contaAteoNumeroTeclado <= numeroDoTeclado)

		escreva("A soma de todos os números de 2 até o valor digitado no teclado é ", somaDosNumeros, ".\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 637; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
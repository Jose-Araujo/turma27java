programa
{
	
	funcao inicio()
	{
		//LISTA 02
		//QUESTÃO 04
		/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
		número é par ou ímpar, e se é positivo ou negativo */
		inteiro numeroDigitado
		escreva("Informe un número interio: ")
		leia(numeroDigitado)

		se(numeroDigitado%2 == 0 e numeroDigitado > 0){
			escreva("O número ", numeroDigitado, " é par e positivo.")			
		}
		se(numeroDigitado%2 == 0 e numeroDigitado < 0){
			escreva("O número ", numeroDigitado, " é par e negativo.")			
		}
		se(numeroDigitado%2 != 0 e numeroDigitado > 0){
			escreva("O número ", numeroDigitado, " é ímpar e positivo.")			
		}
		se(numeroDigitado%2 != 0 e numeroDigitado < 0){
			escreva("O número ", numeroDigitado, " é ímparar e negativo.")			
		}
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 753; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
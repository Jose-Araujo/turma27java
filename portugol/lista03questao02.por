programa
{
	
	funcao inicio()
	{
		//LISTA 03
		//QUESTÃO 02 - LAÇO PARA
		/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são
		múltiplos de três e que se encontram no conjunt dos números de 1 até 500.*/

		const inteiro CONJUNTODOSNIMEROS = 500
		inteiro somaNumeroImparMultiplo3 = 0

		para(inteiro inicioDoConjuntoDosNumeros = 1; inicioDoConjuntoDosNumeros <= CONJUNTODOSNIMEROS; inicioDoConjuntoDosNumeros++){
			se(inicioDoConjuntoDosNumeros%2 == 1 e inicioDoConjuntoDosNumeros%3 == 0){
				somaNumeroImparMultiplo3 += inicioDoConjuntoDosNumeros
			}
		}

		escreva("A soma dos números ímpares e multiplos de 3, no conjunto de 1 à 500 é ", somaNumeroImparMultiplo3, ".\n")
	}
}  
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
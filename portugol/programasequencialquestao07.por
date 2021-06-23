programa
{
	
	funcao inicio()
	{
		//PROGRAMA SEQUENCIAL
		//QUESTÃO 07
		//

		real coeficienteA, coeficienteB, coeficienteC, coeficienteD, coeficienteE, coeficienteF, valorX, valorY

		escreva("Digite os coeficientes!")
		escreva("\nCoeficente A: ")
		leia(coeficienteA)
		escreva("\nCoeficente B: ")
		leia(coeficienteB)
		escreva("\nCoeficente C: ")
		leia(coeficienteC)
		escreva("\nCoeficente D: ")
		leia(coeficienteD)
		escreva("\nCoeficente E: ")
		leia(coeficienteE)
		escreva("\nCoeficente F: ")
		leia(coeficienteF)

		valorX = (coeficienteC*coeficienteE - coeficienteB*coeficienteF)/(coeficienteA*coeficienteE - coeficienteB*coeficienteD)
		valorY = (coeficienteA*coeficienteF - coeficienteC*coeficienteD)/(coeficienteA*coeficienteE - coeficienteB*coeficienteD)

		escreva("O valor de X é ", valorX, ".\n")
		escreva("O valor de Y é ", valorY, ".\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 665; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
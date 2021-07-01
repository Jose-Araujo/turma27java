programa
{
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		//PROGRAMA SEQUENCIAL
		//QUESTÃO 07
		// Um sistema de equações lineares do tipo:
		//ax + by = c, dx + ey = f, pode ser resolvido segundo mostrado abaixo
		//x = (ce - bf)/(ae - bd)
		//y = (af - cd)/(ae - bd)

		real coeficienteA, coeficienteB, coeficienteC, coeficienteD, coeficienteE, coeficienteF, valorX, valorY

		escreva("Digite os coeficientes!\n")
		escreva("Coeficente A: ")
		leia(coeficienteA)
		escreva("Coeficente B: ")
		leia(coeficienteB)
		escreva("Coeficente C: ")
		leia(coeficienteC)
		escreva("Coeficente D: ")
		leia(coeficienteD)
		escreva("Coeficente E: ")
		leia(coeficienteE)
		escreva("Coeficente F: ")
		leia(coeficienteF)

		valorX = (coeficienteC*coeficienteE - coeficienteB*coeficienteF)/(coeficienteA*coeficienteE - coeficienteB*coeficienteD)
		valorY = (coeficienteA*coeficienteF - coeficienteC*coeficienteD)/(coeficienteA*coeficienteE - coeficienteB*coeficienteD)

		escreva("O valor de X é ", Mat.arredondar(valorX, 2), ".\n")
		escreva("O valor de Y é ", Mat.arredondar(valorY, 2), ".\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1090; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
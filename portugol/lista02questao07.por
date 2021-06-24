programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	
		//LISTA 02
		//QUESTÃO 07
		/*Receber valores de base e altura de um triângulo e verificar se são valores válidos
		(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/
		real baseTriangulo, alturaTriangulo, areaTriangulo

		escreva("Informe a base do triangulo: ")
		leia(baseTriangulo)
		escreva("Informe a altura do triangulo: ")
		leia(alturaTriangulo)

		se(baseTriangulo > 0 e alturaTriangulo > 0){
			areaTriangulo = mat.arredondar((baseTriangulo*alturaTriangulo)/2, 2)
			escreva("A área do triângulo é ", areaTriangulo, ".\n")	
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 546; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//PROGRAMA SEQUENCIAL
		//QUESTÃO 06:
		//Construa um programa em c que, tendo como dados de entrada dois 
		//pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
		//A fórmula que efetua tal cálculo é: d = sqrt((x2-x1)^2 + (y2 - y1)^2)

		real pontoX1, pontoX2, pontoY1, pontoY2, distanciaEntrePontos

		escreva("Digite as coordenadass do primeiro ponto!")
		escreva("\nCoordenada X: ")
		leia(pontoX1)
		escreva("Coordenada Y: ")
		leia(pontoY1)
		escreva("\nDigite as coordenadass do segundo ponto")
		escreva("\nCoordenada X: ")
		leia(pontoX2)
		escreva("Coordenada Y: ")
		leia(pontoY2)

		distanciaEntrePontos = mat.raiz(mat.potencia(pontoX2 - pontoX1, 2) + mat.potencia(pontoY2 - pontoY1, 2), 2)

		escreva("\nA distancia entre os pontos é ", mat.arredondar(distanciaEntrePontos, 3), ".\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 809; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
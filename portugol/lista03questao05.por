programa
{
	
	funcao inicio()
	{
		//LISTA 03
		//QUESTÃO 05
		/*Faça um programa que mostre uma contagem na tela de 233 a 456, só que
		contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/
		inteiro contagemAtual = 233, fimContagem = 456, somadorContagem = 0, quebraLinha = 0	
		
		faca{
			se(quebraLinha==15){
				escreva("\n")
				quebraLinha = 0
			}
			escreva(contagemAtual, " ")
			se(contagemAtual >= 300 e contagemAtual <= 400 ){
				somadorContagem = 3
			}
			senao{
				somadorContagem = 5
			}

			contagemAtual += somadorContagem
			quebraLinha++
			
		}enquanto(contagemAtual <= fimContagem)

		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
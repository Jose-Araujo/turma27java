programa
{
	
	funcao inicio()
	{
		cadeia carretaFuracao[5] //= {"HOMEM-ARANHA", "PANTRERA NEGRA", "MULHER MARAVILHA", "HUKKLYN", "DOLLYNHO"}

		escreva("CARRETA FURACÃO DO ED\n\n")
		
		para(inteiro posicaoPersonagem = 0; posicaoPersonagem < 5; posicaoPersonagem++){
			escreva("Digite o nome do personagem na ordem de 1 a 5: ")
			leia(carretaFuracao[posicaoPersonagem])
		}

		escreva("\nA ordem decrescente dos personagens é: \n")
		para(inteiro posicaoPersonagem = 4; posicaoPersonagem >= 0; posicaoPersonagem--){
			
			escreva(posicaoPersonagem + 1, " - ", carretaFuracao[posicaoPersonagem], "\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 146; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
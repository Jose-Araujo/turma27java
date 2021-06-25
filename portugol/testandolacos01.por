programa
{
	
	funcao inicio()
	{
		cadeia nome

		escreva("Digite o nome: ")
		leia(nome)
		linha(35)
		pula()
		escreva(nome)
		pula()
		linha(35)
		escreva("\nFIM DO PROGRAMA!!")
		
		
	}

	funcao linha(inteiro tamanho){
		para(inteiro x = 1; x <= tamanho; x++){
			escreva("-")
		}
	}

	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 309; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
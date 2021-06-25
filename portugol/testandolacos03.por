programa
{
	
	funcao inicio()
	{
		inteiro idadeDoUsuario
		inteiro contador = 0

		escreva("Informe a idade do usuário: ")
		leia(idadeDoUsuario)

		enquanto(idadeDoUsuario < 18){
			escreva("Você não tem permissão para acessar.\n")
			escreva("Digite sua idade novamente: ")
			leia(idadeDoUsuario)	

			contador++
			
			se(contador >= 2){
				escreva("Muitas tentativas.\n")
				pare
			}
		}

		se(contador == 0){
			escreva("Acesso permitido!")
		}
		
		senao{
			escreva("Você não possui acesso!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
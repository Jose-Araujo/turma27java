programa
{
	
	funcao inicio()
	{
		//Digite o nome
		//Digite o ano de nascimento
		// idade > 35 você é cringe
		cadeia nomeDeUsuario
		inteiro anoDeNascimento, idadeDoUsuario

		escreva("Digite o nome de usuário: ")
		leia(nomeDeUsuario)
		escreva("Digite o ano de nascimento do usuário: ")
		leia(anoDeNascimento)

		idadeDoUsuario = 2021 - anoDeNascimento

		se(idadeDoUsuario >= 35){
			escreva("Olá ", nomeDeUsuario, ", sua idade é ", idadeDoUsuario, " anos, você é cringe!")
		}

		escreva("\nFIM DO PROGRAMA")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
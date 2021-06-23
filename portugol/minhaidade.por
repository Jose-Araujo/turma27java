programa
{
	
	funcao inicio()
	{
		cadeia nomeDeUsuario
		inteiro anoDeNascimento, anoAtual, idadeDeUsuario
		
		escreva("Escreva seu nome: ")
		leia(nomeDeUsuario)
		escreva("Digite o ano de nascimento: ")
		leia(anoDeNascimento)
		escreva("Digite o ano atual: ")
		leia(anoAtual)
		
		idadeDeUsuario = anoAtual - anoDeNascimento

		escreva("Nome: ", nomeDeUsuario, "\n")
		escreva("Idade: ", idadeDeUsuario, "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
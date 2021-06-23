programa
{
	
	funcao inicio()
	{
		//PROGRAMA SEQUENCIAL
		//QUESTÃO 02:
		//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
		inteiro idadeUsuarioDias, idadeUsuarioMeses, idadeUsuarioAnos

		escreva("Digite a idade do usurário em dias: ")
		leia(idadeUsuarioDias)

		idadeUsuarioMeses = idadeUsuarioDias/30
		idadeUsuarioAnos = idadeUsuarioMeses/12

		escreva("\nA idade do usuário em anos, meses e dias é:")
		escreva("\n	Anos: ", idadeUsuarioAnos)
		escreva("\n	Meses: ", idadeUsuarioMeses)
		escreva("\n 	Dias: ", idadeUsuarioDias, "\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 603; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
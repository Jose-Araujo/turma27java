programa
{
	
	funcao inicio()
	{
		//PROGRAMA SEQUENCIAL
		//QUESTÃO 02:
		//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
		inteiro idadeDoUsuarioDias, idadeUsuarioDias, idadeUsuarioMeses, idadeUsuarioAnos

		escreva("Digite a idade do usuário em dias: ")
		leia(idadeDoUsuarioDias)
		
		idadeUsuarioAnos = idadeDoUsuarioDias/360
		idadeUsuarioMeses = (idadeDoUsuarioDias%360)/30
		idadeUsuarioDias = (idadeDoUsuarioDias%360)%30

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
 * @POSICAO-CURSOR = 651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
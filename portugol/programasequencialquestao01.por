programa
{
	
	funcao inicio()
	{
		//PROGRAMA SEQUENCIAL
		//QUESTÃO 01: 
		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias
		inteiro idadeUsuarioDias, idadeUsuarioMeses, idadeUsuarioAnos, quantidadeDeDias
		escreva("Informe sua idade em anos, meses e dias:\n")
		escreva("	Anos: ")
		leia(idadeUsuarioAnos)
		escreva("	Meses: ")
		leia(idadeUsuarioMeses)
		escreva("	Dias: ")
		leia(idadeUsuarioDias)

		quantidadeDeDias = 365*idadeUsuarioAnos + 30*idadeUsuarioMeses + idadeUsuarioDias
		
		escreva("\n\nA idade do usuário em dias é: ", quantidadeDeDias, "\n\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
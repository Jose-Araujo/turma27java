programa
{
	
	funcao inicio()
	{
		//PROGRAMA SEQUENCIAL
		//QUESTÃO 05:
		//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
		real nota01Aluno, nota02Aluno, nota03Aluno, mediaPonderada
		escreva("Escreva as notas do aluno!")
		escreva("\nNota 01: ")
		leia(nota01Aluno)
		escreva("\nNota 02: ")
		leia(nota02Aluno)
		escreva("\nNota 03: ")
		leia(nota03Aluno)

		mediaPonderada = (2*nota01Aluno + 3*nota02Aluno + 5*nota03Aluno)/10

		escreva("\nA média final deste aluno é ", mediaPonderada, ".\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 557; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
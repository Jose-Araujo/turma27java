programa
{
	
	funcao inicio()
	{
		//PROGRAMA SEQUENCIAL
		//QUESTÃO 03:
		//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
		inteiro duracaoEventoSegundos, duracaoEventoMinutos, duracaoEventoHoras 

		escreva("Digite a duração do evento em segundos: ")
		leia(duracaoEventoSegundos)

		duracaoEventoMinutos = duracaoEventoSegundos/60
		duracaoEventoHoras = duracaoEventoMinutos/60

		escreva("\nA duração do evento em horas, minutos e segundos é: ")
		escreva("\n 	Horas: ", duracaoEventoHoras)
		escreva("\n 	Minutos: ", duracaoEventoMinutos)
		escreva("\n 	Segundos: ", duracaoEventoSegundos, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 672; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
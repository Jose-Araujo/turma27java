programa
{
	
	funcao inicio()
	{
		//LISTA 02
		//QUESTÃO 02
		/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
		horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
		por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
		armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
		trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
		excedente.*/

		cadeia codigoDoOperario
		real numeroDeHorasTrabalhadas, salarioTotalDoOperario
		real numeroDeHorasEmExcesso = 0.0, salarioExcedenteDoOperario = 0.0, salarioParcialDoOperario = 0.0
		const real SALARIOPORHORATRABALHADA = 10.0
		const real NUMERODEHORASMAXIMA = 50		
		const real VALORDAHORAEXCEDENTE = 20.0 		

		escreva("Informe o código do operário: ")
		leia(codigoDoOperario)
		escreva("Informe o número de horas trabalhadas do operário: ")
		leia(numeroDeHorasTrabalhadas)
		limpa()
		
		se(numeroDeHorasTrabalhadas > NUMERODEHORASMAXIMA){
			numeroDeHorasEmExcesso = numeroDeHorasTrabalhadas - NUMERODEHORASMAXIMA
			salarioParcialDoOperario = NUMERODEHORASMAXIMA*SALARIOPORHORATRABALHADA
			salarioExcedenteDoOperario = numeroDeHorasEmExcesso*VALORDAHORAEXCEDENTE
			salarioTotalDoOperario = salarioParcialDoOperario + salarioExcedenteDoOperario
			 
		}senao{
			salarioTotalDoOperario = numeroDeHorasTrabalhadas*SALARIOPORHORATRABALHADA
			
		}

		escreva("O operário de código ", codigoDoOperario, " trabalhou ", numeroDeHorasTrabalhadas, " horas.\n")
		escreva("	Salário Do Operário: \n") 
		escreva("		> Parcial: 	", salarioParcialDoOperario, "\n")
		escreva("		> Excedente: 	", salarioExcedenteDoOperario, "\n")
		escreva("		> Total:	", salarioTotalDoOperario, "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 823; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
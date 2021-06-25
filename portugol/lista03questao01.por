programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//LISTA 03
		//QUESTÃO 01 - LAÇO PARA
		/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
		a) média do salário da população;
		b) média do número de filhos;
		c) maior salário;
		d) percentual de pessoas com salário até R$100,00. */

		const inteiro NUMERODEHABITANTES = 20, faixaSalarialMedia = 100
		real salarioDoHabitante, numeroDeFilhos, mediaSalarioPopulacao, mediaNumeroFilhos, percentualPessoasSalarioAte100
		real maiorSalario = 0.0, salarioTotalDosHabitantes = 0.0, numeroDeFilhosTotal = 0.0, numeroPessoasSalarioAte100 = 0.0 

		para(inteiro numeroDoHabitantePesquisado = 1; numeroDoHabitantePesquisado <= NUMERODEHABITANTES; numeroDoHabitantePesquisado++){
			escreva("Informe o salário do habitante ", numeroDoHabitantePesquisado, ": " )
			leia(salarioDoHabitante)
			escreva("Informe o número de filhos do habitante ", numeroDoHabitantePesquisado, ": ")
			leia(numeroDeFilhos)
			limpa()

			salarioTotalDosHabitantes += salarioDoHabitante
			numeroDeFilhosTotal += numeroDeFilhos

			se(salarioDoHabitante > maiorSalario){
				maiorSalario = salarioDoHabitante
			}
			se(salarioDoHabitante <= faixaSalarialMedia){
				numeroPessoasSalarioAte100++ 
			}
		}

		mediaSalarioPopulacao = mat.arredondar(salarioTotalDosHabitantes/NUMERODEHABITANTES, 2)
		mediaNumeroFilhos = mat.arredondar(numeroDeFilhosTotal/NUMERODEHABITANTES, 2)
		percentualPessoasSalarioAte100 = mat.arredondar((numeroPessoasSalarioAte100*100)/NUMERODEHABITANTES, 2)

		escreva("Informações obtidas: \n")
		escreva("A média do salário da população é de R$ ", mediaSalarioPopulacao, " por habitante.\n")
		escreva("A média do numero de filhos é de ", mediaNumeroFilhos, " filhos por habitante.\n")
		escreva("O maior salário é de R$ ", maiorSalario, ".\n")
		escreva("O percentual de pessoas com salário de até R$100,00 é de ", percentualPessoasSalarioAte100, "%.\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
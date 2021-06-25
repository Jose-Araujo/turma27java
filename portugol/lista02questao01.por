programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//LISTA 02
		//QUESTÃO 01
		/*João, homem de bem, comprou um microcomputador para controlar o rendimento diário
		de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
		regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
		excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
		verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
		da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
		ZERO.*/

		const real PESODETOMETEESTABELECIDO = 50.0, MULTAPORQUILOEXCEDENTE = 4.0
		real pesoDeTomate = 0.0, excedenteDeTomate = 0.0, valorDaMultaPorExcedente = 0.0
		cadeia nomeDoUsuario
		
		escreva("Informe o nome do usuário: ")
		leia(nomeDoUsuario) 
		escreva("Informe o peso de tomates: ")
		leia(pesoDeTomate)
		limpa()
		
		se(pesoDeTomate > PESODETOMETEESTABELECIDO){
			excedenteDeTomate = mat.arredondar(pesoDeTomate - PESODETOMETEESTABELECIDO, 2)
			valorDaMultaPorExcedente = mat.arredondar(MULTAPORQUILOEXCEDENTE*excedenteDeTomate, 2)

			escreva("Olá ", nomeDoUsuario, ", você possui ", pesoDeTomate, " kg de tomate, e possui um excedente de ", excedenteDeTomate, 
			" kg. Terá que pagar uma multa no valor de R$ ", valorDaMultaPorExcedente, ".\n" )
			
		}senao{
			escreva("Olá ", nomeDoUsuario, ", você possui ", pesoDeTomate, " kg de tomate, o excedente é de ", excedenteDeTomate, 
			" kg. A multa por excedente é de R$ ", valorDaMultaPorExcedente, ".\n" )
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1167; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
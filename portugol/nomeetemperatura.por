programa
{
	
	funcao inicio()
	{
		//Grupo 05
		//Ler nome de usuário e uma temperatura
		//Grupos pares ler temperatura em Celsius e converter para Farenheit 
		//Grupos impares ler temperatura em Farenheit e converter para Celsius
		
		cadeia nomeDeUsuario 
		real temperaturaFarenheit, conversaoDeTemperatura 

		escreva("Digite o nome de usuário: ") 
		leia(nomeDeUsuario)

		escreva("Digite a temperatura em Farenheit: ")
		leia(temperaturaFarenheit)

		conversaoDeTemperatura = (temperaturaFarenheit - 32 )/1.8

		escreva("\nO nome de usuário é: ", nomeDeUsuario, "\n")
		escreva("A temperatura em graus Celsius é: ", conversaoDeTemperatura, "\n")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
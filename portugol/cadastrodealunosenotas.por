programa
{
	
	funcao inicio()
	{
		//NOME DE CADA ALUNO
		//NOTA DE CADA ALUNO
		
		cadeia nomeDoAluno[4]
		inteiro notaDoAluno[4]
		
		escreva("---- BOLETINHO ----\n\n")

		para(inteiro posicaoDoVetor = 0; posicaoDoVetor < 4; posicaoDoVetor++){
			escreva("Nome do Aluno 0", posicaoDoVetor + 1, ": ")
			leia(nomeDoAluno[posicaoDoVetor])
			escreva("Nota do Aluno 0", posicaoDoVetor + 1, ": ")
			leia(notaDoAluno[posicaoDoVetor])
			
		}

		escreva("\nALUNOS CADASTRADOS\n")
		para(inteiro posicaoDoVetor = 0; posicaoDoVetor < 4; posicaoDoVetor++){
			escreva(" Olá ", nomeDoAluno[posicaoDoVetor], ", sua nota é ", notaDoAluno[posicaoDoVetor], ".\n")
			se(notaDoAluno[posicaoDoVetor] <= 5){
				escreva("\tReprovado, estude mais!\n")
			}
			senao{
				escreva("\tAprovado, continue o bom trabalho!\n")
			}
		}

		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 816; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
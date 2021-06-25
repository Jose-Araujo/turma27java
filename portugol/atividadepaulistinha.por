programa
{
	inclua biblioteca Texto	
	
	funcao inicio()
	{
		//GRUPO 04
		
		const cadeia TIME1 = "CORINTHINS", TIME2 = "PALMEIRAS", TIME3 = "SÃO PAULO", TIME4 = "SANTOS"
		const inteiro RODADA = 4
		cadeia resultadoDoJogo
		inteiro ponto1 = 0, ponto2 = 0, ponto3 = 0, ponto4 = 0

		para(inteiro numeroDeRodadas = 1; numeroDeRodadas <= RODADA; numeroDeRodadas++){
			escreva("RODADA ", numeroDeRodadas, "\n")
			escreva(TIME1, "\n")
			escreva("O time Ganhou [G], Perdeu [P], Empatou [E] ")
			leia(resultadoDoJogo)
			
			se(Texto.caixa_alta(resultadoDoJogo) == "G"){
				ponto1 += 3
			}
			senao se(Texto.caixa_alta(resultadoDoJogo) == "P"){
				ponto1 += 0
			}
			senao se(Texto.caixa_alta(resultadoDoJogo) == "E"){
				ponto1 += 1
			}
			
			escreva(TIME2, "\n")
			escreva("O time Ganhou [G], Perdeu [P], Empatou [E] ")
			leia(resultadoDoJogo)

			se(Texto.caixa_alta(resultadoDoJogo) == "G"){
				ponto2 += 3
			}
			senao se(Texto.caixa_alta(resultadoDoJogo) == "P"){
				ponto2 += 0
			}
			senao se(Texto.caixa_alta(resultadoDoJogo) == "E"){
				ponto2 += 1
			}

			escreva(TIME3, "\n")
			escreva("O time Ganhou [G], Perdeu [P], Empatou [E] ")
			leia(resultadoDoJogo)

			se(Texto.caixa_alta(resultadoDoJogo) == "G"){
				ponto3 += 3
			}
			senao se(Texto.caixa_alta(resultadoDoJogo) == "P"){
				ponto3 += 0
			}
			senao se(Texto.caixa_alta(resultadoDoJogo) == "E"){
				ponto3 += 1
			}

			escreva(TIME4, "\n")
			escreva("O time Ganhou [G], Perdeu [P], Empatou [E] ")
			leia(resultadoDoJogo)

			se(Texto.caixa_alta(resultadoDoJogo) == "G"){
				ponto4 += 3
			}
			senao se(Texto.caixa_alta(resultadoDoJogo) == "P"){
				ponto4 += 0
			}
			senao se(Texto.caixa_alta(resultadoDoJogo) == "E"){
				ponto4 += 1
			}
			limpa()
			
		}
		limpa()

		escreva("GRUPO 04\n")
		escreva("Pontuação do ", TIME1, ": ", ponto1, "\n")
		escreva("Pontuação do ", TIME2, ": ", ponto2, "\n")
		escreva("Pontuação do ", TIME3, ": ", ponto3, "\n")
		escreva("Pontuação do ", TIME4, ": ", ponto4, "\n")
		

		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1787; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{ 
	/*MOSTE NA TELA OS TIMES, E VOCÊ RESPONDE, GANHOU, PERDEU, EMPATOU. SE GANHOU +3PT, SE PERDEU -0PT, EMPATOU +1PT.
	VETOR NOME DOS TIMES, VETOR PONTOS. 3 RODADAS. FINAL, LISTA DOS TIMES COM SOMA DOS PONTOS.
	*/
		//Variaveis
		cadeia times [4] = {"cor","pal","sp","fla"}
		caracter resposta [] = {'G','P','E'}
		inteiro pontos [4]
		
		//Entradas e Processamento
		para(inteiro rodada = 0; rodada < 4; rodada++)
		escreva("Partida: "+(rodada+1),"\n")
		{
			para(inteiro r = 0;r <4;r++)
				
				leia(resposta[])
				se(resposta[rodada] == 'G')
				{
					pontos[r] +=3
				}
				senao se(resposta == 'E')
				{
					pontos[r] += 1
				}
				senao{
					pontos[r] += 0
					}
		}
		para(inteiro r = 0; i< 4; r++){
			escreva("\n"+times[r]+"-"+pontos[r])
			}

		//Saida
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 583; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
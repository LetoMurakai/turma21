programa
{
	
	funcao inicio()
	{
		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		  atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		 */
		//Variaveis
		inteiro pontuacao[5]
		inteiro maiorP = 0
		
		//Entradas e Processamento
		para(inteiro x=0; x < 5; x++)
		{	
			escreva("Escreva a pontuação: ")
			leia(pontuacao [x])
		}
		limpa()
		escreva("--------PONTUAÇÕES--------\n")
		para(inteiro x=0; x < 5; x++)
		{	
			escreva("Pontuação: "+pontuacao[x],"\n")
			
			se(pontuacao[x] > maiorP ){
				maiorP = pontuacao[x]
				}
		}
		
		//Saida
		escreva("-------MAIOR PONTUAÇÃO-------\n")
		escreva("Maior pontuação: "+ maiorP,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
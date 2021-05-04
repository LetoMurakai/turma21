programa
{
	
	funcao inicio()
	{
		inteiro MATRIZ [3][3]
		inteiro soma = 0
		inteiro diagonal =0

		para(inteiro linha = 0; linha < 3; linha++)
		{
			para(inteiro coluna = 0; coluna < 3 ; coluna++)
			{
				escreva("Valor da matriz : ")
				leia(MATRIZ[linha][coluna])
				soma+= MATRIZ[linha][coluna]
				se(linha == coluna){
					diagonal += MATRIZ [linha][coluna]
					}
				
			}	
		}
		limpa()
		escreva("---Matriz---\n")
		para(inteiro linha = 0; linha < 3; linha++)
		{
			para(inteiro coluna = 0; coluna < 3 ; coluna++)
			{
				escreva("[",MATRIZ[linha][coluna],"]")
			}
			escreva("\n")
		}
		escreva("\nResultados\n")
		escreva("Total da Matriz: ",soma,"\n")
		escreva("Soma diagonal: ",diagonal)
		escreva("\n-----fim-----")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
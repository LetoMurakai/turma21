programa
{
	
	funcao inicio()
	{
		/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
			apresente no final o total do somatório, a média e o total de valores lidos. O programa
			deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
			positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
			negativo.
		 
		 */
		//Variaveis
		real valor
		real soma
		//Entradas//processamento
		soma=0
		escreva("Digite um valor para a soma diferente de 0: ")
		leia(valor)
		enquanto(valor > 0)
		{ 
			soma = soma + valor
          	escreva("Total: "+soma,"\n")
          	escreva("Digite um valor para a soma diferente de 0: ")
          	leia(valor)
		}
		//Saida
		escreva("Resultado soma: "+soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 771; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
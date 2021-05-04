programa
{
	
	funcao inicio()
	{
		/*
		  8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
			for maior que 100, caso contrário imprimi-la com o valor zero.
		*/

		//Variaveis
		inteiro N

		//entrada
		escreva("um numero de 100 a infinito : ")
		leia(N)
		escreva("\n")
		
		//Processamento
		escolha (N)
		{	
			caso N: se (N >= 100) escreva(N,"\n")
			
			caso contrario: se (N < 100) escreva("0\n")
			
		}
		
	
		
		/*se( N >= 100 ){
			escreva(N,"\n")
		}
		senao{
				escreva("0\n")
			}*/
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
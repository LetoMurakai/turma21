programa
{
	
	funcao inicio()
	{
		/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
			múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
		 */
		//Variaveis
		inteiro numero,soma
		numero=3
		soma=0
		
		//Entradas/Processamento
		escreva("Soma dos numeros multiplos de 3 de 1 ate 500: ")
		
		para(numero; numero <= 500 ; numero = numero + 3)
		{
			se(numero % 2 != 0 e numero % 3 == 0)
			{
				soma = soma + numero
				escreva("\nSoma dos numeros multiplos = ",soma)
			}
		}
		//Saida
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
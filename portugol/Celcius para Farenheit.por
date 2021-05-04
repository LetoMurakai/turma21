programa
{
	
	funcao inicio()
	{
		//váriaveis* 
		cadeia nome
		real temperatura
		real resultado

		//entradas*
		escreva ("Digite seu nome: ")
		leia (nome)
		escreva ("Qual a temperatura atual em Farenheit ? ")
		leia (temperatura)
		
		//processamento*
		resultado = ((temperatura - 32) * 5/9)

		//saídas*
		escreva("A temperatura atual em Celcius e: "+resultado)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
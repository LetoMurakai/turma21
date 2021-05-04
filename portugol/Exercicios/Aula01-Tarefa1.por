programa
{
	
	funcao inicio()
	{
		//Variaveis
		const inteiro diasDoAno = 365
		const inteiro diasDoMes = 30
		
		inteiro dias,meses,anos
		inteiro totalDias = 0
		
		//entradas
		escreva ("Informe sua idade?\n")
		escreva ("Idade: ")
		leia (anos)
		escreva ("Mês: ")
		leia (meses)
		escreva ("Dia: ")
		leia (dias)

		//processamento
		totalDias += (anos * diasDoAno) + (meses * diasDoMes) + dias
		
		//saida
		escreva ("\n","Você viveu: ",totalDias," dias da sua vida!","\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
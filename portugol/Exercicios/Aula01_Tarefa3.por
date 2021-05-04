programa
{
	
	funcao inicio()
	{
		inteiro tempoDuracao
		inteiro horas,minutos,segundos

		escreva ("Digite o tempo de duração em segundos:\n")
		leia(tempoDuracao)

		horas = (tempoDuracao / 3600)
		minutos = (tempoDuracao % 3600) / 60
		segundos = (tempoDuracao % 3600) % 60

		escreva("Hora: "+horas+"\n")
		escreva("Minutos: "+minutos+"\n")
		escreva("Segundos: "+segundos+"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
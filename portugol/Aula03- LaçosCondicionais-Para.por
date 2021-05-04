programa
{
	
	funcao inicio()
	{
		inteiro pesoFixo=0
		inteiro resultado=0
		real mediaPeso=0.00
		inteiro maior=0
		inteiro menor10=0
		
		para (inteiro y = 1; y<=5 ; y++){
			escreva("Digite peso *Valor Inteiro* : ")
			leia(pesoFixo)
			resultado = resultado + pesoFixo//Totalização
			se(pesoFixo > maior){
				maior = pesoFixo
				}
			se(pesoFixo < 10){
				menor10++
				}
		}
		mediaPeso = resultado / 5
		escreva("\nPeso total:",resultado)
		escreva("\nMédia de peso: ",mediaPeso)
		escreva("\nMaior peso: ",maior)
		escreva("\nMenor peso abaixo de 10: ",menor10)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
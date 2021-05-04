programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * 	O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
			percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
			Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
			escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
			consumidor.
		 */

		 //variaveis
		 const real pdistribuidor = 0.28 //28%
		 const real pimpostos = 0.45 //45%
		 
		 real custoConsumidor = 0.00 
		 real custoDeFabrica = 0.00
		 real percentagemDistribuidor = 0.00
		 real impostos = 0.00

		 //entradas
		 escreva("Valor de fabrica do carro: R$")
		 leia(custoDeFabrica)

		 //processamento
		 percentagemDistribuidor = mat.arredondar ((custoDeFabrica * pdistribuidor),3)
		 impostos =  mat.arredondar((custoDeFabrica * pimpostos),3)

		 custoConsumidor = custoDeFabrica + percentagemDistribuidor + impostos
		 
		 //saída
		 escreva("Nota Fiscal - EDCAR - Carro véio preço novo!\n")
		 escreva("CNPJ: 0000.000000.00000\n")
		 escreva("\n")
		 escreva("Custo de fabrica : R$ "+custoDeFabrica,"\n")
		 escreva("Distribuidor : R$ "+percentagemDistribuidor,"\n")
		 escreva("Impostos : R$ "+impostos,"\n")
		 escreva("Custo de consumidor : R$ "+custoConsumidor,"\n")
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 938; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
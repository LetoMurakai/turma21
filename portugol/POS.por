senao se(SELECAO[0] == 4) //Inicio POS
		{	
			inteiro movimentoP = 3
			cadeia SN="S,s,N,n", opcao="I,i,R,r"
			caracter adicionarNota = 'I', retirarNota = 'R'
			real credito=5.00
			escreva("-----------------------------------\n")
			escreva("----------NomeDaEscolaG02----------\n")
			escreva("-----Ensinar é o nosso forte!!-----\n")
			escreva("-----------------------------------\n")
			
			escreva("\nENSINO TIPO : POS\n")
			escreva("\nMatricula: "+matricula,"\n")
			escreva("CPF: "+cpf,"\n")
			escreva("Status 1 - Ativo e 2 - Inativo: "+status)
			se(status==verdadeiro)
		     	{
		     		escreva("\nAtivo\n")
		     	}
		     	senao
		     	{
		     		escreva("\nInativo\n")
		     	}
		     escreva("-----------------------------------\n")
		     	para(inteiro m = 1; m <= movimentoP; m++)
		     	{
		     		escreva("\nTotal atual: "+somaPontos)
		     		escreva("\nMovimento: I-Incluir nota ou R-Retirar nota: ")
		     		leia(opcao)
		     		escreva("\nValor: ")
		     		leia(pontos)
		     		escreva("Valor movimento: ",m,"\n")
		     	
		     	se(opcao == "I" ou opcao=="i")
		     		{
		     			somaPontos = somaPontos + pontos
		     			limpa()
		     		}
		     	senao se(opcao == "R" ou opcao=="r")
		     		{
		     			somaPontos = somaPontos - pontos
		     			limpa()	
		     		}
		     		escreva("Valor movimento: ",m," Total de movimentos 10\n")
		     		escreva("\nTotal de pontos: "+somaPontos,"\n")
		     	}
		     	escreva("\nDeseja continuar S/N ?: ")
		     	leia(SN)
		     	se(SN =="S" ou SN=="s")
		     		{
		     			escreva("\nnão sei oq faze\n")
		     		}
		     	senao se(SN =="N" ou SN=="n")
		     	{
		     		escreva("\nDeseja usar o CreditoPos ? ")
		     		leia(SN)
		     		se(SN =="S" ou SN=="s")
		     		{
		     			somaPontos = somaPontos + credito
		     		}
		     		escreva("\nTotal de pontos: "+somaPontos,"\n")
		     		}
		     	escreva("\nDeseja continuar S/N ?: ")
		     	leia(SN)
		     	
		} //Fim POS
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1966; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
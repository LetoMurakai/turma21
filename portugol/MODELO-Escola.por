programa
{	
	inclua biblioteca Matematica --> mat
	
	//Variaveis_Global
		inteiro matricula=1221
		cadeia cpf="000.000.000-00" 
		real pontos=0.00
		cadeia SN="S,s,N,n"
		caracter adicionarNota = 'I', retirarNota = 'R'
		logico status = verdadeiro
	//fim_Variaveis_Global	
	funcao inicio()
	{	
		//Menu
		inteiro SELECAO[6] = {1,2,3,4,5,6}
		enquanto(SELECAO[0] == SELECAO[0]){
		escreva("-----------------------------------\n")
		escreva("----------NomeDaEscolaG02----------\n")
		escreva("-----Ensinar é o nosso forte!!-----\n")
		escreva("-----------------------------------\n")
		//Entrada - Seleﾃｧﾃ｣o menu
		escreva("\n1 - BÁSICO\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR\n")
		//Entrada - Seleﾃｧﾃ｣o menu
		escreva("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ")
		leia(SELECAO[0])
		limpa()
		
		//Processamento - Tipo Ensino
		se(SELECAO[0] == 1)//1 - BASICO
		{
			escreva("-----------------------------------\n")
			escreva("----------NomeDaEscolaG02----------\n")
			escreva("-----Ensinar é o nosso forte!!-----\n")
			escreva("-----------------------------------\n")
			
			escreva("\nENSINO TIPO : BASICO\n")
			escreva("\nMatricula: "+matricula,"\n")
			escreva("CPF: "+cpf,"\n")
			escreva("Status 1 - Ativo e 2 - Inativo: ")
			leia(status)
			se(status==verdadeiro)
		     	{
		     		escreva("\nAtivo\n")
		     	}
		     	senao
		     	{
		     		escreva("\nInativo\n")
		     	}
		     escreva("-----------------------------------\n")

		}//FIM 1 - BASICO

		
		senao se(SELECAO[0] == 2)//Inicio MEDIO
		{
			escreva("-----------------------------------\n")
			escreva("----------NomeDaEscolaG02----------\n")
			escreva("-----Ensinar é o nosso forte!!-----\n")
			escreva("-----------------------------------\n")
			
			escreva("\nENSINO TIPO : MEDIO\n")
			escreva("\nMatricula: "+matricula,"\n")
			escreva("CPF: "+cpf,"\n")
			escreva("Status 1 - Ativo e 2 - Inativo: ")
			leia(status)
			se(status==verdadeiro)
		     	{
		     		escreva("\nAtivo\n")
		     	}
		     	senao
		     	{
		     		escreva("\nInativo\n")
		     	}
		     escreva("-----------------------------------\n")

		} //Fim MEDIO
		
		senao se(SELECAO[0] == 3)//Inicio GRADUACAO
		{
			escreva("-----------------------------------\n")
			escreva("----------NomeDaEscolaG02----------\n")
			escreva("-----Ensinar é o nosso forte!!-----\n")
			escreva("-----------------------------------\n")
			
			escreva("\nENSINO TIPO : GRADUACAO\n")
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
		} //Fim GRADUACAO
		
		senao se(SELECAO[0] == 4) //Inicio POS
		{
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
		} //Fim POS
		
		senao se(SELECAO[0] == 5)//Inicio MESTRADO
		{
			escreva("-----------------------------------\n")
			escreva("----------NomeDaEscolaG02----------\n")
			escreva("-----Ensinar é o nosso forte!!-----\n")
			escreva("-----------------------------------\n")
			
			escreva("\nENSINO TIPO : MESTRADO\n")
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
		} //Fim MESTRADO
		
		//Opﾃｧﾃ｣o 6 - Finalizar programa, ou retornar ao menu.
		se(SELECAO[0] == 6)//Inicio OPCAO SAIR
		{
		escreva("Desejá realmente sair ? S/N :")
		leia (SN)
			se(SN == "S" ou SN == "s"){
				escreva("Programa Finalizado com sucesso!\n")
				pare
			}
			se(SN == "N" ou SN == "n")
			{
				limpa()
			}
		}
		senao{ 
			 	escreva("Selecione uma opção válida. Escolha um número entre 1 e 6.")
			 }//FIM OPCAO SAIR
			 limpa()
	}//Fim enquanto
	}//Fim inicio
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
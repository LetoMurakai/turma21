programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		caracter opcao
		faca{
			escreva("******MENU******")
			escreva("Digite o código da opcao\n")
			escreva("\n1-Basico\n2-Medio\n3-Graduacao\n3-Pos\n4-Sair")
			leia(opcao)
			se (opcao == '1'){
				limpa()
				escreva("Ensino Basico")
				Util.aguarde(1000)
				}senao se (opcao == '2'){
				limpa()
				escreva("Ensino Medio")
				Util.aguarde(1000)
				}senao se(opcao == '3'){
				limpa()
				escreva("Ensino Graduacao")
				Util.aguarde(1000)
				}senao se(opcao == '4'){
				limpa()
				escreva("Ensino Pos")
				Util.aguarde(1000)
				}
			}enquanto (opcao != '5')
				escreva("Fim do programa!")
				
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 209; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
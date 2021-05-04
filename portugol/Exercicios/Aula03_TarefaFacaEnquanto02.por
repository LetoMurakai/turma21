programa
{
	
	funcao inicio()
	{
		/*2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
		números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
		1+2+3+4+5+6+7=28. 
		 */
		//Variaveis
		inteiro numero
		inteiro soma=0
		inteiro contador=1

		//Entrada e processamento
		escreva("Digite um número de 1 até 9: ")
		leia(numero)
		
		faca{
			soma = soma + contador
			contador = contador+1
		}
		enquanto(contador <= numero)
			escreva("\nA soma de todos os números de 1 até "+numero," é "+soma,"\n")
			
			limpa()
			
			se(contador > 10){
				escreva("Você não digitou um número de 1 até 9!!!\n")
				}
			
		//saida
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 556; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		/*6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
			categorias:
			Infantil A = 5 a 7 anos
			Infantil B = 8 a 11 anos
			Juvenil A = 12 a 13 anos
			Juvenil B = 14 a 17 anos
			Adultos = Maiores de 18 anos
		 */

		//Variaveis
		 inteiro idade = 0

		//Entrada
		 escreva("Digite a idade do nadador(a): ")
		 leia(idade)
		 escreva("\n")
		//Processamento
		se(idade == idade){
			se(idade == 5 e idade <= 7) escreva("Nadador(a) Infantil A, de 5 a 7 anos.")
			senao se(idade >= 8 e idade <= 11) escreva("Nadador(a) Infantil B, de 8 a 11 anos.")
			senao se(idade >= 12 e idade <= 13) escreva("Nadador(a) Juvenil A, 12 a 13 anos.")
			senao se(idade >= 14 e idade <= 17) escreva("Nadador(a) Juvenil B, 14 a 17 anos.")
			senao se(idade >= 18 e idade <= 49) escreva("Nadador(a) Adulto, maiores de 18 anos.")
			senao se(idade >= 50) escreva("Nadador(a) Véio, mais antigo que o computador.")
			se (idade <= 4) escreva("Não há classificação permitida para o Nadador(a).")
		}
		linha()
		//Saida
		escreva("\n")

	}
	funcao linha(){escreva("\n----------------------------------------------")}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 973; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
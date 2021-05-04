programa
{
	
	funcao inicio()
	{
	//Fazer um calculo com idade, genero e retornar onde a pessoa se encontra e com faixa etaria.
	//NOME: Objetivo  - somo dois números
	//INICIO
		//váriaveis* 
		cadeia nome
		caracter genero
		inteiro anoNasc
		inteiro idade
		inteiro ANOATUAL = 2021
		
		//entradas*
		escreva("Escreva seu nome: ")
		leia(nome)
		escreva("Qual seu ano de nascimento?: ")
		leia(anoNasc)
		escreva("Que gênero você se identifica * M (masculino), F (feminino), O (outro) ?: ")
		leia(genero)
		
		//processamento*
		idade = ANOATUAL - anoNasc

		se (genero == 'F' ou genero == 'f' ou genero == 'M' ou genero == 'm' ou genero == 'O' ou genero == 'o'){
			escreva("\n",nome+",sua idade é "+idade,", e você é ")
			se(idade <= 18){
	
				se(genero == 'F' ou genero == 'f')
					escreva("Jovem.")
				senao se(genero == 'M' ou genero == 'm')
					escreva("Jovem.")
				senao se(genero == 'O' ou genero == 'o')
					escreva("Jovem.")
			}
			
			se(idade <= 50){
				
				se(genero == 'F' ou genero == 'f')
					escreva("Adulta.")
				senao se(genero == 'M' ou genero == 'm')
					escreva("Adulto.")
				senao se(genero == 'O' ou genero == 'o')
					escreva("Adulte.")
			}
			se(idade > 50){
				
				se(genero == 'F' ou genero == 'f')
					escreva("Idosa.")
				senao se(genero == 'M' ou genero == 'm')
					escreva("Idoso.")
				senao se(genero == 'O' ou genero == 'o')
					escreva("Idose.")
			}
		}
	//FIM
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
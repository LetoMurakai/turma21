package projetoEscola;

import java.util.Scanner;

public class Parte4Pos {

	public static void main(String[] args) {
		//Variaveis_Global
		Estudante alune = new Estudante();
		Pos pos = new Pos();
		Scanner leia = new Scanner(System.in);
		//fim_Variaveis_Global
		int movimentoP = 2;
		String SN = "S,s,N,n", opcao = "I,i,R,r";
		
		{	
			System.out.println("-----------------------------------\n");
			System.out.println("-----------EducaNorteG02-----------\n");
			System.out.println("-----Ensinar é o nosso forte!!-----\n");
			System.out.println("-----------------------------------\n");
			
			System.out.println("\nENSINO TIPO : POS\n");
			System.out.println("\nMatricula:\n");
			System.out.println("CPF: "+alune.getCpf()+"\n");
			System.out.println("Status 1 - Ativo e 2 - Inativo: "+alune.isStatus());
			if(alune.isStatus()==true)
		     	{
		     		System.out.println("\nAtivo\n");
		     	}
		     	else
		     	{
		     		System.out.println("\nInativo\n");
		     	}
		     	System.out.println("-----------------------------------\n");
		     	for(int m = 1; m <= movimentoP; m++)
		     	{
		     		System.out.println("\nTotal atual: "+alune.getPontos());
		     		System.out.println("\nMovimento: I-Incluir nota ou R-Retirar nota: ");
		     		opcao = leia.next().toUpperCase();
		     		System.out.println("\nValor: ");
		     		int pontos = leia.nextInt();
		     		System.out.println("Valor movimento: "+m+"\n");
		     	
		     	if(opcao == "I")
		     		{
		     		 alune.adicionarNota(pontos);
		     			
		     		}
		     	else if(opcao == "R")
		     		{
		     			alune.retirarNota(pontos);
		     			
		     		}
		     	System.out.println("Valor movimento: "+m+" Total de movimentos 10\n");
		     	System.out.println("\nTotal de pontos: "+alune.getPontos()+"\n");
		     	}
		     	System.out.println("\nDeseja continuar S/N ?: ");
		     	SN = leia.next().toUpperCase();
		     	if(SN =="S");
		     		{
		     		System.out.println("\nVocê atingiu o limite de 10 movimentos!");
		     		}
		     		System.out.println("\nDeseja continuar S/N ?: ");
		     		SN = leia.next().toUpperCase();
		     	if(SN =="N");
		     	{
		     			System.out.println("\nDeseja usar o CreditoPos ? ");
		     			SN = leia.next().toUpperCase();
		     		if(SN =="S");
		     		{	
		     			if(pos.getQtde() >= pos.getBonus()) {
		     				
		     			}
		     			
		     		}
		     			System.out.println("\nTotal de pontos: "+alune.getPontos()+"\n");
		     		}
		     		System.out.println("\nDeseja continuar S/N ?: ");
		     		SN = leia.next().toUpperCase();
		     	
		} //Fim POS

	}

}

package projetoEscola;

import java.util.Scanner;

public class Parte4Pos {

	public static void main(String[] args) {
		//Variaveis_Global
		int matricula=1221, diaAniversario,contadorBoletim;
		double pontos=0.00, somaPontos=0.00;
		String cpf="000.000.000-00";
		boolean status =true;
		//fim_Variaveis_Global
		int movimentoP = 2;
		String SN = "S,s,N,n", opcao = "I,i,R,r";
		char adicionarNota = 'I', retirarNota = 'R';
		double credito=5.00;
		Scanner leia = new Scanner(System.in);
		
		{	
			System.out.println("-----------------------------------\n");
			System.out.println("-----------EducaNorteG02-----------\n");
			System.out.println("-----Ensinar é o nosso forte!!-----\n");
			System.out.println("-----------------------------------\n");
			
			System.out.println("\nENSINO TIPO : POS\n");
			System.out.println("\nMatricula: "+matricula,"\n");
			System.out.println("CPF: "+cpf,"\n");
			System.out.println("Status 1 - Ativo e 2 - Inativo: "+status);
			if(status==true);
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
		     		System.out.println("\nTotal atual: "+somaPontos);
		     		System.out.println("\nMovimento: I-Incluir nota ou R-Retirar nota: ");
		     		opcao = leia.next().toUpperCase().charAt(0);
		     		System.out.println("\nValor: ");
		     		pontos = leia.nextInt();
		     		System.out.println("Valor movimento: ",m,"\n");
		     	
		     	if(opcao == "I" ou opcao=="i")
		     		{
		     			somaPontos = somaPontos + pontos;
		     			
		     		}
		     	else if(opcao == "R" ou opcao=="r")
		     		{
		     			somaPontos = somaPontos - pontos;
		     			
		     		}
		     	System.out.println("Valor movimento: ",m," Total de movimentos 10\n")
		     	System.out.println("\nTotal de pontos: "+somaPontos,"\n")
		     	}
		     	System.out.println("\nDeseja continuar S/N ?: ");
		     	SN = leia.next().toUpperCase().charAt(0);
		     	se(SN =="S" ou SN=="s")
		     		{
		     		System.out.println("\nVocê atingiu o limite de 10 movimentos!");
		     		}
		     		System.out.println("\nDeseja continuar S/N ?: ");
		     		SN = leia.next().toUpperCase().charAt(0);
		     	se(SN =="N" ou SN=="n")
		     	{
		     			System.out.println("\nDeseja usar o CreditoPos ? ");
		     			SN = leia.next().toUpperCase().charAt(0);
		     		if(SN =="S" ou SN=="s")
		     		{
		     			somaPontos = somaPontos + credito;
		     		}
		     			System.out.println("\nTotal de pontos: "+somaPontos,"\n");
		     		}
		     		System.out.println("\nDeseja continuar S/N ?: ");
		     		SN = leia.next().toUpperCase().charAt(0);
		     	
		} //Fim POS

	}

}

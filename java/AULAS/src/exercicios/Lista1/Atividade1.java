package exercicios;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args){
		final int diasDoAno = 365;
		final int diasDoMes = 30;
		
		int dias,meses,anos;
		int totalDias = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe sua idade?\n");
		System.out.print("Idade: ");
		anos = leia.nextInt();
		System.out.print("Mês: ");
		meses = leia.nextInt();
		System.out.print("Dia: ");
		dias = leia.nextInt();

		totalDias += (anos * diasDoAno) + (meses * diasDoMes) + dias;
		
		System.out.print("\nVocê viveu: "+totalDias+" dias da sua vida!\n");
	}
}

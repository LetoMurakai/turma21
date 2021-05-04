package exercicios;

import java.util.Scanner;

public class Atividade8 {
	public static void main(String[] args) {
		final double pdistribuidor = 0.28;
		final double pimpostos = 0.45;
				 
		double custoConsumidor = 0.00;
		double custoDeFabrica = 0.00;
		double percentagemDistribuidor = 0.00;
		double impostos = 0.00;
		Scanner leia = new Scanner(System.in);
				
		System.out.print("Valor de fabrica do carro: R$");
		custoDeFabrica = leia.nextInt();
		System.out.print("\n");
		percentagemDistribuidor = Math.round(custoDeFabrica * pdistribuidor);
		impostos = Math.round(custoDeFabrica * pimpostos);

		custoConsumidor = custoDeFabrica + percentagemDistribuidor + impostos;
				 
		System.out.println("-------Nota Fiscal-------");
		System.out.println("CNPJ: 0000.000000.00000");
		System.out.print("\n");
		System.out.println("Custo de fabrica : R$ "+custoDeFabrica);
		System.out.println("Distribuidor : R$ "+percentagemDistribuidor);
		System.out.println("Impostos : R$ "+impostos);
		System.out.println("Custo de consumidor : R$ "+custoConsumidor);
	}
	
}

package exercicios.aula04_atividades;

import java.util.Scanner;

public class Atividade4 {
	/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
			menu de opções:
			(1) somar as duas matrizes
			(2) subtrair a primeira matriz da segunda
			(3) adicionar uma constante as duas matrizes
			(4) imprimir as matrizes
			Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
			da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
			própria matriz.
	 */
	public static void main(String[] args) {
		double matriz1[][] = new double[2][2];
		double matriz2[][] = new double[2][2];
		double matrizSoma[][] = new double[2][2];
		double matrizSubtrai[][] = new double[2][2];
		double auxConstante[][] = new double[2][2];
		char op = ' ';
		Scanner leia = new Scanner(System.in);
		
		
		for(int linha=0;linha<2;linha++) {
			for(int coluna=0;coluna<2;coluna++) {
				System.out.printf("Valor da matriz1 posição %d - %d : ",linha,coluna);
				matriz1[linha][coluna] = leia.nextDouble();
				System.out.printf("Valor da matriz2 posição %d - %d : ",linha,coluna);
				matriz2[linha][coluna] = leia.nextDouble();
			}
		}
		do {
			System.out.println("\n1 - somar as duas matrizes\n2 - subtrair a primeira matriz da segunda\n3 - adicionar uma constante as duas matrizes\n4 - imprimir as matrizes");
			System.out.println("Digite o número da sua escolha: ");
			op = leia.next().charAt(0);
			switch(op) {
			case '1':
			{
				for(int linha=0;linha<2;linha++) {
					for(int coluna=0;coluna<2;coluna++) {
						matrizSoma[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna]; 
						System.out.printf("soma de m1 + m2 na posição %d - %d = %.0f + %.0f --> %.0f\n",linha,coluna,matriz1[linha][coluna],matriz2[linha][coluna],matrizSoma[linha][coluna]);
					}
				}
			}
			break;
			case '2':{
				for(int linha=0;linha<2;linha++) {
					for(int coluna=0;coluna<2;coluna++) {
						matrizSubtrai[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna]; 
						System.out.printf("A subtraçaõ m1 - m2 na posição %d - %d = %.0f - %.0f --> %.0f\n",linha,coluna,matriz1[linha][coluna],matriz2[linha][coluna],matrizSubtrai[linha][coluna]);
					}
				}
			}
			break;
			case '3':{
				System.out.print("Digite o valor da constante: ");
				final double VALOR = leia.nextDouble();
				for (int linha=0;linha<2; linha++) {
					for (int coluna = 0; coluna<2; coluna++) 
					{
						matriz1[linha][coluna]+=VALOR;
						matriz2[linha][coluna]+=VALOR;
					}
				}	
			}
			break;
			case '4':{
				System.out.println("MATRIZ 1");
				for (int linha=0;linha<2; linha++) {
					for (int coluna = 0; coluna<2; coluna++) 
					{
						System.out.printf("%.0f\t",matriz1[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("MATRIZ 2");
				for (int linha=0;linha<2; linha++) {
					for (int coluna = 0; coluna<2; coluna++) 
					{
						System.out.printf("%.0f\t",matriz2[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("MATRIZ SOMA");
				for (int linha=0;linha<2; linha++) {
					for (int coluna = 0; coluna<2; coluna++) 
					{
						System.out.printf("%.0f\t",matrizSoma[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("MATRIZ SUBTRAI");
				for (int linha=0;linha<2; linha++) {
					for (int coluna = 0; coluna<2; coluna++) 
					{
						System.out.printf("%.0f\t",matrizSubtrai[linha][coluna]);
					}
					System.out.println();
				}
			}
			break;
			default:
			}
		}while(op != 4);
	}
	
	

}

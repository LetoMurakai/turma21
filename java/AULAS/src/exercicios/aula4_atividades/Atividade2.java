package exercicios.aula4_atividades;

import java.util.Scanner;

public class Atividade2 {
	/*2- Faça um programa que receba 6 números inteiros e mostre:
		• Os números pares digitados;
		• A soma dos números pares digitados;
		• Os números ímpares digitados;
		• A quantidade de números ímpares digitados.
	 */
	public static void main(String[] args) {
		//Variaveis
		int numeros[] = new int[6];
		int somaPares =0;
		int qtdImpares =0;
		Scanner leia = new Scanner(System.in);
		
		for(int x= 0; x < numeros.length; x++) {
			System.out.printf("Digite 6 números inteiros:");
			numeros[x] =leia.nextInt();
		}
		System.out.print("Números pares: ");
		for (int x : numeros) {
			if(x%2 == 0 && x != 0) {
				System.out.print(x+",");
				somaPares += x;
			}	
		}
		System.out.printf("\nSoma dos números pares digitados: %d",somaPares);
		System.out.println();
		System.out.print("\nNúmeros ímpares: ");
		for (int i : numeros) {
			if(i%2 != 0 && i != 0) {
				System.out.print(i+",");
				qtdImpares++;
			}
		}
		System.out.printf("\nQuantidade de vezes que números ímpares foram digitados: %d",qtdImpares);
	}

}

package exercicios.aula4_atividades;

import java.util.Random;

public class Atividade3 {
	//3-Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	public static void main(String[] args) {
		//Variaveis
		int matriz[][] = new int[3][3];
		int contador = 0;
		Random gerador = new Random();
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = (gerador.nextInt(21));
				if(matriz[linha][coluna] > 10) {
					System.out.print("|"+matriz[linha][coluna]);
					contador++;
				}
			}
		}
		System.out.print("\nNúmeros maiores de 10: "+contador);

	}

}

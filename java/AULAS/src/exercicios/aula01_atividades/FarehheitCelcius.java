package exercicios.aula01_atividades;

import java.util.Scanner;

public class FarehheitCelcius {
	public static void main(String[] args) {
		// Variaveis
		String nome;
		float temperaturaF, resultado;
		Scanner leia = new Scanner(System.in);

		// Entradas
		System.out.println("Escreva seu nome: ");
		nome = leia.next();

		System.out.print("Temperatura em Farehheit: ");
		temperaturaF = leia.nextFloat();

		resultado = ((temperaturaF - 32) * 5 / 9);

		System.out.println("Ola " + nome + ", a temperatura atual em Celcius é: " + resultado);

	}
}

package exercicios.Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Atividade4 {
	/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado. 
	 */
	public static void main(String[] args) {
		//Variaveis
		int numero;
		double raiz = 2,potencia;
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		if(numero <= 0) {
			System.out.print("Número 0 é neutro!!! ");
		}else if((numero%2)==0) {
			raiz = Math.sqrt(numero);
			System.out.println("Par");
			System.out.printf("A raiz quadrada de "+numero+" é %.2f",raiz);
		}else {
			potencia = (numero * numero);
			System.out.println("Impar");
			System.out.printf("A segunda potência de "+numero+" é %.2f",potencia);
		}
	}

}

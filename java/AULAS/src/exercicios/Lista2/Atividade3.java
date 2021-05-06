package exercicios.Lista2;

import java.util.Scanner;

public class Atividade3 {
	/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
		 10-14 infantil
		 15-17 juvenil
		 18-25 adulto 
	 */
	public static void main(String[] args) {
		//Variaveis
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual sua idade ?");
		idade = leia.nextInt();
		
		if(idade < 10 || idade > 25){
			System.out.println("Sua categoria não se encontra no sitema!");
		}else if(idade == 10 || idade <= 14) {
			System.out.println("Parabéns você se encontra na faixa infantil - 10 a 14anos.");
		}else if(idade == 15 ||idade <= 17) {
			System.out.println("Parabéns você se encontra na faixa juvenil - 15 a 17anos.");
		}else if(idade == 18 ||idade <= 25) {
			System.out.println("Parabéns você se encontra na faixa adulto - 18 a 25anos.");
		}
	}

}

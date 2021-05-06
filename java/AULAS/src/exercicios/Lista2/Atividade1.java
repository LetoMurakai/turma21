package exercicios.Lista2;

import java.util.Scanner;

public class Atividade1 {
	//Faça um programa que receba três inteiros e diga qual deles é o maior.
	public static void main(String[] args) {
		//Variaveis
		int num;
		int contador=2;
		int maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Número 1: ");
		num = leia.nextInt();
		maior = num;
		while(contador <= 3){
		      System.out.print("Número " +contador+ ": ");
		      num = leia.nextInt();
		 
		      if(num > maior){
		       maior = num;
		      }
		 
		      contador++;
		     }
		
		System.out.print("O maior número digitado foi: "+maior);
		
	}

}

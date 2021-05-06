package exercicios.Lista2;

import java.util.Scanner;

public class Atividade2 {
	//2- Faça um programa que entre com três números e coloque em ordem crescente.
	public static void main(String[] args) {
		//Variaveis
		int a = 0,b = 0,c = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Escreva o primeiro numero: ");
		a = leia.nextInt();
		System.out.print("Escreva o segundo numero: ");
		b = leia.nextInt();
		System.out.print("Escreva o terceiro numero: ");
		c = leia.nextInt();
		
		if(a > b && a > c && b > c){
			System.out.printf("Ordem: "+a+","+b+","+c);
		}else if(a > b && a > c && b < c){
			System.out.printf("Ordem: "+a+","+c+","+b);
		}else if(a < b && a > c && b > c){
			System.out.printf("Ordem: "+b+","+a+","+c);
		}else if(a < b && a < c && b > c){
			System.out.printf("Ordem: "+b+","+c+","+a);
		}else if(a > b && a < c && b < c){
			System.out.printf("Ordem: "+c+","+a+","+b);
		}else if(a < b && a < c && b < c){
			System.out.printf("Ordem: "+c+","+b+","+a);
		}
	}

}

package exercicios.aula03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		//Variaveis
		int numero,par=0,impar=0;
		
		for(int i = 0; i < 3;i++) {
			System.out.println("Escreva um número");
			numero = leia.nextInt();
			if((numero%2)==0) {
				par = par + 1;
			}else {
				impar = impar + 1;
			}
		}
		System.out.printf("Pares: %d ",par);
		System.out.printf("Ímpares: %d ",impar);
		
	}

}

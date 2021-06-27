package exercicios.aula03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0 ;
		do {
			System.out.println("Digite um número inteiro : ");
			num= leia.nextInt();
			soma+=num;
		}while(num!=0);
		leia.close();
		System.out.printf("A soma dos valores adicionados é : %d",soma);
	}
}
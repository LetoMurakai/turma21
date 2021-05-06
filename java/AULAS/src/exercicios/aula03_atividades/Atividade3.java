package exercicios.aula03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade3 {
	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	 *21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	 *idade for =-99. (WHILE)
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		//Variaveis
		int idade=0;
		int menor21=0,maior50=0;
		
		while(idade != 99) {
			System.out.print("\nEscreva a idade: ");
			idade = leia.nextInt();
			if(idade <= 21) {
				System.out.printf("Idade: %d ",idade);
				menor21 = menor21 +1;
			}else if(idade >= 50) {
				System.out.printf("Idade: %d ",idade);
				maior50 = maior50 +1;
			}else {
				System.out.printf("Idade: %d",idade);
			}
		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d\n",menor21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d\n",maior50);
	}

}

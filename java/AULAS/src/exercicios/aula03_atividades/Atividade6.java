package exercicios.aula03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade6 {
	/*Escrever um programa que receba vários números inteiros no teclado. E no
     *final imprimir a média dos números múltiplos de 3. Para sair digitar
	 *0(zero).(DO...WHILE)
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		//Variaveis
		int numero=0,multiplo3=0;
		double media=0.00;
		
		System.out.println("*Digite 0(zero) para sair!*");
		do {
			System.out.print("Digite qualquer número inteiro: ");
			numero = leia.nextInt();
			if(numero%3==0 && numero != 0) {
				media = media + numero;
				multiplo3++;
			}
		}while(numero != 0);
			System.out.printf("A média dos multiplos de 3 é: %.2f",(media/multiplo3));
	}

}

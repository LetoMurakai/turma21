package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Se_Senao {

	public static void main(String[] args) {
		//Variaveis
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.print("Escreva um número inteiro positivo: ");
		num = leia.nextInt(); 
		
		/* Se for zero, é neutro.
		 * Senao se menor que zero, número negativo.
		 * Senao se número modulo de 2 for igual a zero = par.
		 * Senão é igual a impar.
		 */
			if(num == 0){
			System.out.print("O número 0 é neutro!");
			}
			else if(num <= 0){
				System.out.print("Número negativo!!!");
			}
			else if((num%2)==0){
				System.out.print("O número é par!");
			}else {
				System.out.print("O número é ímpar!");
			}
		}

}

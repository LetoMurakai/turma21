package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor;
		String nomes[] = new String[3];
		
		try {
			
			System.out.print("Digite o númedo da posição 1 para cadastro de nome: ");
			valor = leia.nextInt();
			System.out.print("Nome da pessoa a ser cadastrada ?: ");
			nomes[valor] = leia.next().toUpperCase();
			System.out.println(nomes[valor]);
			
		}catch(ArrayIndexOutOfBoundsException erro){
			System.out.println("Voce colocou um tamanho de vetor maior que o atual!!!");
		}
		catch(InputMismatchException erro){
			System.out.println("Voce colocou uma letra ao invés de um número!!!");
		}
		finally {
			System.out.println("Volte sempre!");
		}
		
	}

}

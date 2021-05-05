package exercicios;

import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.print("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.print("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.print("Digite o valor de y2: ");
		y2 = leia.nextDouble();

		double distancia =Math.sqrt((Math.pow((x2 - x1),2.0) + Math.pow((y2 - y1),2.0)));

		System.out.print("A distancia entre os pontos é de "+distancia);
	}
}

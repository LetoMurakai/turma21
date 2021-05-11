package exercicios.aula05_atividades;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		double altura = 0;
		double base = 0;
		double area = 0;
		double altura2 = 0;
		double base2 = 0;
		double area2 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a base do tiragulo1: ");
		base = leia.nextDouble();
		System.out.print("Informe a altura do tiragulo1: ");
		altura = leia.nextDouble();
		System.out.print("\n");
		
		System.out.print("Informe a base do tiragulo2: ");
		base2 = leia.nextDouble();
		System.out.print("Informe a altura do tiragulo2: ");
		altura2 = leia.nextDouble();
		System.out.print("\n");
		area=altura*base;
		area2=altura2*base2;
		
		if(area > area2) {
			System.out.printf("O triangulo 1 tem a maior área. Area total de %.2f",area);
		}else if(area == area2) {
			System.out.printf("O triângulo 1 e 2 tem a mesma área. Area total de %.2f",area);
		}
		else{
			System.out.printf("O triângulo 2 tem a maior área. Area total de %.2f",area2);
		}
	}
}

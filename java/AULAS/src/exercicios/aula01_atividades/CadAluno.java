package exercicios.aula01_atividades;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		//Variaveis
		String nome ="";
		int anoNascimento = 0;
		char tipo = ' ';
		double salario = 0.00;
		boolean vivo = true;
		
		Scanner leia = new Scanner(System.in);
		
		//entradas
		System.out.print("Digite o nome: ");
		nome = leia.nextLine().toUpperCase();
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.print("Digite M/F/O: ");
		tipo = leia.next().toUpperCase().charAt(0);
		System.out.print("Salario: ");
		salario = leia.nextDouble();
		
		//%s - String| %d - int| %f.2 - double| %c - char.
		
		//Processamentos
		System.out.printf("Nome: %s, idade %d, tipo: %c, salario %f",nome,(2021 - anoNascimento),tipo,salario);
		//Saidas
	}

}

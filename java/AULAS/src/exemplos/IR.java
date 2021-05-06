package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class IR {
	public static void main(String[] args) {
		//Variaveis
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		String nome = "";
		char tipo = ' ', emergencial = ' '; //M,F,O
		boolean SIM = true;
		double salario = 0.00,taxa;
		
		//Entradas
		System.out.print("Escreva seu nome");
		nome = leia.nextLine();
		System.out.print("Como você se identifica ? (M,F,O): ");
		tipo = leia.next().toUpperCase().charAt(0);
		System.out.print("Emergencial S/N ?");
		emergencial = leia.next().toUpperCase().charAt(0);
		
		if(emergencial == 'S') {
			SIM = true;
		}
		
		System.out.print("Salario bruto ?");
		salario = leia.nextDouble();
		
		if((salario * 12) >60000.0) {
			if(salario > 50000.0 && salario < 60000.0) {
				taxa = salario * 0.15;
				if(SIM) {
					System.out.print(nome+", você deve pagar R$ "+taxa+",de taxa R$"+3000.0+" de auxílio emergencial.");
				}else {
					System.out.print(nome+", você deve pagar R$ "+taxa);
				}
			}
		}
		else{ 
			taxa = salario * 0.25; 
			if(salario > 50000.0 && salario < 60000.0) {
				taxa = salario * 0.15;
				if(SIM) {
					System.out.print(nome+", você deve pagar R$ "+taxa+",de taxa R$"+3000.0+" de devolução do auxílio emergencial.");
				}else {
					System.out.print(nome+", você deve pagar R$ "+taxa);
				}
			}
		}
		
	}
}

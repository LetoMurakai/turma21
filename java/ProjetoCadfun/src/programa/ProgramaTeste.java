package programa;

import java.util.Scanner;

import classes.Funcionario;
import classes.Terceiro;

public class ProgramaTeste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); // Instanciamento do teclado
		
		Funcionario trab1 = new Funcionario("123-5",0,20.00,"Cleito"); // Instanciamento do objeto 1
		Terceiro trab2 = new Terceiro("123-5",0,20.00,"Cleito",10.00); // Instanciamento do objeto 2
		
		System.out.print("Insira horas trabalhadas do trab1: ");
		double horas = leia.nextDouble();
		
		trab1.setHorasTrabalhadas((int)horas);
		
		System.out.println(trab1.Salario());
		
		System.out.print("Insira horas trabalhadas do trab2: ");
		horas = leia.nextDouble();
		
		trab2.setHorasTrabalhadas((int)horas);
		
		System.out.println(trab2.Salario());
		
	}

}

package programa;

import java.util.Locale;
import java.util.Scanner;

import classes.Funcionario;
import classes.Terceiro;

public class ProgramaTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in); // Instanciamento do teclado
		
		Funcionario trab1 = new Funcionario(null, 0, 0, null); // Instanciamento do objeto 1
		
		Terceiro trab2 = new Terceiro(null, 0, 0, null,0); // Instanciamento do objeto 2
		trab2.setNome("Cleito");
		trab2.setMatricula("123-5");
		trab2.setHorasTrabalhadas(12.20);
		trab2.setValorHora(20.00);
		trab2.setAdicional(8.30);
		
		System.out.print("Insira o nome do trab1: ");
		String nome = leia.next();
		trab1.setNome(nome);
		
		System.out.print("Insira a matricula do trab1: ");
		String matricula = leia.next();
		trab1.setMatricula(matricula);
		
		System.out.print("Insira horas trabalhadas do trab1: ");
		double horas = leia.nextDouble();
		trab1.setHorasTrabalhadas((int)horas);
		
		System.out.print("Insira o valor da hora do trab1: ");
		double valorHoras = leia.nextDouble();
		trab1.setValorHora(valorHoras);
		
		
		System.out.println("\nNome: "+trab1.getNome()+"\nMatricula: "+trab1.getMatricula()+"\nHoras trabalhadas: "+trab1.getHorasTrabalhadas()+"\nValor hora: "+trab1.getValorHora());
		System.out.println("Total a receber: "+trab1.Salario());
		
		System.out.println("\nNome: "+trab2.getNome()+"\nMatricula: "+trab2.getMatricula()+"\nHoras trabalhadas: "+trab2.getHorasTrabalhadas()+"\nValor hora: "+trab2.getValorHora()+"\nAdicional: "+trab2.getAdicional());
		System.out.println("Total a receber: "+trab2.Salario());
		
	}

}

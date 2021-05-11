package programas;

import java.util.Scanner;

import classes.Basico;
import classes.Estudantes;

public class ProgramaTeste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = leia.next().toUpperCase();
		System.out.println("Digte a matricula: ");
		int matricula = leia.nextInt();
		System.out.println("Digte cpf: ");
		String cpf = leia.next();
		System.out.println("Digte dia aniversário: ");
		int dia = leia.nextInt();
		System.out.println("Digte a nota: ");
		double nota = leia.nextDouble();

		Basico alune1 = new Basico(matricula,cpf,dia);// instanciamento do objeto
		alune1.setNome(nome);
		alune1.adicionarNota(10);
		
		System.out.println("Nome: "+alune1.getNome()+" Matricula: "+alune1.getMatricula()+" Tirou nota: "+alune1.getPontos());
		
		System.out.println("dia atual");
		int diaAtual = leia.nextInt();
		alune1.bonusAniversario(diaAtual);
		
		System.out.println("Nome: "+alune1.getNome()+" Matricula: "+alune1.getMatricula()+" Tirou nota: "+alune1.getPontos()+" Apos método!");

		
	}

}

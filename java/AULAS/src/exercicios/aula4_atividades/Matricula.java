package exercicios.aula4_atividades;

import java.util.Scanner;

public class Matricula {
	/* Matricula Grupo G1 - G8
	 * participantes grupo;
	 * Lista de alunes; OK
	 * Matricula e nome - vetor
	 * Digite a matricula do aluno para cadastro nota
	 * digite nota
	 * Continua s/n
	 * casa n/ mostrar apenas os alunos com nota.
	 * vetor com notas
	 * vetor alunes
	 * vetor matricula
	 */
	public static void main(String[] args) {
		//Variaveis
		String alunes[]={"Alexandre Salerno","Alexsander da Silva Sousa","Aline Moreira Brilhante","Ana Flávia Porto Silva Neves","Andára Finot da Silva","arthur reis allen","Barbara dos Santos","Bruno Wesley Callachi Rocha","Dafhne Noemi da Silva Novais","David da Costa Mariano","Elielthon Soares de Souza","Erika Rosany de Almeida Lima","Fabricio Siqueira Macedo","Fernando Salomão Constancio","Giovanna Cirillo Torres","Guilherme Mendes Carvalho","Guilherme Monteiro Lopes","Isabelli Santos Silva","Israel Dantas da Silva","Jessica Yuki Toyota","Jonatas Michel de Cardoso Vieira","José Luis Correia dos Santos","Juliana Brito Favero Ribeiro","Lorrans Matildes Facca","Lucas Teodoro de Sousa","Maria Luísa Maricato","Mateus Rosendo Firmino de Oliveira","Matheus de Souza Barbosa","Nathalia Beatriz Silva Pereira","Pedro Henrique de Azevedo Magalhães","Renato Novais da Silva","Renato Yukio Ossiama Nakamura","Robson de Jesus Vasconcelos","Tainah Vinha","Vinicius Martins Santos"};
		String grupo[]={"Elielthon Soares de Souza","Andára Finot da Silva","Arthur reis allen"};
		int contador = 0;
		int nota = new int[35];
		int matricula[];
		char op = ' ';
		Scanner leia = new Scanner(System.in);
		
		//Entradas
		System.out.println("---Lista de alunes---\n");
		
		for(String x : alunes) {
			contador++;
			System.out.print("G1-"+contador+" "+x+"\n");
		}
		System.out.print("\nMatricula do alune: ");
		contador = leia.nextInt();
		
		if(contador != 0) {
			System.out.print("\nNome do alune: "+alunes[contador-1]);
			System.out.print("\nAcrescentar nota: ");
			nota = leia.nextInt();
			System.out.print("\nNota: "+nota[0]);
			
			System.out.print("\nContinua S/N?");
			op = leia.next().toUpperCase().charAt(0);
		}
	}
}

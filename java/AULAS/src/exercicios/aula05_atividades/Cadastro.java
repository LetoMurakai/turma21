package exercicios.aula05_atividades;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		entidadesCad pessoa = new entidadesCad();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o nome do amigo: ");
		pessoa.nome = leia.nextLine();
		System.out.print("Insira o ano de nascimento do amigo: ");
		pessoa.anoNascimento = leia.nextInt();
		System.out.print("Insira o genero do amigo (M,F,O) : ");
		pessoa.genero = leia.next().toUpperCase().charAt(0);
		System.out.print("O amigo está vivo ? (1 - Sim | 2 - Não)");
		pessoa.estado = leia.next().charAt(0);
		
		if(pessoa.estado == '1') {
			pessoa.vivo = true;
		}else {
			pessoa.vivo = false;
		}
		
		System.out.println();
		System.out.println("Seu amigo se chama " + pessoa.nome);
		pessoa.calcIdade();
		System.out.println("Genero: " + pessoa.genero);
		if (pessoa.vivo) {
			System.out.println("Seu amigo está vivo!");
		}
		else {
			System.out.println("Seu amigo não está vivo...");
		}
		
	}

}

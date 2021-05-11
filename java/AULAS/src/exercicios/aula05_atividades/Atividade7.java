package exercicios.aula05_atividades;

import java.util.Scanner;

public class Atividade7 {
	/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto paciente, defina as instancias deste
		objeto e apresente as informações deste objeto no console.
	 */
	public static void main(String[] args) {
		Paciente paciente = new Paciente();//instanciou o objeto do tipo Paciente.
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o nome do paciente: ");
		paciente.nome = leia.nextLine().toUpperCase();
		System.out.print("Informe o ano de nascimento do paciente: ");
		paciente.anoNascimento = leia.nextInt();
		System.out.print("Qual o genero do paciente ? (M,F,O): ");
		paciente.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("O paciente está vivo ?");
		System.out.print(" 1 - Sim | 2 - Não ");
		paciente.estado = leia.next().charAt(0);
		System.out.println();
		
		if(paciente.estado == '1') {
			paciente.vivo = true;
		}else {
			paciente.vivo = false;
		}
		
		paciente.infoPaciente();
	}

}

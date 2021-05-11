package exercicios.aula05_atividades;

import java.util.Scanner;

public class Atividade1 {
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto cliente, defina as instancias deste
		objeto e apresente as informações deste objeto no console.
	 */
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Maria","000.000.000-x1",1234);
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o nome do cliente: ");
		cliente.nome = leia.nextLine().toUpperCase();
		
		cliente.cadCliente();

	}

}

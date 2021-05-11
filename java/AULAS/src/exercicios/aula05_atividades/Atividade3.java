package exercicios.aula05_atividades;

import java.util.Scanner;

public class Atividade3 {
	/*Crie uma classe produto eletrônico e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto produto eletrônico,
		defina as instancias deste objeto e apresente as informações deste objeto
		no console. 
	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ProdutoEletronico produto1 = new ProdutoEletronico("MimoPhone", "Smartphone", "MimoEletronic's", 1199.99);
		
		System.out.println("Funciona? ");
		produto1.funciona = leia.next().toUpperCase().charAt(0);
		
		System.out.println("___Informações do produto___");
		System.out.println("Nome do produto: "+produto1.nomeProduto);
		System.out.println("Tipo do produto: "+produto1.tipoProduto);
		System.out.println("Fabricante: "+produto1.marca);
		System.out.print("Funciona ?: ");
		if(produto1.funciona == 'S') {
			produto1.funcionando = true;
			System.out.println("Aparelho funcionando!!!");
		}else {
			System.out.println("Pane no sistema!!!!!!");
		}
		System.out.println("Preço do produto: "+produto1.precoProduto);
	}

}

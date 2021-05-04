package exemplos;

import java.util.Scanner;

public class OiMundo {
	public static void main(String[] args) {
		//Variaveis no java\\
		
		String nome; //cadeia
		int numero1; //inteiro
		int numero2; //inteiro
		double salario = 1150.25;//real
		char op = 'S';//caracter
		
		Scanner leia = new Scanner(System.in);//instanciar = criar um teclado = leia()
		
		System.out.println("Oi Mundo!!!"); //escreva("Oi Mundo!!!")
		System.out.println("Elielthon Soares de Souza"); //escreva("nome")
		//System.out.println("Soma: "+(numero1+numero2));
		
		System.out.print("Digite o nome: ");//escreva("")
		nome = leia.next(); //leia()
		System.out.println("Digite um numero: ");//escreva("")
		numero1 = leia.nextInt();//leia()
		System.out.println("Digite o segundo numero: ");//escreva("")
		numero2 = leia.nextInt();//leia()
		
		System.out.println(nome);//escreva("")
		System.out.println(numero1+numero2);//escreva("")
	}

}
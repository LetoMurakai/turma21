package exercicios.Lista1;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		int tempoDuracao;
		int horas,minutos,segundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o tempo de duração em segundos:\n");
		tempoDuracao = leia.nextInt();
		
		horas = (tempoDuracao / 3600);
		minutos = (tempoDuracao % 3600) / 60;
		segundos = (tempoDuracao % 3600) % 60;
		
		System.out.print("Hora: "+horas+"\n");
		System.out.print("Minutos: "+minutos+"\n");
		System.out.print("Segundos: "+segundos+"\n");
	}
}

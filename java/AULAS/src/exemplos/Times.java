package exemplos;

import java.util.Scanner;

public class Times {

public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);

	String times[] = { "São Paulo", "Santos", "Palmeiras", "Corinthians" };
	int pontos[] = new int[4];
	char resultado;

	for (int rodada = 0; rodada < 3; rodada++) {
		System.out.println("\n-------RODADA " + (rodada + 1) + "------\n");
		for (int x = 0; x < 4; x++) {
			System.out.println("\nJogo " + times[x] + " Digite G-ganhou, P-perdeu, E-empate: ");
			resultado = leia.next().toUpperCase().charAt(0);
			if (resultado == 'G') 
			{
				pontos[x] = pontos[x] + 3;
			} else if (resultado == 'P')
			{
				pontos[x] = pontos[x] + 0;
			} else if (resultado == 'E')
			{
				pontos[x] = pontos[x] + 1;
			}
		}
	}

	System.out.println("\n -------PLACAR FINAL------- \n");
	for (int i = 0; i < 4; i++) {
		System.out.println(times[i] + "  total de pontos: " + pontos[i] + "\n");
	}
}

}

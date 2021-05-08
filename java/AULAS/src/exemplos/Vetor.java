package exemplos;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int maiorPontuacao=0;
		int pontos[] = new int[5]; //0 - 4
		
		for(int x = 0; x < 5;x++){
			
			System.out.println("Digite sua pontuação nas atividades");
			pontos[x] = leia.nextInt();
			
			if(maiorPontuacao < pontos[x]) {
				maiorPontuacao = pontos[x];
			}	
		}
		System.out.println("Maior pontuação foi de: "+maiorPontuacao);
	}

}

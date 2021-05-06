package exemplos;

import java.util.Scanner;

public class LacoEnquanto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 1, somatorio = 0, media = 0, totalValoresLidos = 0, qtdVezes = 0;

		while (numero >= 0)
		{
			System.out.print("Informe um numero positivo: ");
			numero = leia.nextInt();

				somatorio = somatorio + numero;

					if (numero>0)
					{
						totalValoresLidos++;
					}

				media = somatorio / totalValoresLidos;
				
				}

		System.out.printf("\nA soma dos valores informados é de: %d ",somatorio);
		System.out.printf("\nA quantidade de vezes que foram informados numeros diferentes de 0 foi de: %d vezes",totalValoresLidos);
		System.out.printf("\nA média dos numeros informados é: %d ",media);
				
	}

}

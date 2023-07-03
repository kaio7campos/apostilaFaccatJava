package faccat;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		int valor1 = leia.nextInt();

		System.out.println("Digite o segundo valor");
		int valor2 = leia.nextInt();
		int maior = 0;
		int menor = 0;
		if (valor1 > valor2) {
			maior = valor1;
			menor = valor2;
		} else {
			maior = valor2;
			menor = valor1;
		}
		System.out.println("O maior valor é " + maior + " e o menor é " + menor);
		leia.close();
	}
}
/*
 * 20) Ler dois valores (considere que não serão lidos valores iguais) e
 * escrevê-los em ordem crescente.
 */
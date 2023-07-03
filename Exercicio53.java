package faccat;

import java.util.Scanner;

public class Exercicio53 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Digite um numero acima de dois");
			numero = leia.nextInt();
			if(numero <= 2) {
				System.out.println("Digite apenas numeros acima de dois !");
			}
		} while (numero <= 2);
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
		leia.close();

	}

}
/*
 * 53) Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e
 * N (inclusive). Considere que o N será sempre maior que ZERO.
 */

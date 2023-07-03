package faccat;

import java.util.Scanner;

public class Exercicio46 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		double valor1 = leia.nextDouble();
		double valor2 = 0;
		do {
			System.out.println("Digite o segundo valor");
			valor2 = leia.nextDouble();
			if (valor2 == 0) {
				System.out.println("Digite um valor diferente de zero!");
			}
		} while (valor2 == 0);
		double divisao = valor1 / valor2;
		System.out.println("O valor da divisão é: " + divisao);
		leia.close();
	}
}
/*
 * 46) Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício [44] caso o
 * segundo valor informado seja ZERO.
 */

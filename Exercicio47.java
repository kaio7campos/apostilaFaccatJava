package faccat;

import java.util.Scanner;

public class Exercicio47 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o segundo valor");
		double valor1 = leia.nextDouble();
		double valor2 = 0;
		while(valor2 == 0) {
			System.out.println("Digite o segundo valor");
			valor2 = leia.nextDouble();
			if(valor2 == 0) {
				System.out.println("O segundo valor não pode ser zero!");
			}
		}
		double divisao = valor1 / valor2;
		System.out.println("O resultado da divisão é: " + divisao);
		leia.close();
	}
}
/*
 * 47) Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício [45] caso o
 * segundo valor informado seja ZERO.
 */
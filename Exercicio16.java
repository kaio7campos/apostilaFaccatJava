package faccat;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Olá quantas maças gostaria ?");
		int macas = leia.nextInt();
		double total = 0;
		if (macas < 12) {
			total = macas * 1.30;
		} else {
			total = macas * 1;
		}
		System.out.println("O valor da sua compra foi de: R$" + total);
		leia.close();
	}
}
/*
 * 16) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$
 * 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o número
 * de maçãs compradas, calcule e escreva o custo total da compra.
 */
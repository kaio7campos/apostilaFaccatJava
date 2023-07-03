package faccat;

import java.util.Scanner;

public class Exercicio36 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a idade do primeiro homem");
		int homem1 = leia.nextInt();

		System.out.println("Digite a idade do segundo homem");
		int homem2 = leia.nextInt();

		System.out.println("Digite a idade da primeira mulher");
		int mulher1 = leia.nextInt();

		System.out.println("Digite a idade da segunda mulher");
		int mulher2 = leia.nextInt();

		int soma1 = 0;
		int soma2 = 0;
		if (homem1 > homem2 && mulher1 > mulher2) {
			soma1 = homem1 + mulher2;
			soma2 = homem2 + mulher1;
		} else {
			soma1 = homem2 + mulher1;
			soma2 = homem1 + mulher2;
		}
		System.out.println("A soma do homem mais velho com a mulher mais nova é: " + soma1
				+ " a soma dom homem mais novo com a mulher mais velha é " + soma2);
		leia.close();
	}
}
/*
 * 36) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
 * (considere que as idades dos homens serão sempre diferentes entre si, bem
 * como as das mulheres). Calcule e escreva a soma das idades do homem mais
 * velho com a mulher mais nova, e o produto das idades do homem mais novo com a
 * mulher mais velha.
 */
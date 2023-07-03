package faccat;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua primeira nota:");
		float nota1 = leia.nextFloat();
		
		System.out.println("Digite sua segunda nota:");
		float nota2 = leia.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		if (media >= 6) {
			System.out.println("O aluno esta aprovado, sua media é: " + media);
		} else {
			System.out.println("O aluno esta reprovado, sua media é: " + media);
		}
		System.out.println("Sua media é: " + media);
		leia.close();
	}
}
/*
 * 17) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média
 * aritmética simples e escrever uma mensagem que diga se o aluno foi ou não
 * aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
 * Escrever também a média calculada.
 */
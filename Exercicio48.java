package faccat;

import java.util.Scanner;

public class Exercicio48 {
	public static void main(String[] srgs) {
		Scanner leia = new Scanner(System.in);
		float nota1 = 0;
		float nota2 = 0;
		
		do {
			System.out.println("Digite sua primeira nota");
			nota1 = leia.nextFloat();
			if(nota1 < 0 || nota1 > 10) {
				System.out.println("Digite somente notas de zero a dez !");
			}
		} while (nota1 < 0 || nota1 > 10);
		
		do {
			System.out.println("Digite sua segunda nota");
			nota2 = leia.nextFloat();
			if(nota2 < 0 || nota2 > 10) {
				System.out.println("Digite somente notas de zero a dez !");
			}
		}while (nota2 < 0 || nota2 > 10);
		
		
		float media = (nota1 + nota2) / 2;
		System.out.println("Sua media é: " + media);
		leia.close();
		
		
	}
}
/*
 * 48) Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um
 * aluno, calcule e imprima a média (simples) desse aluno. Só devem ser aceitos
 * valores válidos durante a leitura (0 a 10) para cada nota.
 */

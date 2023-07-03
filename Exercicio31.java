package faccat;

import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor de A");
		double a = leia.nextDouble();
		
		System.out.println("Digite o valor de B");
		double b = leia.nextDouble();
		
		System.out.println("Digite o valor de C");
		double c = leia.nextDouble();
		
		if (a < b+c && b < a+c && c < b+a ) {
			System.out.println("Esses valores formam um triângulo");
		} else {
			System.out.println("Esses valores não formam um triângulo");
		}
		leia.close();
	}
}
/*
 * 31) Ler 3 valores (A, B e C) representando as medidas dos lados de um
 * triângulo e escrever se formam ou não um triângulo. OBS: para formar um
 * triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
 */
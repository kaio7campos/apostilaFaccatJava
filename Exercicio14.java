package faccat;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor = leia.nextInt();
		if (valor > 10) {
			System.out.println("O valor é maior que dez!");
		} else if  (valor == 10) {
			System.out.println("Valor é igual a dez!");
		} else {
			System.out.println("O valor é menor que dez!");
		}
		leia.close();
	}
}

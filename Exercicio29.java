package faccat;

import java.util.Scanner;

public class Exercicio29 {
	static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o segundo valor");
		int valor2 = leia.nextInt();
		
		System.out.println("Digite o terceiro valor");
		int valor3 = leia.nextInt();
		int somaDosMaiores = 0;
		
		if (valor1 > valor2 && valor1 > valor3) {
			if (valor2 > valor3) {
				somaDosMaiores = valor1 + valor2;
			} else {
				somaDosMaiores = valor1 + valor3;
			}
		} else if (valor2 > valor1 && valor2 > valor3) {
			if(valor1 > valor3) {
				somaDosMaiores = valor2 + valor1;
			} else {
				somaDosMaiores = valor2 + valor3;
			}
		} else {
			if (valor1 > valor2) {
				somaDosMaiores = valor3 + valor1;
			} else {
				somaDosMaiores = valor3 + valor2;
			}
			System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);
			leia.close();
		}
		
		
	}
}
/*
 * 29) Ler 3 valores (considere que não serão informados valores iguais) e
 * escrever a soma dos 2 maiores.
 */
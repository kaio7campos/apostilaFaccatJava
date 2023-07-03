package faccat;

import java.util.Scanner;

public class Exercicio59 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valoresNegativos = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o valor º" + i);
			int valor = leia.nextInt();
			if(valor < 0) {
				valoresNegativos++;
			}
		}
		System.out.println("Foram inseridos " + valoresNegativos + " valores negativos.");
		leia.close();
	}
}
/* 59) Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS. */
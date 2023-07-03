package faccat;

import java.util.Scanner;

public class Exercicio61 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float somaDosValores =0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o º" + i + " valor.");
			int valor = leia.nextInt();
			somaDosValores += valor;
		}
		float media = somaDosValores / 10;
		System.out.println("A media dos valores lidos é: " + media);
		leia.close();
	}
}
/*61) Ler 10 valores, calcular e escrever a média aritmética desses valores lidos. */
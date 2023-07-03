package faccat;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o segundo valor");
		int valor2 = leia.nextInt();
		int maior = 0;
		
		if (valor1 > valor2) {
			maior = valor1;
		} else {
			maior = valor2;
		}
		System.out.println("O maior valor é " + maior);
		leia.close();
		
		
	}
}
	
/*
 * 19) Ler dois valores (considere que não serão lidos valores iguais) e
 * escrever o maior deles.
 */
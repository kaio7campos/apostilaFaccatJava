package faccat;

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		double valor1 = leia.nextDouble();
		
		System.out.println("Digite o segundo valor");
		double valor2 = leia.nextDouble();
		
		System.out.println("Digite o terceiro valor");
		double valor3 = leia.nextDouble();
		double menor, meio, maior;
		
		if(valor1 < valor2 && valor1 < valor3) {
			menor = valor1;
			if(valor2 < valor3) {
				meio = valor2;
				maior = valor3;	
			} else {
				meio = valor3;
				maior = valor2;
			}
		} else if(valor2 < valor1 && valor2 < valor3) {
			menor = valor2;
			if(valor1 < valor3) {
				meio = valor1;
				maior = valor3;
			} else {
				meio = valor3;
				maior = valor2;
			}
		} else {
			menor = valor3;
			if(valor1 < valor2) {
				meio = valor1;
				maior = valor2;
			} else {
				meio = valor2;
				maior = valor1;
			}
		}
		System.out.println("A ordem dos valores é: " + menor + ", " + meio + ", " + maior);
		leia.close();
	}
}
/*
 * 30) Ler 3 valores (considere que não serão informados valores iguais) e
 * escrevê-los em ordem crescente.
 */

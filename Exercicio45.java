package faccat;

import java.util.Scanner;

public class Exercicio45 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		double valor1 = leia.nextDouble();
		double valor2 = 0;
		
		while(valor2 == 0) {
			System.out.println("Digite o segundo valor");
			valor2 = leia.nextDouble();
			if(valor2 == 0) {
				System.out.println("Digite um valor diferente de zero!");
			}
		}
		double divisao = valor1 / valor2;
		System.out.println("O resultado da divisão é: " + divisao);
		leia.close();
	}
}
/*
 * 44) Escreva um algoritmo para ler 2 valores e se o segundo valor informado
 * for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode
 * ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor
 * lido pelo segundo valor lido. (utilizar a estrutura REPITA). 
 * 
 * 45) Reescreva o exercício anterior utilizando a estrutura ENQUANTO.
 */

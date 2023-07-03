package faccat;

import java.util.Scanner;

public class Exercicio57 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor;
		do {
			System.out.println("Digite um valor inteiro");
			valor = leia.nextInt();
			if(valor < 1 || valor > 10) {
				System.out.println("Digite somente numeros de um a dez !");
			}
			
		}while(valor < 1 || valor > 10 );
		int i = 1;
		int resultado = i * valor;
		while(i <= 10) {
			System.out.println(valor + " X " + i + " = " + resultado);
			i++;
		}
		leia.close();
		
		
		
	}

}
/*
 * 50) Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem 
crescente.

 * 57) Reescreva o exercício 50 utilizando a estrutura REPITA e um CONTADOR. 
 */
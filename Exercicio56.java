package faccat;

import java.util.Scanner;

public class Exercicio56 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor;
		do {
			System.out.println("Digite um valor");
			valor = leia.nextInt();
			if(valor < 1 || valor > 10) {
				System.out.println("Digite a penas valores de um a dez !");
			}
		} while (valor < 1 || valor > 10);
	int resultado = 0;
	for(int i = 1; i <= 10; i++) {
		resultado = valor * i;
		System.out.println(valor + " X " + i + " = " + resultado);
	}
	leia.close();
			
	}
	
}

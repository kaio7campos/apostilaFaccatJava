package faccat;

import java.util.Scanner;

public class Exercicio54 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int numero = 0;
		
		do {
			System.out.println("Digite um numero");
			numero = leia.nextInt();
			if (numero < 0 ) {
				System.out.println("Digite apenas numeros maiores que zero!");
			}
		}while(numero < 0);
		
		for(int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
		leia.close();
	}

}
/*
 * 54) Modifique o exercício anterior para aceitar somente valores maiores que 0
 * para N. Caso o valor informado (para N) não seja maior que 0, deverá ser lido
 * um novo valor para N.
 */
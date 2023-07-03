package faccat;

import java.util.Scanner;

public class Exercicio60 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valoresNoIntervalo = 0;
		int valoresForaDoIntervalo = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o º" + i);
			int valor = leia.nextInt();
			if(valor > 9 && valor < 21) {
				valoresNoIntervalo++;
			} else {
				valoresForaDoIntervalo++;
			}
		}
		System.out.println("Os valores fora do intervalo são: " + valoresForaDoIntervalo + ", os valores dentro do intervalo de 10 a 20 são: " + valoresNoIntervalo);
		leia.close();
	}
}
/*
 * 60) Ler 10 valores e escrever quantos desses valores lidos estão no intervalo
 * [10,20] (inlcuindo os valores 10 e 20 no intervalo) e quantos deles estão
 * fora deste intervalo.
 */

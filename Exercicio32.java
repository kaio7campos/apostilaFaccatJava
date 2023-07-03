package faccat;

import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do primeiro time");
		String time1 = leia.nextLine();
		
		System.out.println("Digite o mome do segundo time");
		String time2 = leia.nextLine();
		
		System.out.println("Digite o numero de gols do primeiro time");
		int gols1 = leia.nextInt();

		System.out.println("Digite o numero de gols do segundo time");
		int gols2 = leia.nextInt();
		
		String vencedor;
		
		if (gols1 > gols2) {
			vencedor = time1;
		} else if (gols1 == gols2) {
			vencedor = "Empate";
		} else {
			vencedor = time2;
		}
		System.out.println("O vencedor é: " + vencedor);
		leia.close();
	}
}
/*
 * 32) Ler o nome de 2 times e o número de gols marcados na partida (para cada
 * time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser
 * impressa a palavra EMPATE.
 */
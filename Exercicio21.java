package faccat;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a hora de inicio do jogo");
		int inicio = leia.nextInt();
		
		System.out.println("Digite a hora de termino do jogo");
		int termino = leia.nextInt();
		int duracao = 0;
		if(termino > inicio) {
			duracao = termino - inicio;
		} else {
			duracao = 24 - inicio + termino;
		}
		System.out.println("A duração do jogo foi de " + duracao + " horas.");
		leia.close();
	}
}
/*
 * 21) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere
 * apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas,
 * sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo
 * pode iniciar em um dia e terminar no dia seguinte.
 */

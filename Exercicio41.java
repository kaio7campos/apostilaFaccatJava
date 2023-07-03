package faccat;

import java.util.Scanner;

public class Exercicio41 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua primeira nota");
		double nota1 = leia.nextDouble();

		System.out.println("Digite sua segunda nota");
		double nota2 = leia.nextDouble();

		System.out.println("Digite sua terceira nota");
		double nota3 = leia.nextDouble();

		System.out.println("Digite sua media de exercícios");
		double mediaExercicios = leia.nextDouble();

		double mediaDeAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;
		char conceito = 0;
		if(mediaDeAproveitamento >= 9) {
			conceito = 'A';
		} else if (mediaDeAproveitamento >= 7.5 && mediaDeAproveitamento < 9.0) {
			conceito = 'B';
		} else if (mediaDeAproveitamento >= 6.0 && mediaDeAproveitamento < 7.5) {
			conceito = 'C';
		} else if (mediaDeAproveitamento < 6.0) {
			conceito = 'D';
		}
		
		System.out.println("Sua nota final é: " + conceito);
		leia.close();
	}
}
/*
 * 41) Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3
 * verificações e a média dos exercícios que fazem parte da avaliação. Calcular
 * a média de aproveitamento, usando a fórmula abaixo e escrever o conceito do
 * aluno de acordo com a tabela de conceitos mais abaixo:
 * 
 * N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios Média_de_Aproveitamento =
 * --------------------------------------------------------- 7
 *
 *
 * A atribuição de conceitos obedece a tabela abaixo:
 *
 * Média de Aproveitamento Conceito > = 9,0 A > = 7,5 e < 9,0 B > = 6,0 e < 7,5
 * C < 6,0 D
 */

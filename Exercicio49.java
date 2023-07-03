package faccat;

import java.util.Scanner;

public class Exercicio49 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		float nota1 = 0;
		float nota2 = 0;
		char escolha;
		
		do {
			do {
				System.out.println("Digite sua primeira nota");
				nota1 = leia.nextFloat();
				if(nota1 < 0 || nota1 > 10) {
					System.out.println("Digite apenas valores de zero a dez!");
				}
			} while (nota1 < 0 || nota1 > 10);
			
			do {
				System.out.println("Digite sua segunda nota");
				nota2 = leia.nextFloat();
				if(nota2 < 0 || nota2 > 10) {
					System.out.println("Digite somente valores de zero a dez!");
				}
			}while(nota2 < 0 || nota2 > 10);
			
			float divisao = (nota1 + nota2) / 2;
			System.out.println("Sua media é: " + divisao);
			
			System.out.println("Deseja repetir a operação?");
			System.out.println("Digite S para sim e N para não");
			escolha = leia.next().charAt(0);
		} while (escolha == 'S');
		leia.close();
		
			
		
	}
}
/*
 * 48) Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um
 * aluno, calcule e imprima a média (simples) desse aluno. Só devem ser aceitos
 * valores válidos durante a leitura (0 a 10) para cada nota. 
 * 49) Acrescente uma mensagem 'NOVO CÁLCULO (S/N)?' ao final do exercício [48]. 
 * Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário 
 * deverá encerrar o algoritmo.
 */
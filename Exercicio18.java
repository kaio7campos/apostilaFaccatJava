package faccat;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento");
		int anoDeNascimento = leia.nextInt();
		
		System.out.println("Digite o ano atual");
		int anoAtual = leia.nextInt();
		
		int resultado = anoAtual - anoDeNascimento;
		if (resultado >= 16) {
			System.out.println("Individuo pode votar");
		} else {
			System.out.println("individuo não pode votar esse ano");
		}
		leia.close();
	}
}
/*
 * 18) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma
 * mensagem que diga se ela poderá ou não votar este ano (não é necessário
 * considerar o mês em que a pessoa nasceu).
 */
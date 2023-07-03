package faccat;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número da conta");
		int numeroDaConta = leia.nextInt();
		
		System.out.println("Digite seu saldo:");
		float saldo = leia.nextFloat();
		
		System.out.println("Digite seu débito");
		float debito = leia.nextFloat();
		
		System.out.println("Digite seu credito");
		float credito = leia.nextFloat();
		
		float saldoAtual = saldo - debito + credito;
		if(saldoAtual >= 0) {
			System.out.println("A conta " + numeroDaConta +"Tem o saldo positivo R$" + saldoAtual);
		} else {
			System.out.println("A conta " + numeroDaConta +"Tem o saldo negativo R$" + saldoAtual);
		}
		leia.close();
		
	}
}
/*
 * 25) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e
 * crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo -
 * débito + crédito). Também testar se saldo atual for maior ou igual a zero
 * escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo
 * Negativo'.
 */

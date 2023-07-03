package faccat;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a quantidade atual no estoque");
		int quantidadeAtual = leia.nextInt();
		
		System.out.println("Digite a quantidade máxima do estoque");
		int quantidadeMaxima = leia.nextInt();
		
		System.out.println("Digite a quantidade minima do estoque ");
		int quantidadeMinima =leia.nextInt();
		
		float quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;
		if (quantidadeAtual >= quantidadeMedia) {
			System.out.println("Não é necessário comprar mercadoria");
		} else {
			System.out.println("É necessário comprar mercadoria");
		}
		leia.close();
	}
}
/*
 * 26) Faça um algoritmo para ler: quantidade atual em estoque, quantidade
 * máxima em estoque e quantidade mínima em estoque de um produto. Calcular e
 * escrever a quantidade média ((quantidade média = quantidade máxima +
 * quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a
 * quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a
 * mensagem 'Efetuar compra'.
 */

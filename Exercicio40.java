package faccat;

import java.util.Scanner;

public class Exercicio40 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do produto");
		String nome = leia.nextLine();
		
		System.out.println("Digite a quantidade desejada");
		int quantidade = leia.nextInt();
		
		System.out.println("Digite o preço do produto");
		int preco = leia.nextInt();
		
		double subTotal = quantidade * preco;
		double desconto = 0;
		double total = 0;
		if (quantidade <= 5) {
			desconto = (subTotal * 2) / 100;
			total = subTotal - desconto;
		} else if(quantidade > 5 && quantidade <= 10) {
			desconto = (subTotal * 3) / 100;
			total = subTotal - desconto;
		} else if(quantidade > 10) {
			desconto = (subTotal * 5) / 100;
			total = subTotal - desconto;
		}
		System.out.println("O valor da sua compra foi de: "+nome +" R$" + total);
		leia.close();
	}
}
/*
 * 40) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade
 * adquirida e o preço unitário. Calcular e escrever o total (total = quantidade
 * adquirida * preço unitário), o desconto e o total a pagar (total a pagar =
 * total - desconto), sabendo-se que:
 * 
 * - Se quantidade <= 5 o desconto será de 2%
 * - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
 * - Se quantidade > 10 o desconto será de 5% 
 * 
 */

package faccat;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o seu salario fixo");
		float salarioBase = leia.nextFloat();
		
		System.out.println("Digite o valor das vendas");
		float valorDasVendas = leia.nextFloat();
		
		float comissao = 0;
		float comissaoExtra = 0;
		float diferenca = 0;
		float salarioFinal = 0;
		if (valorDasVendas > 1500) {
			diferenca = valorDasVendas - 1500;
			comissaoExtra = (diferenca * 5) / 100;
			comissao = (1500 * 3) / 100;
			salarioFinal = salarioBase + comissao + comissaoExtra;
		} else {
			comissao = (valorDasVendas * 3) / 100;
			salarioFinal = salarioBase + comissao;
		}
		
		System.out.println("O seu salario é: R$" + salarioFinal);
		leia.close();
	}
}
/*
 * 24) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma
 * empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
 * vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e
 * escrever o seu salário total.
 */

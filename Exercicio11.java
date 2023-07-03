package faccat;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salario bruto: ");
		float salarioFixo = leia.nextFloat();
		
		System.out.println("Digite o numero de carros vendidos: ");
		float carrosVendidos = leia.nextFloat();
		
		
		System.out.println("Digite o valor total das suas vendas: ");
		float valorTotalVendas = leia.nextFloat();
		
		float valorDoCarro = valorTotalVendas / carrosVendidos;
		float lucroPorVenda = (valorDoCarro * 5) / 100;
		float lucroTotal = lucroPorVenda * carrosVendidos;
		float salarioFinal = salarioFixo + lucroTotal;
		
		System.out.println("O salario o final é: R$" + salarioFinal);
		System.out.println("Seu lucro por venda é: R$" + lucroPorVenda);
		
		leia.close();
	}
}


/*11) Uma revendedora de carros usados paga a seus funcionários vendedores um 
 * salário fixo por mês, mais  uma  comissão  também  fixa  para  cada  carro  
 * vendido  e  mais  5% do  valor  das  vendas  por  ele efetuadas. Escrever 
 * um algoritmo que leia o número de  carros por  ele vendidos, o valor total de 
 * suas vendas, o salário fixo e o valor que ele recebe por carro vendido. 
 * Calcule e escreva o salário final do vendedor. */
 
package faccat;
import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);{
			System.out.println("Olá quantas maças gostaria?");
			int kMaca = leia.nextInt();
			
			System.out.println("Quantos morangos gostaria?");
			int kMorango = leia.nextInt();
			double valorMorango = 0;
			double valorMaca = 0;
			if(kMorango > 5 || kMaca > 5) {
				valorMorango = kMorango * 2.20;
				valorMaca = kMaca * 1.50;
			} else {
				valorMorango = kMorango * 2.50;
				valorMaca = kMaca * 1.80;
			}
			
			double subTotal = valorMorango + valorMaca; 
			double totalKilos = kMorango + kMaca;
			double valorDesconto = 0;
			double total = 0;
			
			if (totalKilos > 8 || subTotal > 25) {
				valorDesconto = (subTotal * 10) / 100;
				total = subTotal - valorDesconto;
			} else {
				total = subTotal;
			}
			System.out.println("O total da sua compra foi de: R$" + total);
			leia.close();
		}
	}
}
/*37) Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 * 
 * 					Até 5 Kg Acima 		de 5 K
 * 		Morango 	R$ 2,50 por Kg 		R$ 2,20 por Kg
 * 		Maçã 		R$ 1,80 por Kg 		R$ 1,50 por Kg 
 * 
 * 	Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar 
 * R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo 
 * para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas 
 * e escreva o valor a ser pago pelo cliente. 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

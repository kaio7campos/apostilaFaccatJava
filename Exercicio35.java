package faccat;
import java.util.Scanner;

public class Exercicio35 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá qual combustivel gostaria?");
		System.out.println("Digite A para álcool e G para gasolina");
		String combustivel = leia.nextLine();
		
		System.out.println("Quantos litros gostaria ?");
		double litros = leia.nextDouble();
		
		double valorDesconto = 0;
		double precoComDesconto = 0;
		double total = 0;
		
		switch (combustivel) {
		case "A":
			if (litros > 20) {
				valorDesconto = (2.90 * 5) / 10;
				precoComDesconto = 2.90 - valorDesconto;
				total = precoComDesconto * litros;
			} else {
				valorDesconto = (2.90 * 3) / 10;
				precoComDesconto = 2.90 - valorDesconto;
				total = precoComDesconto * litros;
			}
			System.out.println("O valor da sua compra é: R$" + total);
			break;
		case "G":
			if(litros > 20) {
				valorDesconto = (3.30 * 6) / 10;
				precoComDesconto = 3.30 - valorDesconto;
				total = precoComDesconto * litros;
			} else {
				valorDesconto = (3.30 * 4) / 10;
				precoComDesconto = 3.30 - valorDesconto;
				total = precoComDesconto * litros;
			}
			break;
			default:
				System.out.println("Por favor digite A para alcool ou G para gasolina com letras maiusculas");
		}
		leia.close();
		
	}
}
/*35) Um posto está vendendo combustíveis com a seguinte tabela de descontos: 
 * 
 * 				Álcool    até 20 litros, desconto de 3% por litro
 * 						  acima de 20 litros, desconto de 5% por litro
 * 
 * 			Gasolina  	até 20 litros, desconto de 4% por litro
 * 						acima de 20 litros, desconto de 6% por litro
 * 
 * 	Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível 
 * (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a 
 * ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o 
 * preço do litro do álcool é R$ 2,90. 
 * */
 
package faccat;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os graus em Farenheit");
		float fahrenheit = leia.nextFloat();
		
		float formula = (fahrenheit - 32) * 5/9;
		System.out.println("A conversão pára celcius é: °" + formula );
		leia.close();
	}
}

/*
12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular 
 e escrever o valor correspondente em graus Celsius (baseado na fórmula abaixo):  
 */

/*
     C          F - 32 
---------- = -----------
     5             9 
*/
//Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F
package faccat;
import java.util.Scanner;
public class Exercicio09 {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Olá porfavor informe seu salario bruto!");
		int salario = leia.nextInt();
		
		System.out.println("Informe o percentual de reajuste");
		int reajuste = leia.nextInt();
		
		double valorDoReajuste = (salario * reajuste) / 100;
		double salarioFinal = salario + valorDoReajuste;
		
		System.out.println("O salario com acrescimo do reajuste é: " + salarioFinal);
		leia.close();
	}
}


/*9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o 
 * percentual de reajuste. Calcular e escrever o valor do novo salário. */
 
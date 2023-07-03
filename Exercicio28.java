package faccat;
import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o segundo valor");
		int valor2 = leia.nextInt();
		
		System.out.println("Digite o terceiro valor");
		int valor3 = leia.nextInt();
		int maior = 0;
		if(valor1 > valor2 && valor1 > valor3) {
			maior = valor1;
		} else if (valor2 > valor1 && valor2 > valor3) {
			maior = valor2;
		} else {
			maior = valor3;
		}
		System.out.println("O maior valor lido é: " + maior);
		leia.close();
	}
}

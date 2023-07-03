package faccat;
import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor = leia.nextInt();
		if(valor > 0) {
			System.out.println("O valor é posito");
		} else if(valor == 0) {
			System.out.println("O valor é igual a zero");
		} else {
			System.out.println(" o valor é negativo");
		}
		leia.close();
	}
}
/*27) Ler um valor e escrever se é positivo, negativo ou zero.*/
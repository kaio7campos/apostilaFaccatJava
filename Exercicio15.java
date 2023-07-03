package faccat;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor ");
		int valor = leia.nextInt();
		if (valor < 0) {
			System.out.println("O valor é negativo");
		} else {
			System.out.println("O valor é positivo");
		}
		leia.close();
		
	}
}
/*15) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). */
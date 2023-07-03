package faccat;
import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[] args) {
		System.out.print("Digite um valor:");
		Scanner leia = new Scanner (System.in);
		int valor = leia.nextInt();
		int valorAnterior = valor - 1;
		System.out.print("O antecessor do valor é: " + valorAnterior);
		leia.close();
	}
}


/*5) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. */
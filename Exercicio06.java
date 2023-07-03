package faccat;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.print("Digite a base do retângulo");
		float base = leia.nextFloat();
		System.out.print("Digite a altur do ratângulo");
		float altura = leia.nextFloat();
		float area = altura * base;
		System.out.print("A area do retângulo é: " + area);
		leia.close();
	}
}


/*6)  Escreva  um  algoritmo  para  ler  as  dimensões  de  um  retângulo  (base  e  altura),  calcular  e  escrever  a área do retângulo. */
/*caio
jailson*/

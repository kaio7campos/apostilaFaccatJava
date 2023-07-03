package faccat;
import java.util.Scanner;
public class Exercicio08 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de votos do municipio: ");
		int eleitores = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos: ");
		int votosValidos = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos nulos: ");
		int votosNulos = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos brancos: ");
		int votosBrancos = sc.nextInt();
		
		double percentualValidos = 100 * votosValidos / eleitores;
		double percentualNulos = 100 * votosNulos / eleitores;
		double percentualBrancos = 100 * votosBrancos / eleitores;
		
		System.out.println("O percentual de votos validos é: " + percentualValidos);
		System.out.println("O percentual de votos Nulos é: " + percentualNulos);
		System.out.println("O percentual de vostos brancos é: " + percentualBrancos);
		sc.close();
	}
}


 /*8) Escreva  um  algoritmo  para  ler  o  número  total  de  
  * eleitores  de um  município,  o  número  de  votos brancos, nulos e válidos. 
  * Calcular e escrever o percentual que cada um representa em relação ao total 
  * de eleitores.*/

package faccat;
import java.util.Scanner;
public class Exercicio07 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite s sua idade em anos");
		int idadeAnos = sc.nextInt();
		System.out.println("Especifique com os meses");
		int idadeMeses = sc.nextInt();
		System.out.println("Especifique os dias");
		int idadeDias = sc.nextInt();
		
		int diasVividos = idadeAnos * 365 + idadeMeses * 30 + idadeDias;
		System.out.println("O total de dias vividos:" + diasVividos);
		sc.close();
	}
}

/* 7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e 
 * mês com 30 dias. */

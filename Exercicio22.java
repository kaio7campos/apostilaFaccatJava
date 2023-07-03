package faccat;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o numero de horas trabalhadas");
		int horasTrabalhadas = leia.nextInt();
		System.out.println("Digite seu salario por hora");
		float valorPorHora = leia.nextFloat();

		float valorHoraExtra = 0;
		float quantidadeDeHorasExtras = 0;
		float extra = 0;
		float salarioBase = 0;
		float salarioFinal = 0;
		float acrescimo = 0;
		float horasObrigatorias = 0;
		if (horasTrabalhadas > 160) {
			quantidadeDeHorasExtras = horasTrabalhadas - 160;
			acrescimo = (valorPorHora * 50) / 100;
			valorHoraExtra = acrescimo + valorPorHora;
			extra = valorHoraExtra * quantidadeDeHorasExtras;
			horasObrigatorias = horasTrabalhadas - quantidadeDeHorasExtras;
			salarioBase = valorPorHora * horasObrigatorias;
			salarioFinal = salarioBase + extra;
		} else {
			salarioFinal = valorPorHora * horasTrabalhadas;
		}
		System.out.println("O salario final é: R$" + salarioFinal);
		leia.close();
		System.out.println(acrescimo);
		System.out.println(quantidadeDeHorasExtras);
		System.out.println(valorHoraExtra);

	}

}

/*
 * 22) A jornada de trabalho semanal de um funcionário é de 40 horas. O
 * funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo
 * é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que
 * leia o número de horas trabalhadas em um mês, o salário por hora e escreva o
 * salário total do funcionário, que deverá ser acrescido das horas extras, caso
 * tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
 */

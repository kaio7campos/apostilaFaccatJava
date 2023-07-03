package faccat;

import java.util.Scanner;

public class Exercicio42 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o seu ID");
		int id = leia.nextInt();
		
		System.out.println("Digite seu ano de nascimento");
		int anoDeNascimento = leia.nextInt();
		
		System.out.println("Digite o ano da sua admissão");
		int anoDeAdmissao = leia.nextInt();
		
		int tempoDeServico = 2023 - anoDeAdmissao;
		int idade = 2023 - anoDeNascimento;
		if(idade >= 65) {
			System.out.println("Funcinario requer aposentadoria");
		} else if(tempoDeServico >= 30) {
			System.out.println("Funcinario requer aposentadoria");
		} else if(idade >= 60 && tempoDeServico >= 25) {
			System.out.println("Funcinario requer aposentadoria");
		} else {
			System.out.println("Funcionario " + id + " não requer aposentadoria");
		}
		leia.close();
	}
}
/*
 * 42) Uma empresa quer verificar se um empregado está qualificado para a
 * aposentadoria ou não. Para estar em condições, um dos seguintes requisitos
 * deve ser satisfeito:
 * 
 * - Ter no mínimo 65 anos de idade 
 * - Ter trabalhado no mínimo 30 anos. 
 * - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
 *
 * Com base nas informações acima, faça um algoritmo que leia: o número do
 * empregado (código), o ano de seu nascimento e o ano de seu ingresso na
 * empresa. O programa deverá escrever a idade e o tempo de trabalho do
 * empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
 *
 * 
 */

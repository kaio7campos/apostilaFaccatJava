package faccat;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o preço de fabrica do veiculo");
		float valorDeFabrica = leia.nextFloat();
		
		float precoDoDistribuidor = (28 * valorDeFabrica) / 100; 
		float imposto = (45 * valorDeFabrica) / 100;
		float precoFinal = precoDoDistribuidor + imposto + valorDeFabrica;
		
		System.out.println("O preço final do veiculo é R$" + precoFinal);
		leia.close();
		
	}
}

/*10)  O  custo  de  um  carro  novo  ao  consumidor  é  a  soma  do  custo  de  
 * fábrica  com  a  porcentagem  do distribuidor e dos impostos 
 * (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja  
 * de  28%  e  os  impostos  de  45%,  escrever  um  algoritmo  para  ler o  custo  
 * de  fábrica  de  um  carro, calcular e escrever o custo final ao consumidor. */
 
package revisãoCps;
import java.util.Scanner;

/*
 * Exercício 1: Monitoramento de Consumo de Água

Você foi contratado para desenvolver um programa em Java que permita aos usuários 
registrar e analisar o consumo de água do primeiro semestre de 2023. O programa 
deverá permitir ao usuário preencher um vetor de 6 posições, representando o 
consumo de água em litros para cada mês do semestre. Após preencher o vetor, 
o programa deverá fornecer as seguintes informações:
a)	(2,0) O mês (nome do mês) com o maior consumo de água.
b)	(2,0) O mês (nome do mês) com o menor consumo de água.
c)	(2,0) O valor pago pelo usuário em cada mês, considerando que 500 litros de 
	água custam 2% do valor do salário mínimo vigente (deverá ser informado pelo 
	usuário da aplicação).
d)	(2,0) O valor total que o usuário pagou no primeiro semestre de 2023.

 */

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] mes = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho" };
		double[] consumo = new double[mes.length];
		double salarioMinimo;
		double maiorConsumo = Double.MIN_VALUE;
		double menorConsumo = Double.MAX_VALUE;
		int indexMaiorConsumo = 0;
		int indexMenorConsumo = 0;
		double valorTotal = 0;
		double valorDoLitro = 0;
		double valorAPagar;

		// entrada de dados
		for (int i = 0; i < mes.length; i++) {
			System.out.print("Consumo de " + mes[i] + " --> ");
			consumo[i] = sc.nextDouble();

			// encontra o índice do vetor onde está armazenado o maior consumo
			if (consumo[i] > maiorConsumo) {
				maiorConsumo = consumo[i];
				indexMaiorConsumo = i; //chamar o i
			}

			// encontra o índice do vetor onde está armazenado o menor consumo
			if (consumo[i] < menorConsumo) {
				menorConsumo = consumo[i];
				indexMenorConsumo = i; //chamar o i
			}
		}

		// saída de dados
		System.out.println();
		System.out.print("Qual o valor do salário mínimo vigente (atual)? R$ ");
		salarioMinimo = sc.nextDouble();

		// exercício 1a
		System.out.println();
		System.out.println("Mês de maior consumo --> " + mes[indexMaiorConsumo]);

		// exercício 1b
		System.out.println();
		System.out.println("Mês de menor consumo --> " + mes[indexMenorConsumo]);

		// exercício 1c
		System.out.println();
		System.out.println("Valor pago em cada mês");
		valorDoLitro = salarioMinimo * 2 / 100 / 500; //conta
		for (int i = 0; i < mes.length; i++) {
			System.out.print(String.format("%9s --> ", mes[i])); //usando string 0 format para fazer lista
			valorAPagar = valorDoLitro * consumo[i]; //valor do litro q vai pagar vezes o consumo de agua
			System.out.println(String.format("R$ %.2f", valorAPagar));
			valorTotal += valorAPagar;
		}

		// exercício 1d
		System.out.println();
		System.out.println("Valor pago pelo usuário no primeiro semestre de 2023 --> " + String.format("R$ %.2f", valorTotal));

	}
}

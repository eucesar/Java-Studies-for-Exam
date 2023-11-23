package revisoes;

import java.util.Random;
import java.util.Scanner;

public class revisaoAp7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int totalVendedor;

		
		System.out.print("Total de vendedores --> ");
		totalVendedor = sc.nextInt();
		String[] nome = new String[totalVendedor];
		String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", 
				"Maio", "Junho"};
		double[][] venda = new double[totalVendedor][mes.length];
		double totalMes;
		double maiorVenda = 0;
		double menorVenda = Double.MAX_VALUE;
		int indexMaior = 0, indexMenor = 0;
		
		// entrada de dados
				sc.nextLine();
				for(int i = 0; i < totalVendedor; i++) {			
					System.out.print("Nome do vendedor " + (i + 1) + " ");
					nome[i] = sc.nextLine();
					for(int j = 0; j < venda[i].length; j++) {
						venda[i][j] = rd.nextInt(4);
						System.out.print(venda[i][j] + "\t");
						// encontra o índice do vetor onde está armazenado o maior consumo
					}
					System.out.println();
				}
				// cálculo do total de vendas por mês
				System.out.println("\nTotal de vendas por mês");
				for(int j = 0; j < mes.length; j++) {
					totalMes = 0;
					for(int i = 0; i < totalVendedor; i++) {
						totalMes = totalMes + venda[i][j];
					}
					System.out.println(mes[j] + " --> R$ " + totalMes);
					 // Verifique se este é o maior ou o menor total de vendas até agora
				    if (totalMes > maiorVenda) {
				        maiorVenda = totalMes;
				        indexMaior = j;
				    }
				    if (totalMes < menorVenda) {
				        menorVenda = totalMes;
				        indexMenor = j;
				    }
				}
				// Encontre o nome do vendedor com o maior total de vendas
				String nomeMaiorVenda = nome[indexMaior];
				System.out.println("Nome do vendedor com o maior total de vendas: " + nomeMaiorVenda);

				// Encontre o nome do vendedor com o menor total de vendas
				String nomeMenorVenda = nome[indexMenor];
				System.out.println("Nome do vendedor com o menor total de vendas: " + nomeMenorVenda);
	}

}

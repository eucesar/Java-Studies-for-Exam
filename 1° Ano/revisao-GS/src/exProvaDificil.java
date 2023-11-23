

import java.util.Scanner;

public class exProvaDificil {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int qtdProduto;
		
		System.out.print("Total de produto: ");
		qtdProduto = sc.nextInt();
		
		String[] mes = {"outubro 22", "outubro 23"};
		String[] nome = new String[qtdProduto];
		double[][] valor = new double[qtdProduto][3]; //3 colunas - mas quando for manipular só vai ate o 3
		
		// método para ler os dados --> item a
		lerDados(mes, nome, valor);
	}

	private static void lerDados(String[] mes, String[] nome, double[][] valor) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < valor.length; i++) {
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			for (int j = 0; j < valor.length; j++) {
				System.out.print("Preco em " + mes[j] + " --> ");
				valor[i][j] = sc.nextDouble();
			}
			
			//porcentagem 2
			valor[i][2] = (valor[i][1] - valor[i][0]) / valor[i][0] * 100;
			
			
			
			sc.nextLine();
			System.out.println();
		}
		
	}

}

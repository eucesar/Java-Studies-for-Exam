import java.util.Scanner;

public class exProvaModeloATeste {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int qtdProdutos;
		
		System.out.print("qtd de produtos --> ");
		qtdProdutos = sc.nextInt();
		
		String[] nome = new String[qtdProdutos];
		int[] mes = {2022,2023};
		double[][] produto = new double[qtdProdutos][3];
		
		
		//metodo armenar
		for (int i = 0; i < qtdProdutos; i++) {
			sc.nextLine();
			System.out.print("nome do produto --> ");
			nome[i] = sc.nextLine();
			for (int j = 0; j < mes.length; j++) {
				System.out.print("valor do produto de outubro de " + mes[j] + " --> ");
				produto[i][j] = sc.nextDouble();
				produto[i][2] = ((produto[i][1] - produto[i][0]) / produto[i][0]) * 100;
			}
			System.out.println();
		}
		
		
		//metodo impressao
		for (int i = 0; i < qtdProdutos; i++) {
			System.out.println(nome[i]);
			for (int j = 0; j < mes.length; j++) {
				System.out.println(produto[i][j]);
			}
			System.out.println(produto[i][2] + "%");
		}
		
		
		//metodo maior dps maior
		double maior = Integer.MIN_VALUE;
		int maiorS = 0;
		for (int i = 0; i < qtdProdutos; i++) {
			for (int j = 0; j < mes.length; j++) {
				if (produto[i][2] > maior) {
					maior = produto[i][2];
					maiorS = i;
				}
			}
		}
		System.out.println("maior = " + nome[maiorS]);

		
		double menor = Integer.MAX_VALUE;
		int maiorS2 = 0;
		for (int i = 0; i < qtdProdutos; i++) {
			for (int j = 0; j < mes.length; j++) {
				if (produto[i][2] < menor) {
					menor = produto[i][2];
					maiorS2 = i;
				}
			}
		}
		
		System.out.println("menor = " + nome[maiorS2]);
		
		
	}

}

package revisão;

import java.util.Random;
import java.util.Scanner;

public class ex2M {

	public static void main(String[] args) {
		
		int linhas, colunas;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("linhas --> ");
		linhas = sc.nextInt();
		
		System.out.print("colunas --> ");
		colunas = sc.nextInt();
		
		int[][] matriz = new int [linhas][colunas];
		Random rd = new Random();
		
		martiz(linhas,colunas,sc, rd, matriz);
		
		int linha;
		System.out.print("linha --> ");
		linha = sc.nextInt();
		
		int maiorValor = 0;
		maiorValor = linha(colunas, matriz, linha, maiorValor);
		System.out.println(linha + " --> " + maiorValor);
	}


	private static void martiz(int linhas, int colunas, Scanner sc, Random rd, int[][] matriz) {
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = rd.nextInt(2,20);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	private static int linha(int colunas, int[][] matriz, int linha, int maiorValor) {
		
		for (int j = 0; j < colunas; j++) {
			if (matriz[linha][j] > maiorValor) {
				maiorValor = matriz[linha][j];
			}
		}
		
		return maiorValor;
	}

}

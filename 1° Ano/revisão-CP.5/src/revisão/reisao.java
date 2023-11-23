package revisão;

import java.util.Random;
import java.util.Scanner;

public class reisao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int linhas, colunas;
		
		System.out.print("linhas --> ");
		linhas = sc.nextInt();
		
		System.out.print("colunas --> ");
		colunas = sc.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		Random rd = new Random();
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = rd.nextInt(10);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		int linha, maior = 0;
		System.out.print("linha --> ");
		linha = sc.nextInt();
		
		for (int j = 0; j < colunas; j++) {
			if (matriz[linha][j] > maior) {
				maior = matriz[linha][j];
			}
		}
		
		System.out.println(maior);
	}
}
	


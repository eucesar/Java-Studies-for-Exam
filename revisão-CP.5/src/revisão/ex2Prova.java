package revisão;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ex2Prova {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		//a
		int linhas, colunas;
		
		System.out.print("linhas --> ");
		linhas = sc.nextInt();
		
		System.out.print("Colunas -->");
		colunas = sc.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = rd.nextInt(2, 50);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		//b
		int linha, maiorValor = 0;
		System.out.print("linha --> ");
		linha = sc.nextInt();
		
		for (int j = 0; j < colunas; j++) {
			if (matriz[linha][j] > maiorValor) {
				maiorValor = matriz[linha][j];
			}
		}
		System.out.print(linha + " --> " + maiorValor);
	}

}

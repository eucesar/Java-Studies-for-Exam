package revisoes;

import java.util.Random;
import java.util.Scanner;

public class revisaoEx {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		int[][] x = new int[2][2];
		int linha, coluna;
		for(linha = 0; linha < x.length; linha++) {
		for(coluna = 0; coluna < x[linha].length; coluna++) {
		System.out.print(x[linha][coluna]+"\t"); //aqui tem q ser print
		}
		System.out.println();
		}
	}

}

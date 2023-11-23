package revisoes;

import java.util.Random;

public class revisaoAp2 {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		int [][] x = new int [10][10];
		int maior = 0;
		int soma =0;
		
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = gerador.nextInt(1000);
				System.out.print(x[i][j] + "\t");
				if (x[i][j] > maior ) {
					maior = x[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("maior --> " + maior);
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				if (x[i][j] == maior) {
					System.out.println("linha -> " + i + " coluna -> " + j);
				}
			}
		}
	}

}

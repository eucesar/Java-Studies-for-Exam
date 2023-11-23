import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class revisaoGeral5 {

	public static void main(String[] args) {

		int[][] matriz = new int[5][5];
		Random rd = new Random();
		
		int maior = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = rd.nextInt(1000);
				System.out.print(matriz[i][j] + "\t");
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println(maior);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == maior) {
					System.out.print("linha --> " + i + " coluna --> " + j);
				}
			}
		}
	}

}

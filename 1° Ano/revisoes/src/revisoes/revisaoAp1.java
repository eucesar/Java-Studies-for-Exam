package revisoes;

import java.util.Random;
import java.util.Scanner;

public class revisaoAp1 {

	public static void main(String[] args) {
	
		Scanner tecaldo = new Scanner(System.in);
		Random gerador = new Random();
		int [][] x = new int [3][3];
		int dp = 0;
		int ds = 0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = gerador.nextInt(20);
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		for (int i = 0; i < x.length; i++) {
			dp+= x[i][i];
		}
		
		for (int i = 0, j = x.length - 1; i < x.length; i++, j--) {
			ds += x[i][j];
		}
		
		System.out.println("Soma dos elementos da diagonal principal = " + dp);
		System.out.println("Soma dos elementos da diagonal secundária = " + ds);	
	}

}

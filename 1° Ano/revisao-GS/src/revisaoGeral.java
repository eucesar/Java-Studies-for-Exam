import java.util.Random;
import java.util.Scanner;

public class revisaoGeral {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int linhas, colunas;
		
		System.out.print("Linhas --> ");
		linhas = sc.nextInt();
		
		System.out.print("Colunas --> ");
		colunas = sc.nextInt();
				
		int[][] matriz = new int[linhas][colunas];

		
		Random rd = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = rd.nextInt(1,10);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		int[] maior = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			maior[i] = Integer.MIN_VALUE;
			for (int j = 0; j < maior.length; j++) {
				if (matriz[i][j] > maior[i]) {
					maior[i] = matriz[i][j];
				}
			}
		}
		
		
	}

}

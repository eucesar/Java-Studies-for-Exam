import java.util.Random;
import java.util.Scanner;

public class revisaoGeral4 {

	public static void main(String[] args) {


		int linhas, colunas;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("linhas --> ");
		linhas = sc.nextInt();
		
		System.out.print("colunas --> ");
		colunas = sc.nextInt();
		
		int[][] matriz = new int [linhas][colunas];
		Random rd = new Random();
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = rd.nextInt(20);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		int linha;
		System.out.print("linha --> ");
		linha = sc.nextInt();
		
		int maior = 0;
	
		for (int j = 0; j < colunas; j++) {
			if (matriz[linha][j] > maior) {
				maior = matriz[linha][j];
			}
		}
		
		System.out.println(maior);
		
		
		

	}

}

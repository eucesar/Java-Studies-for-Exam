import java.util.Random;

public class revisaogeral6 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int[][] matriz = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = rd.nextInt(10);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		int dp = 0;
		int ds = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			dp += matriz[i][i];
		}
		
		for (int i = 0, j = matriz.length - 1; i < matriz.length; i++, j--) {
			ds += matriz[i][j];
		}
		
		System.out.println(dp);
		System.out.println(ds);
	}

}

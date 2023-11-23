import java.util.Random;

public class revisaogeral7 {

	public static void main(String[] args) {
		
		int[][] x = new int[4][4];
		
		preencher(x);
		System.out.println("Matriz : ");
		imprimir(x);
		
		int[] maior;
		maior = localizarMaior (x);
		System.out.println("\nmaior valor armazenado em cada linha :");
		imprimir(maior);
	}



	//privat não aconteceria nd - vai recebr void pq matriz\vetor não retorna
	public static void preencher(int[][] x) {
		
		Random rd = new Random();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = rd.nextInt(30);
			}
		}
		
	}
	
	private static void imprimir(int[][] x) {

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	//apenas  a linha maior, ent ele vai receber int[] maior - mas vou manipular com a linha
	private static int[] localizarMaior(int[][] x) {
		int[] maior = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			maior[i] = Integer.MIN_VALUE;
			for (int j = 0; j < x.length; j++) {
				if (x[i][j] > maior[i]) {
					maior[i] = x[i][j];
				}
			}
		}
		
		return maior;
	}
	
	private static void imprimir(int[] maior) {

		for (int i = 0; i < maior.length; i++) {
			System.out.println(maior[i] + "\t");
		}
		
	}

}
		

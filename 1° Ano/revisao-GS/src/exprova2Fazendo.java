import java.util.Scanner;

public class exprova2Fazendo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int qtdBikes;
		
		System.out.print("qtd de bikes --> ");
		qtdBikes = sc.nextInt();
		System.out.println();
	
		int[] qtdModelos = new int[qtdBikes];
		double[] valoresModelos = new double[qtdBikes];
		
		double total;
		total = modelos(qtdModelos, valoresModelos);
		
		impressao(qtdModelos, valoresModelos, total);
		

	}

	private static void impressao(int[] qtdModelos, double[] valoresModelos, double total) {

		System.out.println("---- lista -----");
		for (int i = 0; i < qtdModelos.length; i++) {
			
			System.out.println((i+1) + "° modélo vai ter uma quatidade de --> " + qtdModelos[i]);	
			System.out.println((i+1) + "° preço do modelo --> " + String.format("%.2f", valoresModelos[i]));
			System.out.println();
		}
		System.out.println("total = " + String.format("%.2f", total));
	}

	private static double modelos(int[] qtdModelos, double[] valoresModelos) {
		
		Scanner sc = new Scanner(System.in);
		double total = 0;
		double cadaUm = 0;
		
		for (int i = 0; i < qtdModelos.length; i++) {
			
			System.out.print((i+1) + "° qtd de modelo --> ");
			qtdModelos[i] = sc.nextInt();
			
			System.out.print((i+1) + "° preço do modelo --> ");
			valoresModelos[i] = sc.nextDouble();
			cadaUm = valoresModelos[i] * qtdModelos[i];
			total += cadaUm;
			
			System.out.println();
			
		}
		
		return total;
		
	}

}

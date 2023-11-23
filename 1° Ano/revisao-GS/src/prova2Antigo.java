import java.util.Scanner;

public class prova2Antigo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int qtdModelo;
		
		System.out.print("Quantidade de modelos que serão comprados --> ");
		qtdModelo = teclado.nextInt();
		
		int[] modelo = new int[qtdModelo];
		double[] valor = new double[qtdModelo];
		
		lerDados(modelo, valor);
		imprimirListagem(modelo, valor);
		imprimirValorTotal(modelo, valor);

	}

	public static void imprimirValorTotal(int[] modelo, double[] valor) {
		double total = 0;
		for (int i = 0; i < valor.length; i++) {
			total += modelo[i] * valor[i];
		}
		System.out.println("\nCusto para adquisição das bikes: R$ " + String.format("%.2f", total));
	}

	public static void imprimirListagem(int[] modelo, double[] valor) {
		System.out.println(" --------- Listagem ---------- ");
		for(int i = 0; i < modelo.length; i++) {
			System.out.print("Modelo: " + modelo[i] + " --> ");
			System.out.println("R$ " + String.format("%.2f", valor[i]));
		}		
	}

	public static void lerDados(int[] modelo, double[] valor) {
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < modelo.length; i++) {
			System.out.print("Informe a quantidade do modelo " + (i + 1) + " --> ");
			modelo[i] = teclado.nextInt();
			System.out.print("Valor do modelo " + (i + 1) + " --> ");
			valor[i] = teclado.nextDouble();
			System.out.println();
		}
		
	}
}

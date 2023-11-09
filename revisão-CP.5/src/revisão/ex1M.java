package revisão;

import java.util.Scanner;

public class ex1M {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int qtdConsumidores;
		String[] mes = {"Julho", "Agosto", "Setembro"};
		
		System.out.println("---Receber---");
		System.out.print("Quantidade de consumidores --> ");
		qtdConsumidores = sc.nextInt();
		
		
		String[] nome = new String [qtdConsumidores];
		double[][] consumo = new double[qtdConsumidores][mes.length];
		
		armazenar(qtdConsumidores, mes, nome, consumo, sc);
		
		double salario;
		System.out.print("salario --> ");
		salario = sc.nextDouble();
		
		String maiorS;
		maiorS = imprimir(qtdConsumidores, mes, nome, consumo, sc, salario);
		
		System.out.println("maior mês --> " + maiorS);
	}


	private static void armazenar(int qtdConsumidores, String[] mes, String[] nome, double[][] consumo, Scanner sc) {
		
		for (int i = 0; i < qtdConsumidores; i++) {
			sc.nextLine(); //para ingressar conteudo precisa
			System.out.print("nome --> ");
			nome[i] = sc.nextLine();
			for (int j = 0; j < mes.length; j++) {
				System.out.print("consumo " + mes[j] + " --> ");
				consumo[i][j] = sc.nextDouble();
			}
		}
		
	}

	private static String imprimir(int qtdConsumidores, String[] mes, String[] nome, double[][] consumo, Scanner sc, double salario) {
		
		String maiorS = null;
		
		System.out.println("---Imprimir---\n");
		double valorPagar = 0, cadames = 0, maior = 0, total = 0;
		valorPagar = (salario * 3 / 100) / 350;
		for (int i = 0; i < qtdConsumidores; i++) {
			total = 0;
			System.out.println(nome[i] + ": ");
			for (int j = 0; j < mes.length; j++) {
				cadames = valorPagar * consumo[i][j];
				total += cadames;
				System.out.println("valor a pagar em cada mês --> " + String.format("%.2f", cadames) + " ---> "+ mes[j]);
			}
			
			if (total > maior) {
				maior = total;
				maiorS = nome[i];
			}
		}
		
		return maiorS;
		
	}

}

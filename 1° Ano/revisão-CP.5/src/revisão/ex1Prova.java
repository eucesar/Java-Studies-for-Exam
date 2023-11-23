package revisão;

import java.awt.PageAttributes.PrintQualityType;
import java.text.Format;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ex1Prova {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int qtdConsumidores;
		
		System.out.println("---Receber---");
		System.out.print("Quantidade de consumidores --> ");
		qtdConsumidores = sc.nextInt();
		
		String[] mes = {"Julho", "Agosto", "Setembro"};
		String[] nome = new String [qtdConsumidores];
		double[][] consumo = new double[qtdConsumidores][mes.length];
		
		for (int i = 0; i < qtdConsumidores; i++) {
			sc.nextLine(); //para ingressar conteudo precisa
			System.out.print("nome --> ");
			nome[i] = sc.nextLine();
			for (int j = 0; j < mes.length; j++) {
				System.out.print("consumo " + mes[j] + " --> ");
				consumo[i][j] = sc.nextDouble();
			}
		}
		double salario;
		System.out.print("salario --> ");
		salario = sc.nextDouble();
		String maiorS = null;
		
		System.out.println("---Imprimir---\n");
		double valorPagar = 0, cadames = 0, maior = 0, total = 0;
		valorPagar = (salario * 3 / 100) / 100;
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
		
		System.out.println("maior mês --> " + maiorS);
	}

}

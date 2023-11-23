package revisão;

import java.util.Iterator;
import java.util.Scanner;

public class provaantigaEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] mes = {"janeiro", "fevereiro", "março", "abril", "maio", "junho"};
		double[] consumo = new double[mes.length];
		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < mes.length; i++) {
			System.out.print("consumo de agua em " + mes[i] + " --> ");
			consumo[i] = sc.nextDouble();
			
			if(consumo[i] > maior) {
				maior = consumo[i];
			}
			
			if (consumo[i] < menor) {
				menor = consumo[i];
			}
		}
		
		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor + "\n");
		
		double salario;
		System.out.print("salario --> ");
		salario = sc.nextDouble();
		
		double cadaMes, pagar = 0, total = 0;
		cadaMes = (salario * 2 / 100) / 500;
		
		for (int i = 0; i < mes.length; i++) {
			pagar = cadaMes * consumo[i];
			System.out.println("vai pagar em " + mes[i] + " --> R$" + String.format("%.2f", pagar));
			total += pagar;
		}
		
		System.out.println(String.format("%.2f", total));
	}

}

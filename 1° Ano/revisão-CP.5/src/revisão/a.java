package revisão;

import java.util.Random;

public class a {

	public static void main(String[] args) {

		int[] vetor = new int [10];
		Random rd = new Random();
		System.out.println("numeros aléatorios : ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(1,11);
			System.out.print(vetor[i] + " ");
		}
		
		int par;
		par = pares(vetor);
		System.out.println();
		System.out.println("\ntotal de pares --> " + par);
		
		int impar;
		impar = impares(vetor);
		System.out.println("total de impares --> " + impar);

	}

	private static int pares(int[] vetor) {
		
		int par = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				par++;
			}
		}
		return par;
	}

	private static int impares(int[] vetor) {
	
		
		int impar = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 1) {
				impar++;
			}
		}
		return impar;
	}

}

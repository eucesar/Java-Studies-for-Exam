package revisão;

import java.util.Random;

public class a2 {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		Random rd = new Random();
		
		preencher(rd, vetor);
		
		imprimir(rd, vetor);
		
		int menor;
		menor = menor(rd, vetor);
		
		tabuada(rd,vetor, menor);

	}


	private static void preencher(Random rd, int[] vetor) {
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(1, 11);
			
		}
		
	}
	

	private static void imprimir(Random rd, int[] vetor) {
		
		System.out.println("Valor Aléatorio : ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
	}
	
	private static int menor(Random rd, int[] vetor) {
		
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.println();
		System.out.println("\nMenor valor --> " + menor);
		return menor;
		
	}
	

	private static void tabuada(Random rd, int[] vetor, int menor) {
		
		int vezes;
		System.out.println("\nTabuada: ");
		for (int i = 0; i < vetor.length; i++) {
			vezes = menor * vetor[i];
			System.out.println(menor + " x " + vetor[i] + " = " + vezes);
		}
		
	}

}

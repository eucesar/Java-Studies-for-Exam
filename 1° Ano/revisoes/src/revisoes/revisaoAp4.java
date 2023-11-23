package revisoes;

import java.util.Scanner;

public class revisaoAp4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int totalCompetidor;
		int totalLancamento;
		double soma;
		
		System.out.print("Total de competidores --> ");
		totalCompetidor = in.nextInt();
		System.out.print("Total de lançamentos --> ");
		totalLancamento = in.nextInt();
		
		String[] nome = new String[totalCompetidor];
		double[][] lancamento = new double[totalCompetidor][totalLancamento+1];
		
		for (int i = 0; i < totalCompetidor; i++) {
			in.nextLine();
			System.out.println("Competidor " + (i + 1));
			System.out.print("Nome: ");
			nome[i] = in.nextLine();
			soma = 0;
			for(int j = 0; j < totalLancamento; j++) {
				System.out.print("Lançamento " + (j + 1) + " ");
				lancamento[i][j] = in.nextDouble();
				soma = soma + lancamento[i][j];				 
			}	
			System.out.println();
			lancamento[i][totalLancamento] = soma;
		}
		
		// saída de dados
		System.out.println();
		for(int i = 0; i < totalCompetidor; i++) {
			System.out.println(nome[i] + " ---> " + lancamento[i][totalLancamento]);
		}
	}

}

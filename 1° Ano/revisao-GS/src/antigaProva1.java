import java.util.Scanner;

public class antigaProva1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int qtdPesquisados;
		
		System.out.print("qtd de alunos pesquisados --> ");
		qtdPesquisados = sc.nextInt();
		
		int[] favorouContra = new int [qtdPesquisados];
		int favor = 0;
		int contra = 0;
		
		for (int i = 0; i < qtdPesquisados; i++) {
			System.out.print((i+1) + "° aluno --- " + "Favor digite '1' ou contra '0' --> ");
			favorouContra[i] = sc.nextInt();
			
			if (favorouContra[i] == 1) {
				favor++;
			}
			
			else if (favorouContra[i] == 0) {
				contra++;
			}
			
			else{
				System.out.println("informou valores errados, informe valores corretos");
				i--;
			}
			
		}
		
		System.out.println("Alunos que são a favor = " + favor);
		System.out.println("Alunos que são contra = " + contra);
		
		double porcF;
		porcF = (favor * 100) / qtdPesquisados;
		System.out.println(porcF + "%");
		
		double porcC;
		porcC = (contra * 100) / qtdPesquisados;
		System.out.println(porcC + "%");
	}

}

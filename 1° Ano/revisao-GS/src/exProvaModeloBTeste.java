import java.util.Scanner;

public class exProvaModeloBTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int qtdFuncionarios;
		
		System.out.print("qtd de funcionario --> ");
		qtdFuncionarios = sc.nextInt();
		
		String[] nome = new String[qtdFuncionarios];
		double[] salario22 = new double[qtdFuncionarios];
		double[] salario23 = new double[qtdFuncionarios];
		double[] porc = new double[qtdFuncionarios];
		
		entradaDados(nome,salario22, salario23, porc);
		
		imprimir(nome,salario22, salario23, porc);
		
		maior(nome,salario22, salario23, porc);
		menor(nome,salario22, salario23, porc);

		

		
	}

	private static void menor(String[] nome, double[] salario22, double[] salario23, double[] porc) {
		double menor = Integer.MAX_VALUE;
		int index = 0;
		
		for (int i = 0; i < nome.length; i++) {
			if (porc[i] < menor) {
				menor = porc[i];
				index = i;
			}
		}
		System.out.println("menor = " + nome[index]);
		
	}

	private static void maior(String[] nome, double[] salario22, double[] salario23, double[] porc) {

		double maior = Integer.MIN_VALUE;
		int index = 0;
		
		for (int i = 0; i < nome.length; i++) {
			if (porc[i] > maior) {
				maior = porc[i];
				index = i;
			}
		}
		
		System.out.println("\nmaior = " + nome[index]);
		
	}

	private static void imprimir(String[] nome, double[] salario22, double[] salario23, double[] porc) {
		
		for (int i = 0; i < nome.length; i++) {
			
			System.out.println(nome[i] + ": ");
			
			System.out.println("Salario agosto de 22k --> " + salario22[i]);
			
			System.out.println("Salario agosto de 23k --> " + salario23[i]);
			
			System.out.println("procentagem --> " + porc[i] + "%");
			
			System.out.println();
			
		}
	
	}

	private static void entradaDados(String[] nome, double[] salario22, double[] salario23, double[] porc) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < nome.length; i++) {
			
			System.out.print("nome --> ");
			nome[i] = sc.nextLine();
			
			System.out.print("salario agosto de 22k --> ");
			salario22[i] = sc.nextDouble();
			
			System.out.print("Salario agosto de 23k --> ");
			salario23[i] = sc.nextDouble();
			
			porc[i] = ((salario23[i] - salario22[i]) / salario22[i]) * 100;
			
			sc.nextLine();
			System.out.println();

		}
		
	}

}

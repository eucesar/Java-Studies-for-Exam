package revisão;

import java.util.Scanner;

public class numerosInvertidos {

	public static void main(String[] args) {
		
		// declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int valor, inverso;
		int centena, dezena, unidade;
		
		// entrada de dados
		System.out.print("Informe um valor com 3 dígitos (100 - 999): ");
		valor = teclado.nextInt();
		
		// processamento de dados
		centena = valor / 100; //unidade
		dezena = valor / 10 % 10; //dezena
		unidade = valor % 10;
		inverso = unidade * 100 + dezena * 10 + centena;
		
		System.out.println("unidade" + centena);
		System.out.println("dezena" + dezena);
		System.out.println("centena" + unidade);
		
		// saída de dados
		System.out.println(valor + " invertido é " + inverso);
		
	}

}

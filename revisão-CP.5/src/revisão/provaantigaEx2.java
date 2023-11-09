package revisão;

import java.util.Iterator;
import java.util.Scanner;

public class provaantigaEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.print("numero --> ");
		numero = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < numero; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
				soma += i;
			}
		}
		System.out.println("\n" + soma);
	}

}

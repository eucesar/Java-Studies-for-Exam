package revisãoCps;
import java.util.Scanner;

/*
 * Se listarmos todos os números naturais abaixo de 10 que são múltiplos de 
 * 3 e 5, nós obtemos 3, 5, 6 e 9. A soma desses valores é 23. Escreva um programa 
 * em Java leia um valor inteiro e positivo (deve ser testado) representando um 
 * limite. Seu programa deverá encontrar a soma de todos os múltiplos de 3 e 5 
 * abaixo do limite informado.
 */

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor;
		int soma = 0;
		
		System.out.print("valor --> ");
		valor = sc.nextInt();
		
		//logica - somar multiplos de dois numeros
		for(int i = 1; i < valor; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				soma += i;
			}
		}
		System.out.println("soma = " + soma);

	}
}

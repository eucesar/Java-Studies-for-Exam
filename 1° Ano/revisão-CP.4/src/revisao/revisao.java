package revisao;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class revisao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		int qtd = 0;
		
		System.out.println("informe um valor positivo e inteiro ->");
		
		valor = teclado.nextInt();
		
		if (valor > 0) {
			for(int cont = 2; cont < valor; cont++) { // eu meio q escluo a possibilidade de ser 1 e o proprio valor, para o codigo carregar mais rapido
				if( valor %  cont == 0){
					qtd++;
					break; //coloco esse break para o codigo para de executar - pq já n é primo, ent n tem necessidade de continuar executando
				}
			}
			if (qtd == 0) { //se n tiver nenhuma alteração, significa que é primo
				System.out.println(valor + " é primo");
			}else {
				System.out.println(valor + " não é primo");
			}
		}else {
			System.out.println("o número deve ser inteiro e positivo ->");
		}

	}
}

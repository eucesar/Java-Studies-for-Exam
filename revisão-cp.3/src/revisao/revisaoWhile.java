package revisao;

import java.util.Scanner;

public class revisaoWhile {

	public static void main(String[] args) {
		
		int valor1=1,valor2=3;
		if (valor1 > 0 && valor2 > 0 && valor2 > valor1) {
			while (valor1 <= valor2) { //tds os valores entre o 1o e 2o - até onde vai - loop começa pelo valor a esquerda
				System.out.println(valor1); //em q vir primeiro o sysout - quem manda no loop que está a esquerda, por isso 'valor 1'
				valor1 = valor1 + 1; //break
				
			}
		}else {
			System.out.println("os valres devem ser positivos e o segundo maior que o primeiro");
		}
		
		//padrão :
		int contador = 1, valorMaximo = 3;
		if(valorMaximo >= 1) {
			
			while (contador <= valorMaximo) { //semmpre "<=" - olhar numero da esquerda
				System.out.println(contador); //sysout tem q vir 1° e tambem tem q ter o var da esquerda
				contador++;//2 +1 = 3 - dps do sysout
			}
			
		}else {
			System.out.println("valor menor q 0");;
		}
		//
		
		//repetir colocar valor, loop - e vai verificar maior valor
		Scanner teclado = new Scanner(System.in);
		int valor, maior = 0;
		int contador = 1; //começa no 1 até o 5
		
		while (contador <= 5) { //so trabalha com <= ou >= para loop
			System.out.print("digie um valor ----> "); //vai pedir para digitar o 'valor' 5 vzs
			valor = teclado.nextInt();
			if(contador == 1 || valor > maior) { //vai mostrar o maior de dados - sera == 1 pq quer numero q n seja negativo - o valor, já q MAIOR é 0
				 maior = valor; //armazena valor, maior de tds
			}
			contador = contador + 1; //4 + 1 = 5, vai repetir 5 vzs
		}
		
		
		//maior valor - padrão :
		System.out.println("maior = " + maior); //coloco o maior por fora do loop
		//
		int contador = 1;
		int maior = 0;
		double numero;
		while ( contador <= 5) {
			System.out.println("--->");
			numero = teclado.nextDouble();
			if (numero == 1 || numero > maior) {
				numero = maior;
			}
			contador++;
			
		}
		System.out.println("maior" + maior);
		//
		
		//tabuada
		int resultado;
		String resposta;
		
		do {
			System.out.print("Valor ---> ");
			valor = teclado.nextInt();
			
			contador = 0; // 0 pq n tabuada tem 0
			while(contador <= 10) { //9
				resultado = valor * contador;
				System.out.println(valor + " * " + contador + " = " + resultado);
				contador = contador + 1; //9 + 1 = 10 - 0 a 10
			}
			//S OU N
			System.out.print("Deseja outra tabuada (s / n) ? ");
			resposta = teclado.next();
			
			}while(resposta.equalsIgnoreCase("s"));{ //ignore minusculo e maisculo - aperta o S ele retorna o loop, enquano o N para
			//esse do while = é como se fosse if e else, sendo else o 'n', o oposto do 's'
		}
		//
			
		//somar par
			int valor, total, contador = 1;
			int par = 0;
			
			System.out.print("Inorme o total de numeros ---> ");
			total = teclado.hashCode();//hashcode = valor inteiro
			
			while(contador <= total) {
				System.out.println("Valor --> ");
				valor = teclado.nextInt();
				if(valor % 2 == 0) {
					par ++; //vai pegar o valor que ele quer comparar do loop, e vai contar tds os pares, somar 
				}
				contador++;
			}
		//
			
	}
}

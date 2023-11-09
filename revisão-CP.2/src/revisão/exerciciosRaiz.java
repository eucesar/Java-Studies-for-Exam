package revisão;

import java.util.Scanner;

public class exerciciosRaiz {
	
	public static void main(String[] args) {
		double y,x,a,b,c, d, mq, mg;
		int A, B;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println();
		y = teclado.nextDouble();
		
		System.out.println();
		x = teclado.nextDouble();

		System.out.println();
		a = teclado.nextDouble();
		
		System.out.println();
		b = teclado.nextDouble();
		
		System.out.println();
		c = teclado.nextDouble();
		
		System.out.println();
		d = teclado.nextDouble();
		
		System.out.println();
		mq = teclado.nextDouble();
		
		System.out.println("idade"); 
		mg = teclado.nextDouble();
		
		teclado.nextLine();
		
		System.out.println("nome"); 
		nome = teclado.nextLine();
		
		//a
		y = (2 + a / b - 3) - 2 * x + Math.pow(x, 3);
		
		//b
		x = ((b / a + c) + 4 * a) / ((d - 2 * a) / ( 3 + c));
		
		//c
		x = (Math.pow(-b, 15) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * Math.pow(a, 2) * Math.sqrt(7 * c));
		
		//d
		x = (Math.pow(b+1, 2) + c + a ) / (b + (1/2) + ((2 * a) / (b*b)));
		
		//9
		//a		Math.sqrt () = Math.pow ( td dentro da raiz, 1.0 / numero na esquerda da raiz
		 y = Math.pow(  Math.sqrt(2) * Math.sqrt(x+y) * Math.pow(Math.pow(x, 3)/2, 1.0 / 25.0), 1.0/13.0);
		
		 //b
		 x = 1/Math.sqrt(x) + 1/Math.pow(x, 1.0/3.0) + 1/Math.pow(x, 1.0 / 5.0);
		 
		 //c
		 mq = Math.sqrt(a*a + b*b + c*c + d*d / 4);
		 
		 //d
		 mg = Math.pow(a*b*c*d, 1.0 / 4.0);
		 
		 // printf = "diajdjias: %;2f", x
		 //println("dsddssd: " + String.format("%.2f", x));
		 System.out.println( "aaaa:" + String.format("%.2f", x));
		 System.out.printf("dalskdkasoldl: %.2f", x);
		 
		//inverter
		//valores
		System.out.println();
		A = teclado.nextInt(); //2
		
		
		System.out.println();
		B = teclado.nextInt(); //3
		
		
		//formula
		A = B + A; //5
		B = A - B; //2
		A = A - B; //3
	}	
}
import java.util.Scanner;

public class revisaoGeral3 {

	public static void main(String[] args) {
		
		
		int x,y,z, m;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor 1 --> ");
		x = sc.nextInt();
		
		System.out.print("Valor 2 --> ");
		y = sc.nextInt();
		
		System.out.print("Valor 3 --> ");
		z = sc.nextInt();
		
		int aux;
		aux = x;
		if (y > aux) {
			aux = y;
		}
		if (z > aux) {
			aux = z;
		}
		
		System.out.println(aux);
	}

}

import java.util.Random;

public class revisaoGeral2 {

	public static void main(String[] args) {
		
		int[] x = new int[10];
		
		Random rd = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = rd.nextInt(30);
			System.out.print(x[i] + " ");
		}
		
		int aux;
		int j = x.length - 1;
		for (int i = 0; i < x.length/2; i++) {
			aux = x[i];
			x[i] = x[j];
			x[j] = aux;
			j--;
			
			
		}
		
		System.out.println();
		for (int i = 0; i < x.length; i++) {                                                                        
			System.out.print(x[i] + " ");
		}
	}

}

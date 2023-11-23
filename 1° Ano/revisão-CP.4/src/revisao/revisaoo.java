package revisao;

import java.util.Random;
import java.util.Scanner;

public class revisaoo {
	
	//loop de repetição ------------------------------------------->
	//numeros diviziveis por ele mesmo
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		System.out.print("selecione qq valor ->");
		valor = teclado.nextInt();
		
		if (valor > 0) { 
			for (int i = 1; i <= valor; i++) { //coloco em loop e quem decide o numero maior é o 'valor'
				if (valor % i  == 0) {
					System.out.println(i + " ");
				}
			}
		}else {
			System.out.println("a variavel valore tem q ser maior que 0");
		}
		
		
		System.out.println();
		
		//valores inteiros e primos (multiplo de 1 e dele mesmo)
		Scanner teclado2 = new Scanner(System.in);
		int valor2;
		int qtd = 0;
		
		System.out.println("selecione o valor -> ");
		valor2 = teclado.nextInt();
		
		if (valor2 > 0) {
			for (int i = 2; i < valor2; i++) {
				if (valor2 % i == 0) {
					qtd++;
					break;
				}
			}
			if (qtd == 0) {
				System.out.println("eh primo");
			}else {
				System.out.println("é primo");
			}
		}else {
			System.out.println("Tem que ser um valor de nmr inteiro");
		}
		
		
		//fazer uma lojinha
		Scanner teclado = new Scanner(System.in);
		
		int qtdProduto;
		double preço;
		double totalcompra = 0;
		int formapagamento;
		
		System.out.println("Informe a quantidade de produtos:");
		qtdProduto = teclado.nextInt();
		
		for ( int cont = 1; cont <= qtdProduto; cont++){
			System.out.println(cont + "."+ " Preço do produto R$");
			preço = teclado.nextDouble();
			totalcompra = totalcompra + preço;
		}
		System.out.println("total da compra R$" + totalcompra);
		
		//*-------------------------------------------------------*/
		System.out.println(" Escolha a forma de pagamento");
		System.out.println("1. pagamento a vista com 10% de desconto");
		System.out.println("2. em duas vezes com 15.5% de acrescimo");
		formapagamento = teclado.nextInt();
		
		if (formapagamento == 1) {
			totalcompra = totalcompra * 0.9;
			System.out.println("valor para pagmento a vista R$" + totalcompra);
		} else {
			totalcompra = totalcompra * 1.155; //vai almentar, por isso o 1 dps o ponto 
			System.out.println("valor para pagamento em duas vezes R$" + totalcompra);
			System.out.println("duas parcelas de R$" + (totalcompra /2));
		}
		
		
		//--------------------------------------------------------------------------------------------->
		
		//matrix :
		//exemplo :
		Scanner teclado = new Scanner(System.in);
		int [] x = new int [6];
		
		//entrada
		for (int i = 0; i < x.length; i++) {
			System.out.print("valor ->");
			x[i] = teclado.nextInt(); //6 [i] - 6[1,2...]
		}
		
		//saida
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+ "°" + "número ");
		}
		
		//SELECIONANDO MAIOR E MENOR VALOR DE UMA MATRIX DE 1000 - 5 DIGITOS
		Scanner teclado = new Scanner(System.in);
		int [] v = new int [5];
		int maior = Integer.MIN_VALUE; //inverto - se eu coloco na 1° '1' vai ser o maior, mas se na 2° eu colcoar '2' ent ele vai ser o maior
		int menor = Integer.MAX_VALUE; //vai do maior até o menor
		
		// entrada de dados
		for(int i = 0; i < v.length; i++){ //x.length - é o ultimo numero
			System.out.print("valor -> ");
			v[i] = teclado.nextInt();
			
			//tenho q colocar em 'if' - adicionar uma variavel em putra - uso o simbolod e menor pq é um vetor
			if(v[i] > maior) {
				maior = v[i];
			}
			if(v[i] < menor) {
				menor = v[i];
			}
		}
		
		System.out.println("maior valor = " + maior);
		System.out.println("menor valor = " + menor);
		
		//5 DIGITOS QUAIS SÃO IMPAR E PAR - conta o maximopd e numero impar e par
		Scanner teclado = new Scanner(System.in);
		int [] v = new int [5]; //v de vaor
		int par = 0;
		
		// entrada de dados
		for(int i = 0; i < v.length; i++){ //x.length - conprimento da variavel total - ultimo numero
			System.out.print("valor -> ");
			v[i] = teclado.nextInt();
			
			if(v[i] % 2 == 0) {
				par++;
			}
			
		}
		System.out.println("total de pares = " + par);
		System.out.println("total de impares = " + (v.length - par)); //ele vai deletar os numeros da ordem
	
		
		//TEMPERATURA
		Scanner teclado = new Scanner(System.in);
		double [] temperatura = new double [7];
		String [] dia = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quina-feira", "sexta-feira", "sábado"}; //colocar coisas dentro de vetores
		
		double media = 0;
		
		// entrada de dados
		for (int i = 0; i < temperatura.length; i++) {
			System.out.print("Informe a temperatura máximo do(a) " + dia[i] + " -> "); //a variavel do loop fica dentro da array da varivel dos dias
			temperatura[i] = teclado.nextDouble();
			media += temperatura[i]; // media = media + temperatura
		}
		
		media /= temperatura.length; //media 
		
		// impressão dos dias com temperatua acima de média
		System.out.println();
		for (int i = 0; i < temperatura.length; i++) {
			if(temperatura[i] > media) {
				System.out.println(dia[i]);
			}
			
		}
		
		//RANDOM :
		Random random = new Random();
		
		int x = random.nextInt() % 10; //todos os numeros gerados vão ficar a baixo de 10
		int y = random.nextInt(50); //começa a gerar numero a partir do 0 até o 50
		
		System.out.println(x);
		
	
		//=>
		//achar 5 algoritomos que n seja 5 e ainda por cima n repetido
		Random random = new Random();
		int[] v = new int [5]; //posição = linha
		boolean achei;  //falso                                    
		
		//entrada de dados
		for (int i = 0; i < v.length;) {
			v[i] = random.nextInt(5); //numero maximo de random
			achei = false;
			
			for (int j = 0; j < i; j++) { //trabalho com o i de vez com o v - pq sim pq esta dentro do loop
				
				if(v[j] == v[i]) {
				achei = true;
				}
 
			}
			if (achei == false) {
				i++; //so vou mudar de posição s en tiver numero repetido
			}
		}

		//saida de dados - eh o msm loop q o outro 
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		
		
		//=>
		// RANDOM ==>
		Random random = new Random();
		int[] v = new int[10];
		int aux;
		
		//ler os dadaos do vetor
		System.out.println("Antes de ordenação");
		for (int i = 0; i < v.length; i++) {
			v[i] = random.nextInt(3 * v.length);
			System.out.println(v[i] + " ");
		}
		
		//ordem dos dados - ordenar dados em ordem com valores alatorios
		for (int j = 0; j < v.length; j++) {
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] > v[i + 1]) {
				aux = v[i]; //grava
				v[i] = v[i + 1]; //vai subtituir o maior
				v[i+1] = aux; //grava
				
			}
		}
	}
		
		
		//impressao apos a ordenação
		System.out.println("/nDepois da ordenação"); //pula a linha de cima
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + " ");
		}
	}
	
}

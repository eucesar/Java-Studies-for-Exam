package revisao;

import java.util.Scanner;

public class revisaoIfElse {

	public static void main(String[] args) {
		
		//par - impar
		int valor = 1;
		
		//formula + saida -
		if (valor % 2 != 0) {
			System.out.println("impar");
		}else {
			System.out.println("par");
		}
		
		//valores netaivos e positivos
		if (valor < 0) {
			System.out.println("negativo");
		}else {
			System.out.println("positivo");
		}
		//
		
		//if e else - so vai fazer isso se o x for oq está no if
		int x = 1;
		double y;
		if (x > 5 || x < -5) { 
			//conta
			y = 8 / Math.sqrt(Math.pow(x, 2) - 25);
			System.out.println("Valor de y: " + y);
		} else {
			System.out.println("Vai dar um numero incorreto");
		}
		//
		
		//lados de um tringulo
		double lado1 =1, lado2=1, lado3=1;
		//tringulo tem 3 lados, tem q testar os tres lados
		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) { //um lado tem que ser menor que a soma dos outros dois para ser um tringulo
			System.out.println("eh tringulo");
			System.out.println("lado1: " + lado1);
			System.out.println("lado2: " + lado2);
			System.out.println("lado3: " + lado3);
		}else {
		System.out.println("os valores não formam um tringulo"); {
		}
		}
		//
		
		// usar nextLine para NOME - so se for dps da idade - n armazenar nenhum espaço da idade
		String nome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual sua idade?: ");
		idade = teclado.nextInt();
		
		teclado.nextLine(); //para n armazenar nenhum espaço que o usuario pode ser que coloque na idade, oq o nextLine armazena TD
		
		System.out.print("Qual seu nome?: ");
		nome = teclado.nextLine(); //vai escrever contabilizar TD q foi digitado na linha
		//
		
		// escrevo o codigo no else, fica melhor
		// descobrir menor valor entre 3 int
		int x = 1, y = 2, z = 3;
		if (x == y || x == z || y == z) {
			System.out.println("os valores tem que ser diferentes"); //nenhum pode ser igual ao outro - crio um if e coloco td o resto no else
		} else {
			if (x < y && x < z) { //descobrir o menor valor 
				System.out.println("menor  = " + x);
			}
			else if (x < z) { //eu aponto so duas variaveis e sobra y, ent y vai ser o menor = z,x,y
				System.out.println("menor = " + y);
			}
			else { //o inverso
				System.out.println("menor = " + z);
			}	
		}
		//
		
		//oq a pessoa digita um numero igual aparece aqui
		double valor;
		if (valor == 1) {
			System.out.println("você digitpu 1");
		}
			else if (valor == 2) {
			System.out.println("você digitou 2");
			}

			else if (valor == 3) {
			System.out.println("você digitou 3");
			} 

			else if (valor == 4) {
			System.out.println("você digitou 4");
			}
			//um else no final como erro
			else {
			System.out.println("você digitou um valor diferente");
			}
		
		//msm coisa que "valor == 3"
		int valor;
		switch (valor) { //var
		case 1 : //CASO o valor da tecla/case 1 for digitada   =>   if (valor == 1)  => usar ':' no final => armazena STRING tambem
			System.out.println("você digitou 1");
				break; //tenho q colocar um break quando uso switch
		case 2:
			System.out.println("você digiotu 2");
				break;
		case 3:
			System.out.println("você digiotu 3");
				break;
		case 4: 
			System.out.println("você digiotu 4");
				break;
		default: //nenhuma q n seja a case dita em cima - n uso break no default
			System.out.println("você digiotu outro valor"); 
		}
		//
		
		//verificar se é vogal
		//letra = letra.tolowercase() => dps uso || e else => ou switch "a" e default
		String letra;
		System.out.println("informe uma letra -->");
		letra = teclado.next(); //next = armazenar um aso letra   //teclado.nextLine(); //n preciso usar pq n usei uma nextline = mas so um next pq vai armazenar apenas uma letra - teria q ter colocado em cima dessa linha c tivesse outro variavel q armazena um numero q o usuario digitou

		letra = letra.toLowerCase(); //transformar em minuscula oq foi escrito sem espaço
		
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))  {
			System.out.println("você digitou uma vogal");
		}
		else {
			System.out.println("você não digiotu uma vogal");
		}
		//
		
		//verificar se é vogal com switch
		System.out.println("informe uma letra -->");
		letra= teclado.next();
		
		letra = letra.toLowerCase();//transformo em minusculo para dps trabalhar
		
		switch (letra) {
		case"a":
		case"e":
		case"i":
		case"o":
		case"u":
			System.out.println("você digiotu uma vogal");
			break; //soh uso break aqui pq eu usei um sysout, ent so coloco break aonde tem sysout
		
		default: //se for oposto de td
			System.out.println("você não digitou uma vogal");
		}
		//
		
		
		
	}
		
}
		




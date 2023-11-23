package revisão;

import java.util.Scanner;

public class supostaGS {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o código de 24 caracteres: ");
	        String userInput = scanner.nextLine();
	        
	        if (isPalindrome(userInput)) {
	            System.out.println("Palavra palíndromo.");
	        } else {
	            System.out.println("Palavra não palíndromo.");
	        }
	        
	        scanner.close();
	    }

	    private static boolean isPalindrome(String code) {
	        int length = code.length();
	        for (int i = 0; i < length / 2; i++) {
	            if (code.charAt(i) != code.charAt(length - 1 - i)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
package zadaci;

import java.util.Scanner;

public class BrojCifaraUnetogBroja {
	
	/*
	 * 
	 * 
	 * 1. Napisati program koji ispisuje koliko cifara ima uneti broj n.
	 */

	public static void main(String[] args) {

    brojCifaraUnetogBroja();
	
	}
	
	public static void brojCifaraUnetogBroja() {
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Unesite broj: ");
	    int n = sc.nextInt();
	    int brojCifara=1;
	    
	    int unetBroj = n;

		
		while (n/10!=0)
		{
			brojCifara++;
			n=n/10; 
			
		} 
		
		System.out.println("Broj " + unetBroj + " ima " + brojCifara + " cifara.");
	}

}

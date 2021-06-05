package zadaci;

import java.util.Scanner;

public class InverzanIspisNiza {

	/*
	 * 
	 * 6. Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
	 * redosledom. Primer niza: 32 54 123 18 Ispis: 18 123 54 32
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzinaNiza = sc.nextInt();

		int[] niz = new int[duzinaNiza];

		unosNiza(niz);
		inverzanIspisNiza(niz);
	}
	
	public static void unosNiza(int[] n) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < n.length; i++) {

			System.out.println("Unesite element niza: ");
			int unetBroj = sc.nextInt();

			n[i] = unetBroj;

		}
		

	}
	
	public static void inverzanIspisNiza(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[n.length - i - 1] + " ");

		}
		
	}

}

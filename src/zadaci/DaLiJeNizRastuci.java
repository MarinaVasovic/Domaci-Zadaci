package zadaci;

import java.util.Scanner;

public class DaLiJeNizRastuci {

	/*
	 * 
	 * 
	 * 7. Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
	 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
	 * 422 1001 5054 Ispis: Niz je rastuci.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzinaNiza = sc.nextInt();

		int[] niz = new int[duzinaNiza];
		
		unosNiza(niz);
		ispisDaLiJeNizRastuci(niz);

	}
	
	public static void unosNiza(int[] n) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < n.length; i++) {

			System.out.println("Unesite element niza: ");
			int unetBroj = sc.nextInt();

			n[i] = unetBroj;

		}

	}
	
	public static void ispisDaLiJeNizRastuci(int[] n) {
		boolean rastuci = false;
		for (int i = 0; i < n.length - 1; i++) {
			if (n[i] < n[i + 1]) {
				rastuci = true;
			} else {
				rastuci = false;
				break;
			}
		}

		if (rastuci) {
			System.out.println("Niz je rastuci");
		} else {
			System.out.println("Niz nije rastuci");
		}
	}
}

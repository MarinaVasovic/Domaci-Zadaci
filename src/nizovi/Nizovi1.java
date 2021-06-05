package nizovi;

import java.util.Scanner;

public class Nizovi1 {

	/*
	 * Napisti program koji sa standardnog ulaza ucitava duzinu i elemente niza koji
	 * su tipa int. Zatim niz proslediti metodi koja treba da proveri da li je niz
	 * palindrom ili nije. Na standradnom izlazu obavestiti krajnjeg korisnika njemu
	 * razumljivim tekstom da li je unesen niz palindrom. Primer ucitanog niza koji
	 * je palindrom: 12 46 17 46 12 Primer ucitanog niza koji nije palindrom: 12 46
	 * 17 12 64. 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzinu niza: ");

		int duzinaNiza = sc.nextInt();

		int[] niz = new int[duzinaNiza];

		unosNiza(niz);

		boolean daLiJeNizPalindrom = daLiJePalindrom(niz);

		if (daLiJeNizPalindrom == true) {
			System.out.println("Niz je palindrom!");
		} else {
			System.out.println("Niz nije palindrom!");

		}

	}

	public static void unosNiza(int[] n) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < n.length; i++) {

			System.out.println("Unesite elemente niza: ");
			int unetBroj = sc.nextInt();

			n[i] = unetBroj;

		}

	}

	public static boolean daLiJePalindrom(int[] n) {

		boolean isPalindrom = true;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == n[n.length - i - 1]) {

			} else {
				isPalindrom = false;
				break;
			}
		}

		return isPalindrom;

	}

}

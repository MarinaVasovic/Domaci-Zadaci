package nizovi;

import java.util.Scanner;

public class Nizovi2 {

	/*
	 * Napisati program koji izracunava proizvod elemenata niza tipa int, koji su
	 * veci od njihovog indeksa. Za unos niza i za proizvod koristiti zasebno
	 * metode. Duzina niza i unos niza ucitavaju se sa standardnog ulaza. Primer
	 * ucitanog niza: 3 7 1 4 2 5 Primer izracunatog proizvoda: 84
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzinu niza: ");

		int duzinaNiza = sc.nextInt();

		int[] niz = new int[duzinaNiza];

		unosNiza(niz);

		int proizvodElemenataVecihOdSvogIndexa = proizvodElemenataVecihOdSvogIndexa(niz);

		System.out.println(
				"Proizvod unetih brojeva koji su veci od njihovog indexa je: " + proizvodElemenataVecihOdSvogIndexa);

	}

	public static void unosNiza(int[] n) {
		for (int i = 0; i < n.length; i++) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Unesite elemente niza: ");
			int unetBroj = sc.nextInt();

			n[i] = unetBroj;

		}
	}

	public static int proizvodElemenataVecihOdSvogIndexa(int[] n) {

		int proizvod = 1;
		for (int i = 0; i < n.length; i++) {

			if (n[i] > i) {
				proizvod = proizvod * n[i];

			}
		}

		return proizvod;
	}

}

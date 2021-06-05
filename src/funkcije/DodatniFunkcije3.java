package funkcije;

import java.util.Scanner;

public class DodatniFunkcije3 {

	/*
	 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva
	 * i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca
	 * najveci od unetih brojeva.
	 */

	public static void main(String[] args) {

		zbirUnetihBrojeva();

		int najveciUnetiBroj = najveciUnetiBroj();

		System.out.println("Najveci unet broj je: " + najveciUnetiBroj);
	}

	public static void zbirUnetihBrojeva() {

		Scanner sc = new Scanner(System.in);
		int zbir = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Unesite broj: ");
			int unetBroj = sc.nextInt();
			zbir = zbir + unetBroj;

		}
		System.out.println("Zbir unetih brojeva je: " + zbir);
	}

	public static int najveciUnetiBroj() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");

		int maximum = sc.nextInt();
		for (int i = 0; i < 2; i++) {
			int broj = sc.nextInt();

			if (broj > maximum) {
				maximum = broj;
			}

		}

		return maximum;
	}

}

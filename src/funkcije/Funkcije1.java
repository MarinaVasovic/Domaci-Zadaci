package funkcije;

import java.util.Scanner;

public class Funkcije1 {

	/*
	 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci
	 * da korisnik unosi tri broja) i taj program treba da pozove i ispise (u mainu)
	 * najmanji od ta tri unesena broja.
	 */

	public static void main(String[] args) {

		ispisNajmanjegUnetogBroja();
	}

	public static void ispisNajmanjegUnetogBroja() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj: ");
		int minimum = sc.nextInt();
		for (int i = 0; i < 2; i++) {
			System.out.println("Unesite broj: ");
			int broj = sc.nextInt();
			if (broj < minimum) {
				minimum = broj;
			}
		}

		System.out.println("Najmanji unet broj je " + minimum);
	}

}
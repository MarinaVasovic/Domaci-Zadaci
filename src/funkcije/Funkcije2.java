package funkcije;

import java.util.Scanner;

public class Funkcije2 {

	/*
	 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj
	 * program treba da pozove i vrati (u mainu) proizvod unetih brojeva
	 */

	public static void main(String[] args) {

		int proizvodUnetihBrojeva = proizvodUnetihBrojeva();

		System.out.println("Proizvod unetih brojeva je: " + proizvodUnetihBrojeva);

	}

	public static int proizvodUnetihBrojeva() {

		Scanner sc = new Scanner(System.in);
		int proizvod = 1;
		for (int i = 0; i < 3; i++) {
			System.out.println("Unesite broj: ");
			int unetBroj = sc.nextInt();
			proizvod = proizvod * unetBroj;

		}

		return proizvod;
	}

}

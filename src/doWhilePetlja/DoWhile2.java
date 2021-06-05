package doWhilePetlja;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ce korisniku ispisati poruku da li je ceo pozitivan
		 * broj koji je uneo palindrom ili nije palindrom. (palindromi -> isto mu dodje
		 * citali sleva nadesno ili s desne na levu stranu).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj: ");

		int n = sc.nextInt();

		int obrnutBroj = 0;
		int unetBroj = n;

		do {
			int ostatak = n % 10;

			obrnutBroj = obrnutBroj * 10 + ostatak;

			n = n / 10;

		} while (n != 0);

		if (unetBroj == obrnutBroj)
			System.out.println("Unet broj jeste palindrom.");
		else
			System.out.println("Unet broj nije palindrom");
	}

}
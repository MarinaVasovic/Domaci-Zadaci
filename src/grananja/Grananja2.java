package grananja;

import java.util.Scanner;

public class Grananja2 {

	/*
	 * Grananja2: Prvi domaci zadatak od 15.4.2021. uraditi ponovo, koristeci
	 * grananja kako bismo se ogradili od nemogucih izracunavanja povrsina (kakvi
	 * celi brojevi moraju da budu visina, sirina i duzina?)
	 * 
	 */

	public static void main(String[] args) {

		Scanner unosDimenzije = new Scanner(System.in);

		System.out.println("Unesite duzinu: ");

		int a = unosDimenzije.nextInt();

		if (a <= 0) {
			System.out.println("Uneti broj za duzinu mora biti pozitivan i veci od nule.");
		} else {
			System.out.println("Unesite sirinu: ");

			int b = unosDimenzije.nextInt();

			if (b <= 0) {
				System.out.println("Uneti broj za sirinu mora biti pozitivan i veci od nule.");
			} else {
				System.out.println("Unesite visinu: ");

				int c = unosDimenzije.nextInt();

				if (c <= 0) {
					System.out.println("Uneti broj za visinu mora biti pozitivan i veci od nule.");
				} else {
					int povrsina = a * b + 2 * (b * c + c * a);

					System.out.println("Povrsina okrecene prostorije je " + povrsina);
				}

			}

		}

	}
}

package Sintaksa;

import java.util.Scanner;

public class Sintaksa1 {

	/*
	 * Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
	 * tako sto se ivice prostorije ucitavaju preko konzole. (za pretpostavku uzeti
	 * da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
	 */

	public static void main(String[] args) {

		Scanner unosDimenzije = new Scanner(System.in);

		System.out.println("Unesite duzinu: ");

		int a = unosDimenzije.nextInt();

		System.out.println("Unesite sirinu: ");

		int b = unosDimenzije.nextInt();

		System.out.println("Unesite visinu: ");

		int c = unosDimenzije.nextInt();

		int povrsina = a * b + 2 * (b * c + c * a);

		System.out.println("Povrsina okrecene prostorije je " + povrsina);

	}

}

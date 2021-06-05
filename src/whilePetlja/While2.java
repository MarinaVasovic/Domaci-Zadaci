package whilePetlja;

import java.util.Scanner;

public class While2 {

	/*
	 * Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!”
	 * onoliko puta koliko je korisnik zadao preko konzole. Primer: ako korisnik
	 * unese broj 20, poruku Laku noc! treba ispisati 20 puta
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite koliko puta zelite da se ispise poruka: ");

		int a = sc.nextInt();

		int i = 0;

		while (i < a) {
			System.out.println("Laku noc!");
			i++;
		}

	}

}

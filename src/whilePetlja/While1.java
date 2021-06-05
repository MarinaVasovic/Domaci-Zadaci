package whilePetlja;

import java.util.Scanner;

public class While1 {

	/*
	 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
	 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
	 * unese 1 2 5 3 -1, program treba da ispise 11
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj: ");

		int a = sc.nextInt();

		int sum = 0;

		while (a >= 0) {
			sum = sum + a;
			a = sc.nextInt();
		}

		System.out.println("Zbir unetih brojeva je: " + sum);
	}

}

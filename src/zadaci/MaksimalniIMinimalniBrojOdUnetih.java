package zadaci;

import java.util.Scanner;

public class MaksimalniIMinimalniBrojOdUnetih {

	/*
	 * 
	 * 5. Cest zadatak na intervjuu: Napisati program gde korisnik unosi n brojeva i
	 * ispisuje maksimalni i minimalni broj.
	 */

	public static void main(String[] args) {

		ispisMaksimalnogIMinimalnogUnetogBroja();
	}

	public static void ispisMaksimalnogIMinimalnogUnetogBroja() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko brojeva zelite da unesete? ");
		int n = sc.nextInt();

		System.out.println("Unesite broj: ");
		int unetBroj = sc.nextInt();

		int max = unetBroj;
		int min = unetBroj;
		for (int i = 1; i < n; i++) {
			System.out.println("Unesite broj: ");
			unetBroj = sc.nextInt();
			if (unetBroj > max) {
				max = unetBroj;
			}
			if (unetBroj < min) {
				min = unetBroj;
			}
		}
		System.out.println("Maksimlan unet broj je: " + max);
		System.out.println("Minimaln unet broj je: " + min);
	}

}

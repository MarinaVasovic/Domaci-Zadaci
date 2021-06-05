package grananja;

import java.util.Scanner;

public class Grananja3 {

	/*  Grananja3: Napisati program koji na osnovu unetog naziva meseca ispisuje
	 * koliko ima meseci u godini koji pocinju na to slovo(na taj glas) - za
	 * resavanje ovog zadatka koristiti switch.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Unesite ime meseca: ");

		String imeMeseca = scanner.nextLine();

		switch (imeMeseca) {
		case "Januar":
		case "Jul":
		case "Jun":
			System.out.println("Postoje 3 meseca koji pocinju sa slovom J");
			break;
		case "Februar":
			System.out.println("Postoji 1 mesec koji pocinje sa slovom F");
			break;
		case "Mart":
		case "Maj":
			System.out.println("Postoje 2 meseca koji pocinju sa slovom M");
			break;
		case "April":
		case "Avgust":
			System.out.println("Postoji 2 meseca koji pocinju sa slovom A");
			break;
		case "Septembar":
			System.out.println("Postoji 1 mesec koji pocinje sa slovom S");
			break;
		case "Oktobar":
			System.out.println("Postoji 1 mesec koji pocinje sa slovom O");
			break;
		case "Novembar":
			System.out.println("Postoji 1 mesec koji pocinje sa slovom N");
			break;
		case "Decembar":
			System.out.println("Postoji 1 mesec koji pocinje sa slovom D");

		}

	}

}

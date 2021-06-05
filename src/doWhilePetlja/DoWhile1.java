package doWhilePetlja;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ce omoguciti Peri da unese sa koliko novca raspolaze.
		 * On moze da kupuje sve dok mu ne ostane samo 89 dinara jer mu toliko novca
		 * treba da kupi BUSPLUS kartu i vrati se kuci sa novogodisnjim poklonima. Pera
		 * treba da unosi pojedinacne cene poklona, a program treba da ga obavesti kada
		 * potrosi sav predvidjeni novac, to jest kada za sledeci poklon vise nema
		 * kinte.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi raspolozivi iznos novca: ");

		int iznosRaspolozivogNovca = sc.nextInt();

		int brojKupljenihPoklona = 0;

		while (iznosRaspolozivogNovca > 89) {

			System.out.println("Unesi cenu poklona: ");

			int cenaPoklona = sc.nextInt();

			if (cenaPoklona <= (iznosRaspolozivogNovca - 89)) {
				iznosRaspolozivogNovca = iznosRaspolozivogNovca - cenaPoklona;
				brojKupljenihPoklona = brojKupljenihPoklona + 1;
			} else {
				System.out.println("Cena poklona je veca od vaseg raspolozivog iznosa.");
			}

		}

		System.out.println("Potrosili se sav novac za poklone.");
		System.out.println("Pera je kupio " + brojKupljenihPoklona + " poklona.");

	}

}

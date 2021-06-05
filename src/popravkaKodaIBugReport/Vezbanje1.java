package popravkaKodaIBugReport;

import java.util.Scanner;

public class Vezbanje1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa (zatvaranje kase) 1 - dodavanje cene proizvoda na racun
		 * (ubacivanje u potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
		 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
		 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
		 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 */

		Scanner sc = new Scanner(System.in);

		while (1 == 1) {

			System.out.println(" Izaberite opciju: 0 - Izlaz iz programa (zatvaranje kase)\r\n"
					+ "1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)\r\n"
					+ "2 - naplata racuna");

			int meni;
			meni = sc.nextInt();
			int racun = 0;
			int kusur;
			boolean usaoUcase0 = false;
			switch (meni) {
			case 0:
				System.out.println("Kasa je zatvorena.");
				usaoUcase0 = true;
				;
				break;
			case 1:
				System.out.println("Unesi cenu proizvoda");
				int unesiCenuProizvoda = sc.nextInt();
				racun = racun + unesiCenuProizvoda;

			case 2:
				System.out.println("Uneti novac");
				int unosNovca = sc.nextInt();
				if (unosNovca < racun) {
					System.out.println("greska");
				} else {
					kusur = unosNovca - racun;
					System.out.println("Kusur je " + kusur);
					racun = 0;

				}

			}

			if (usaoUcase0 == true) {
				break;
			}

		}

	}

}

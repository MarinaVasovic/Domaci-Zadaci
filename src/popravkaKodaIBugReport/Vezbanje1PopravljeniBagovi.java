package popravkaKodaIBugReport;

import java.util.Scanner;

public class Vezbanje1PopravljeniBagovi {

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

		double racun = 0;

		while (1 == 1) {

			System.out.println("KASA");
			System.out.println();

			System.out.println(" Izaberite opciju: 0 - Izlaz iz programa (zatvaranje kase)\r\n"
					+ "1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)\r\n"
					+ "2 - naplata racuna");

			int meni;
			meni = sc.nextInt();
			double kusur;
			boolean usaoUcase0 = false;
			switch (meni) {
			case 0:
				if (racun > 0) {
					System.out.println("Vas racun nije naplacen. Molimo platite racun.");
				} else {
					System.out.println("Kasa je zatvorena.");
					usaoUcase0 = true;
				}
				break;
			case 1:
				System.out.println("Unesi cenu proizvoda");
				double unesiCenuProizvoda = sc.nextDouble();

				while (unesiCenuProizvoda <= 0) {
					System.out.println(
							"Uneli ste negativan iznos za cenu proizvoda. Molimo vas unesite validnu cenu proizvoda : ");
					unesiCenuProizvoda = sc.nextDouble();
				}
				racun = racun + unesiCenuProizvoda;
				break;
			case 2:
				if (racun == 0) {
					System.out.println("Vasa kasa je prazna. Nemate sta da platite. ");
					System.out.println();
				} else {
					System.out.println("Vas racun iznosi " + racun + " din. Molimo Vas unesite novac u kasu:");
					double unosNovca = sc.nextDouble();
					if (unosNovca < racun) {
						System.out.println("Greska - uneli ste manje novca nego sto je potrebno da platite racun.");
					} else {
						kusur = unosNovca - racun;
						System.out.println("Kusur je " + kusur);
						racun = 0;

					}
				}
			}

			if (usaoUcase0 == true) {
				break;
			}

		}

	}
}

package klase1;

public class Voznja {

	/* 
	 * Napisati klasu Automobil. Automobil ima 1) marku (polje tipa String) koje
	 * moze da se dohvati, ali ne i postavi; 2) model (polje tipa String) koje moze
	 * da se dohvati ali ne i postavi; 3) serijski broj (neka u ovom zadatku bude
	 * polje tipa int) koje moze da se dohvati ali ne i postavi; Automobil moze da
	 * ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
	 * Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se
	 * kreirati najmanje dva automobila. Iskoristiti (proizvoljan broj puta) sve
	 * tipove metoda napisanih u klasi Automobil.
	 */

	public static void main(String[] args) {

		Automobil auto1 = new Automobil("Audi", "A8", 104152);

		Automobil auto2 = new Automobil("Audi", "A3", 105652);

		auto1.setVlasnik("Marina");
		auto2.setVlasnik("Ana");

		System.out.println("Vlasnik auto1 je " + auto1.getVlasnik());

		System.out.println("Vlasnik auto2 je " + auto2.getVlasnik());

		auto1.setVlasnik("Marija");

		System.out.println("Auto1 je promenio vlasnika. Novi vlasnik je " + auto1.getVlasnik());

		auto2.setVlasnik("Predrag");

		System.out.println("Auto1 je promenio vlasnika. Novi vlasnik je " + auto2.getVlasnik());

		
		System.out.println("Auto1 je " + auto1.getMarka() + " , model " + auto1.getModel() + " sa serijskim brojem " + auto1.getSerijskiBroj());
		
		System.out.println("Auto2 je " + auto2.getMarka() + " , model " + auto2.getModel() + " sa serijskim brojem " + auto2.getSerijskiBroj());

	}

}

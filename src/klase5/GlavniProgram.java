package klase5;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {

		Putnici k1 = new Putnici("Milos", "Milic", 123456);
		Putnici k2 = new Putnici("Miki", "Milosavljevic", 963852);
		Putnici k3 = new Putnici("Biki", "Peric", 123954);
		List<Putnici> listaPutnika = new ArrayList<Putnici>();
		listaPutnika.add(k1);
		listaPutnika.add(k2);
		listaPutnika.add(k3);

		Putovanje p1 = new Putovanje("Kotor", 250, listaPutnika);
		Putovanje p2 = new Putovanje("Egipat", 700, listaPutnika);
		Putovanje p3 = new Putovanje("Turska", 400, listaPutnika);

		List<Putovanje> ponuda = new ArrayList<Putovanje>();
		ponuda.add(p1);
		ponuda.add(p2);
		ponuda.add(p3);

		p1.setCenaAranzmana(600);
		ponuda.remove(2);

		listaPutnika.remove(k1);

		System.out.println("Cena aranzmana za " + p2.getDestinacija() + " je " + p2.getCenaAranzmana());
		System.out.println("Trenutno imamo u ponudi " + ponuda.size() + " putovanja");
		System.out.println("Putovanja: ");

		for (int i = 0; i < ponuda.size(); i++) {
			System.out.println(
					"Destinacija : " + ponuda.get(i).getDestinacija() + " cena: " + ponuda.get(i).getCenaAranzmana());

		}
	}

}

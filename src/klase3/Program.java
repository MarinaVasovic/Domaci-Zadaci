package klase3;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Dvorana d1 = new Dvorana("HalaPionir", "Beograd");
		Dvorana d2 = new Dvorana("Arena", "Beograd", 5000);
		List<String> tipDogadjaja = new ArrayList<>();
		tipDogadjaja.add("Koncert");
		tipDogadjaja.add("Utakmica");
		tipDogadjaja.add("Vencanje");
		StringBuilder sb = new StringBuilder();
		sb.append("25/");
		sb.append("08/");
		sb.append("2021");

		String vreme = sb.toString();

		Event e1 = new Event(vreme, d1, tipDogadjaja.get(1));

		String vreme1 = sb.replace(0, 5, "12/05").toString();

		Event e2 = new Event(vreme1, d2, tipDogadjaja.get(0));

		d1.setBrojMesta(200);
		System.out.println("Dvorana  " + d1.getImeDvorane() + " ima " + d1.getBrojMesta() + " mesta");
		e2.setTipDogadjaja(tipDogadjaja.get(2));
		System.out.println("Dana: " + e2.getVreme() + " u dvorani " + e2.getDvorana().getImeDvorane() + " odrzava se "
				+ e2.getTipDogadjaja());

	}

}

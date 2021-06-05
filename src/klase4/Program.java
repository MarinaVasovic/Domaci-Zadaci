package klase4;

public class Program {

	public static void main(String[] args) {
		Zaposleni k1 = new Zaposleni("Pera", "Peric");
		Zaposleni k2 = new Zaposleni("Stana", "Stanic");
		Zaposleni k3 = new Zaposleni("Mika", "Mikic");
		k1.setPozicija("Direktor");
		k1.setPrimanja(100);

		Zaposleni[] niz = { k1, k2, k3 };

		Firma f1 = new Firma("Pik", "GornjiMilanovac", 1542245, niz);

		Zaposleni[] m = f1.getZaposleni();

		System.out.println(
				"Naziv firme je: " + f1.getNaziv() + " , sediste: " + f1.getSediste() + " PIB: " + f1.getPib());

		ispisPrezimenaZaposlenih(m);

		System.out.println(k1.getIme().toUpperCase() + "_" + k1.getPrezime().toUpperCase() + ": "
				+ k1.getPozicija().toUpperCase() + "(" + k1.getPrimanja() + ")");

	}

	public static void ispisPrezimenaZaposlenih(Zaposleni[] nizZaposlenih) {
		System.out.println("Prezimena zaposlenih su: ");
		for (int i = 0; i < nizZaposlenih.length; i++) {
			System.out.println(nizZaposlenih[i].getPrezime());

		}
	}

}

package klase2;

public class Sport {

	public static void main(String[] args) {

		Sportista sportista1 = new Sportista("Stiven", "Peterson", "Fudbal", "Juventus", 10);

		Sportista sportista2 = new Sportista("Nicholas", "Johnson", "Fudbal", "Barcelona", 14);

		Sportista sportista3 = new Sportista("Peter", "Richardson", "Fudbal", "Liverpul", 8);

		System.out.println(sportista1.getIme() + " " + sportista1.getPrezime() + " igra " + sportista1.getSport()
				+ " za " + sportista1.getKlub() + " i nosi broj " + sportista1.getBrojNaDresu());

		System.out.println(sportista2.getIme() + " " + sportista2.getPrezime() + " igra " + sportista2.getSport()
				+ " za " + sportista2.getKlub() + " i nosi broj " + sportista2.getBrojNaDresu());

		System.out.println(sportista3.getIme() + " " + sportista3.getPrezime() + " igra " + sportista3.getSport()
				+ " za " + sportista3.getKlub() + " i nosi broj " + sportista3.getBrojNaDresu());

		sportista1.setKlub("Inter");
		sportista1.setBrojNaDresu(88);

		System.out.println(sportista1.getIme() + " " + sportista1.getPrezime() + " je presao da igra za "
				+ sportista1.getKlub() + " i sada nosi broj " + sportista1.getBrojNaDresu());

	}

}

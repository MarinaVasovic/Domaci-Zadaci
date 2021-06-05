package forPetlja;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji omoguciti korisniku da unosi recii, sve dok ne unese
		 * rec “stop”, nebitno da li je koristio mala, velika slova ili kombinaciju.
		 * Mozete pri radu koristiti petlju po izboru.
		 */

		{
			String rec = "stop";
			Scanner sc = new Scanner(System.in);
			String unos;
			String unosObradjen;
			do {
				System.out.println("Unesi rec");
				unos = sc.nextLine();
				unosObradjen = unos.toLowerCase();
			} while (!rec.equals(unosObradjen));

			System.out.println("Pogodio si rec.");

		}
	}
}

package klase3;

import java.util.Date;
import java.util.List;

public class Event {
	/*
	 * * Napraviti klasu Event koja sadrzi podatke o vremenu, dvorani u kojoj se
	 * dogadjaj organizuje i tip (koncert, utakmica, vencanje…) Napraviti klasu
	 * Dvorana koja sadrzi podatke o nazivu dvorane, gradu gde se nalazi i
	 * kapacitetu (broju mesta). Uvezati ove klase i u glavnom programu se igrati sa
	 * njima
	 */

	private String vreme;
	private Dvorana dvorana;
	private String tipDogadjaja;

	public Event(String vreme, Dvorana dvorana, String tipDogadjaja) {
		this.vreme = vreme;
		this.dvorana = dvorana;
		this.tipDogadjaja = tipDogadjaja;

	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}

	public Dvorana getDvorana() {
		return dvorana;
	}

	public void setDvorana(Dvorana dvorana) {
		this.dvorana = dvorana;
	}

	public String getTipDogadjaja() {
		return tipDogadjaja;
	}

	public void setTipDogadjaja(String tipDogadjaja) {
		this.tipDogadjaja = tipDogadjaja;
	}

}

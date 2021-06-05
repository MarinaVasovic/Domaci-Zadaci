package klase1;

public class Automobil {

	private String marka;
	private String model;
	private int serijskiBroj;
	private String vlasnik;

	public Automobil(String marka, String model, int serijskiBroj) {
		this.marka = marka;
		this.model = model;
		this.serijskiBroj = serijskiBroj;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getSerijskiBroj() {
		return serijskiBroj;
	}

}

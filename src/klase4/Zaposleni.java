package klase4;

public class Zaposleni {

	private String ime;
	private String prezime;
	private String pozicija;
	private int primanja;

	public Zaposleni(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public int getPrimanja() {
		return primanja;
	}

	public void setPrimanja(int primanja) {
		this.primanja = primanja;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

}

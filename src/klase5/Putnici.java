package klase5;

public class Putnici {

	private String ime;
	private String prezime;
	private int brojPasosa;

	public Putnici(String ime, String prezime, int brojPasosa) {

		this.ime = ime;
		this.prezime = prezime;
		this.brojPasosa = brojPasosa;
	}

	public int getBrojPasosa() {
		return brojPasosa;
	}

	public void setBrojPasosa(int brojPasosa) {
		this.brojPasosa = brojPasosa;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

}

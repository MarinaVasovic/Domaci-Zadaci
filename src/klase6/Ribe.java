package klase6;

public class Ribe extends Kicmenjaci {
	String vrstaVode;
	String vrstaPeraja;

	public Ribe(String vrsta, String rod, String porodica, String omiljenaHrana, String naziv, String vrstaVode,
			String vrstaPeraja) {
		super(vrsta, rod, porodica, omiljenaHrana, naziv);
		this.vrstaVode = vrstaVode;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getVrstaVode() {
		return vrstaVode;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	@Override
	public String toString() {
		return "Ribe [vrsta=" + vrsta + ", rod=" + rod + ", porodica=" + porodica + ", omiljenaHrana=" + omiljenaHrana
				+ ", naziv=" + naziv + ", vrstaVode=" + vrstaVode + ", vrstaPeraja=" + vrstaPeraja + "]";
	}

}

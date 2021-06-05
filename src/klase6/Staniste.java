package klase6;

import java.util.List;

public class Staniste {

	private List<Zivotinja> zivotinje;

	public Staniste(String naziv) {
		this.naziv = naziv;
	}

	private String naziv;

	public List<Zivotinja> getZivotinje() {
		return zivotinje;
	}

	public void setZivotinje(List<Zivotinja> zivotinje) {
		this.zivotinje = zivotinje;
	}

	public String getNaziv() {
		return naziv;
	}

	@Override
	public String toString() {
		return "Staniste [naziv=" + naziv + "]";
	}

}

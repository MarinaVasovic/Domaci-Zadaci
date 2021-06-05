package klase6;

public class Sisari extends Kicmenjaci {

	private String bojaDlake;
	private int brojNogu;

	public Sisari(String vrsta, String rod, String porodica, String omiljenaHrana, String naziv, int brojNogu,
			String bojaDlake) {
		super(vrsta, rod, porodica, omiljenaHrana, naziv);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public int getBojaNogu() {
		return brojNogu;
	}

	public void setBojaNogu(int brojNogu) {
		this.brojNogu = brojNogu;
	}

	@Override
	public String toString() {
		return "Sisari [vrsta=" + vrsta + ", rod=" + rod + ", porodica=" + porodica + ", omiljenaHrana=" + omiljenaHrana
				+ ", naziv=" + naziv + ", bojaDlake=" + bojaDlake + ", brojNogu=" + brojNogu + "]";
	}

}

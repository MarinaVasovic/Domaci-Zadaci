package klase6;

/*
 * 
 * Zivotinje

U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu (rod, porodica, poklasa.. Moze biti kicmenjak/beskicmenjak, moze biti i neko blize odredjivanje…), konkretan naziv i omiljenu hranu.

Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.
Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
Ispisati bar jedno staniste.
Jednom sisaru zameniti boju dlake.
 * 
 */

public class Zivotinja {

	String vrsta;
	String rod;
	String porodica;
	String omiljenaHrana;
	String naziv;

	public Zivotinja(String vrsta, String rod, String porodica, String omiljenaHrana, String naziv) {
		this.vrsta = vrsta;
		this.rod = rod;
		this.porodica = porodica;
		this.omiljenaHrana = omiljenaHrana;
		this.naziv = naziv;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public String getRod() {
		return rod;
	}

	public void setRod(String rod) {
		this.rod = rod;
	}

	public String getPorodica() {
		return porodica;
	}

	public void setPorodica(String porodica) {
		this.porodica = porodica;
	}

	public String getOmiljenaHrana() {
		return omiljenaHrana;
	}

	public void setOmiljenaHrana(String omiljenaHrana) {
		this.omiljenaHrana = omiljenaHrana;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "Zivotinja [vrsta=" + vrsta + ", rod=" + rod + ", porodica=" + porodica + ", omiljenaHrana="
				+ omiljenaHrana + ", naziv=" + naziv + "]";
	}

}

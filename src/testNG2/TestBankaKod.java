package testNG2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBankaKod {

	@Test
	public void testKontruktor() {
		BankaKod bk = new BankaKod("Marina", "12345-6789");

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(bk.dohvatiIme(), "Marina");
		sa.assertEquals(bk.dohvatiZiroRacun(), "12345-6789");
		sa.assertEquals(bk.dohvatiIznos(), 0d);

		sa.assertAll();
	}

	@Test
	public void testGet() {
		String ime = "Milos";
		String ziroRacun = "123";
		Double iznos = 0d;
		Double iznos1 = 123456.78;

		BankaKod bk = new BankaKod(ime, ziroRacun);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(bk.dohvatiIme(), ime);
		sa.assertEquals(bk.dohvatiZiroRacun(), ziroRacun);
		sa.assertEquals(bk.dohvatiIznos(), iznos);

		sa.assertAll();

	}

}

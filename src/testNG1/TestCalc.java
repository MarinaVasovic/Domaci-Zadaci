package testNG1;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc {

	@Test
	public void testIzracunajPravougaonik() {
		double a = 2;
		double b = 3;
		double rez = Calc.pPravougaonika(a, b);

		Assert.assertEquals(rez, 6.0);
	}

	@Test
	public void testIzracunajPovrsinuKruga() {

		double r = 3;
		Calc.pKruga(r);
		Assert.assertEquals(Calc.pKruga(r), 28, 26);

	}

	@Test
	public void testIzracunajPovrsinuKvadrata() {

		Assert.assertEquals(Calc.pKvadrata(3), 9);
	}

}

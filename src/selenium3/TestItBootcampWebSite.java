package selenium3;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestItBootcampWebSite {
	/*
	 * Pomocu jave i seleniuma Otvoriti novi prozor u pretrazivacu i otici na
	 * stranicu IT Bootcamp-a Primeniti metode- get URL i Title, navigate - refresh,
	 * to, back, forward U kodu treba da se prozor maksimizuje, a pre zatvaranja
	 * drajvera vrati na prvobitnu velicinu (hint: koristite smernice okruzenja, ako
	 * to ne pomaze, guglajte =) ) Dokazati da prilikom koriscenja reci “testiranje”
	 * u search-u (i trazanja jelte) dobijamo rezultat shodno trazenom tako sto cete
	 * napraviti screenshot stranice. nakon pretrage - istraziti na netu kako.
	 * Pomocu testNG-ja proveriti da li bilo koje dugme (proizvoljno) radi i odvodi
	 * vas na zeljenu stranicu.
	 */

	public static final String URL = "https://itbootcamp.rs/";
	public static final String TITLE = "ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp in cooperation with the Divac Foundation";
	public static final String CONTACT_XPATH = "//*[@id=\"menu-item-4141\"]/a";
	public static final String URL_CONTACT = "https://itbootcamp.rs/kontakt/";
	private static WebDriver driver = null;
	private static Dimension dimenzija;
    private static final String SEARCH_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/div[2]/a";
    private static final String PISI_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input";
    
    
    
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marina\\mmaajj\\Novi\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@Test
	public static void proveraraPristupaSajtu() {
		driver.get(URL);
		driver.manage().window().maximize();

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), URL);
		sa.assertEquals(driver.getTitle(), TITLE);
        
	}

	@Test
	public static void odlazakNaZadatuStranicu() {
		SoftAssert sa = new SoftAssert();

		driver.get(URL);
		
	    dimenzija = driver.manage().window().getSize();
		driver.manage().window().maximize();
        
		
		driver.findElement(By.xpath(CONTACT_XPATH)).click();
		sa.assertEquals(driver.getCurrentUrl(), URL_CONTACT);

		driver.navigate().refresh();
		sa.assertEquals(driver.getCurrentUrl(), URL_CONTACT);

		driver.navigate().back();

		sa.assertEquals(driver.getCurrentUrl(), URL);

		driver.navigate().forward();

		sa.assertEquals(driver.getCurrentUrl(), URL_CONTACT);

		sa.assertAll();

	}
	
	@Test
	public static void searchTest() {
		
         driver.get(URL);
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath(SEARCH_XPATH)).click();
		//WebElement search = driver.findElement(By.xpath(PISI_XPATH));
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//driver.findElement(By.linkText("Search")).click();
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PISI_XPATH)));
		
		search.sendKeys("testiranje");
		search.sendKeys(Keys.ENTER);
		
		TakesScreenshot scrShot =(TakesScreenshot)driver;
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\Marina\\test2\\DomaciSelenijum\\screenshots\\screenshot.jpg");
		try {
			FileHandler.copy(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterClass
	public static void afterTests() {
		driver.manage().window().setSize(dimenzija);
		driver.quit();
		
		
	}

}

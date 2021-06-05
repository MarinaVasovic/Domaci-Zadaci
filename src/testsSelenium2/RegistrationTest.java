package testsSelenium2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectsSelenium2.Home;
import objectsSelenium2.Registration;

public class RegistrationTest {
	
	private static WebDriver driver; 
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver2\\chromedriver.exe");
		driver = new ChromeDriver(); 
	}
	
	@Test
	public void testRegBtn() {
		driver.navigate().to(resourcesSelenium2.Constants.URL);
		Home.clickRegBtn(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = resourcesSelenium2.Constants.REGISTRATION_URL;
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
	@Test
	public void testFormReg() {
		
		driver.navigate().to(resourcesSelenium2.Constants.REGISTRATION_URL);
		Registration.inputUsername(driver, "tijana");
		Registration.inputPassword(driver, "123");
		Registration.inputConfirmPassword(driver, "123");
		Registration.submit(driver);
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";
		
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
}

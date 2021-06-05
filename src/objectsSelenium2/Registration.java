package objectsSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	
	
	public static void inputUsername(WebDriver driver, String username) {
		driver.findElement(By.xpath(resourcesSelenium2.Constants.TXTUSERNAME_XPATH)).sendKeys(username);
	}
	
	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public static void inputConfirmPassword(WebDriver driver, String password) {
		driver.findElement(By.name("confirmPassword")).sendKeys(password);
	}
	
	public static void submit(WebDriver driver) {
		driver.findElement(By.name("submit")).click();
	}
	
public static void exsel (WebDriver driver, String password) {
	driver.findElement(By.id("search")).sendKeys(password);
	}
	
	
	
	
}

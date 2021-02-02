package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase1 extends BaseTest{
	
	
	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("ahghghgh");
	driver.findElement(By.id("pass")).sendKeys("gjgyufgjhggy");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	Reporter.log(title,true);
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
	}
	
	

}

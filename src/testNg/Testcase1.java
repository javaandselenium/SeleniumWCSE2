package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Testcase1 extends BaseTest{
	
	
	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("ahghghgh");
	driver.findElement(By.id("pass")).sendKeys("gjgyufgjhggy");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	//Assert.assertEquals(title,"qwerty12345");
	SoftAssert s=new SoftAssert();
	s.assertEquals(title,"yghjjhgghg");
	Reporter.log(title,true);
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
	s.assertAll();
	}
	
	

}

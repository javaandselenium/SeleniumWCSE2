package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//WebElement ele = driver.findElement(By.id("email"));
		Test1 t=new Test1(driver);
		driver.navigate().refresh();
		t.email("fghfhfghfhfhfhgh");
		//ele.sendKeys("jhjhghgj");
	}
		
}

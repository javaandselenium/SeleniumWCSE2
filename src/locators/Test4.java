package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("jhgjhhah");
driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("mfhghafghfgf");
driver.findElement(By.cssSelector("button[name='login']")).click();	
	

	}

}

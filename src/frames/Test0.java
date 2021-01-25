package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		// driver.switchTo().frame(0);
		WebElement s = driver.findElement(By.xpath("//p[text()='To Login into your Paytm Web account']"));
		driver.switchTo().frame(s);
		driver.findElement(By.xpath("//span[contains(text(),'Google Play')]")).click();
		

	}

}

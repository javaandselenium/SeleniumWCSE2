package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("laxmi_866");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("ml561419");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		Thread.sleep(2000);
		String t = driver.getTitle();
		System.out.println(t);
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}

package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Set<String> child = driver.getWindowHandles();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.xpath("//a[text()='Apple iPhone XR (Black, 64 GB) (Includes EarPods, Power...']")).click();

for(String l:child) {
	Thread.sleep(5000);
driver.switchTo().window(l);

}
driver.findElement(By.xpath("//button[text()='GO TO CART']")).click();






	}

}

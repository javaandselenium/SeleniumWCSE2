package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement ele = driver.findElement(By.id("username"));
          ele.clear();
          Thread.sleep(5000);
          ele.sendKeys("javaselenium");
          Thread.sleep(5000);
          driver.close();
	}

}

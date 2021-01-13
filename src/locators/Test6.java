package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,4);
		Thread.sleep(3000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("admin");
		//driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("pass:home page is displayed");
		}
		else
		{
			System.out.println("fail:home page is not dispalyed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}

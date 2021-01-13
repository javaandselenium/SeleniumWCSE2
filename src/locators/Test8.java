package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='loginButton']")).click();
		driver.findElement(By.name("session[username_or_email]")).sendKeys("ghgjhgjjhjg");
driver.findElement(By.name("session[password]")).sendKeys("hghgfhsfghsgh");
	driver.findElement(By.xpath("//div[@data-testid='LoginForm_Login_Button']")).click();
	}

}

package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//maximize the browser   method chaining
	driver.manage().window().maximize();
	
	driver.get("https://www.myntra.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(5000);
	driver.close();
	
	

	}

}

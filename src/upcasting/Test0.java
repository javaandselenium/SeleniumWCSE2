package upcasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test0 {
public static void generic(WebDriver driver) {
	driver.get("https://skillrary.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
}
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
            Test0.generic(driver);
	
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver1=new FirefoxDriver();
	Test0.generic(driver1);
	
	

}
}
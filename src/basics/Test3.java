package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.yatra.com/");
	//back
	driver.navigate().back();
	Thread.sleep(3000);
	//forward
	driver.navigate().forward();
	Thread.sleep(3000);
	//refresh
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();
	

	}

}

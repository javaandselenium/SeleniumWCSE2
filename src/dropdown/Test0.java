package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    WebElement ele = driver.findElement(By.id("gh-cat"));

	    Select s=new Select(ele);
	    
	    System.out.println(s.isMultiple());
	    
	    s.selectByIndex(4);
	    Thread.sleep(3000);
	    s.selectByValue("237");
	    Thread.sleep(3000);
	    s.selectByVisibleText("Cell Phones & Accessories");
	    Thread.sleep(3000);
	    s.deselectByIndex(4);
	    driver.close();
	}

}

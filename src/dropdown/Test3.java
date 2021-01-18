package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/QSP/Desktop/dd.html");
WebElement ele = driver.findElement(By.id("Mayas"));
	Select s=new Select(ele);
	s.selectByIndex(1);
	s.selectByValue("v");
	s.selectByVisibleText("chicken 65");
	
	System.out.println(s.isMultiple());
	
	if(s.isMultiple()) {
		s.deselectAll();
	}
	
	driver.close();

	}

}

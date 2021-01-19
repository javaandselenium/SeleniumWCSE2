package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@role='button']")).click();
	    WebElement ele = driver.findElement(By.id("month"));
	Select s=new Select(ele);
	System.out.println(s.isMultiple());
	s.selectByIndex(4);
	Thread.sleep(2000);
	s.selectByValue("8");
	Thread.sleep(2000);
	s.selectByVisibleText("Mar");
	Thread.sleep(2000);
	List<WebElement> op = s.getOptions();
	System.out.println(op.size());
	for(WebElement options:op)
	{
		System.out.println(options.getText());
	}
	}

}

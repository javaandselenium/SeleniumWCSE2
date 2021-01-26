package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		System.out.println(child.size());
		
		String exptitle="HSBC";
		
		for(String b:child)
		{
			driver.switchTo().window(b);
		    String atitle=driver.getTitle();
		     
		     if(atitle.equals(exptitle))
		     {
		    	 driver.close();
		     }
		}
		

	}

}

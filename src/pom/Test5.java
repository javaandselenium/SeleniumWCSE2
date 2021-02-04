package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test5 extends BaseTest{

	@Test
	public void login() {
		Test4 t=new Test4(driver);
		t.usernametextbox("admin");
		t.passwordteextbox("manager");
		t.loginbutton();
		

	}

}

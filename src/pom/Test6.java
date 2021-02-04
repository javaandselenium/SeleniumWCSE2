package pom;

import org.testng.annotations.Test;

public class Test6 extends BaseTest{
	@Test
	public void login() {
		Test4 t=new Test4(driver);
		t.loginbutton();
	}
	

}

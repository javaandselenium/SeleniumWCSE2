package testNg;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	@BeforeSuite
	public void bs() {
		Reporter.log("Beforesuite",true);
	}
	@AfterSuite
	public void as() {
		Reporter.log("Aftersuite",true);
	}
	@BeforeMethod
	public void bm() {
		Reporter.log("Beforemethod",true);
	}
	
	@AfterMethod
	public void am() {
		Reporter.log("Aftermethod",true);
	}
	
	@BeforeTest
	public void bt() {
		Reporter.log("BeforeTest",true);
	}
	
	@AfterTest
	public void at() {
		Reporter.log("Aftertest",true);
	}
	
	@BeforeClass
	public void bc() {
		Reporter.log("Beforeclass",true);
	}
	@AfterClass
	public void ac() {
		Reporter.log("Afterclass",true);
	}
	
	@Test
	public void test() {
		Reporter.log("Test",true);
	}

}

package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	@BeforeSuite
	public void createBankAccount() {
		Reporter.log("createaccount BS",true);
	}
	
	@BeforeClass
	public void createChequebook() {
		Reporter.log("createChequebook BC",true);
	}


	@AfterClass
	public void deleteChequebook() {
		Reporter.log("deleteChequebook  AC",true);
	}

	@BeforeTest
	public void createUser() {
		Reporter.log("creteuser  BT",true);
	}
	@BeforeMethod
	public void createamt() {
		Reporter.log("createamt   BM",true);
	}
	@Test
	public void employee() {
		Reporter.log("employee   TEST",true);
	}
	@Test
	public void employee1() {
		Reporter.log("employee1   TEST",true);
	}
	@AfterMethod
	public void deleteamt() {
		Reporter.log("deleteamt  AM",true);
	}
	
	@AfterTest
	public void dleteUser() {
		Reporter.log("deleteuser  AT",true);
	}
	
	@AfterSuite
	public void closeBankAccount() {
		Reporter.log("closeaccount AS",true);
	}

}

package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(priority = 1,enabled=false)
	public void block() {
		Reporter.log("block",true);
	}
	
	@Test(priority = -1,invocationCount = 3)
	public void chats() {
		Reporter.log("chats",true);
	}
	
	@Test(priority = 1)
	public void calls() {
		Reporter.log("calls",true);
	}

}

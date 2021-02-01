package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void demo() {
	Reporter.log("Hello selenium",true);
	Reporter.log("Hello java",false);
	}

}

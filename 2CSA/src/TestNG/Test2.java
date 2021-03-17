package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Test2 {
	
	@Test
	
	public void apple() {
		
		Reporter.log("from apple method");
		//System.out.println("from apple method");
	}
	
	@Test
	public void banana() {
		
		Reporter.log("from banana method");
		//System.out.println("from banana method");
		
	}
	
	@Test
	public void carrot() {
		
		Reporter.log("from carrot method");
		//System.out.println("from carrot method");
		
	}
}

package TestNG;

import org.testng.annotations.Test;

public class Test9 {
	
	@Test(invocationCount=3)
	public void pen() {
		System.out.println("from pen");
	}
	
	@Test(invocationCount=4)
	public void mouse() {
	
}

package TestNG;

import org.testng.annotations.Test; 

public class Test7 {
	
	@Test 
	public void Pen() {
		System.out.println("from pen");
	}
		
		@Test(priority=2)
	public void mouse() {
		System.out.println("from mouse");
		}
		
		@Test(priority=25)
		public void duster() {
			System.out.println("from duster");
	}

}

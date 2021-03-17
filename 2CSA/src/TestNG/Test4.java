package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	 
		 //if false  not print console and print inside reporter(green color call report )
				
				@Test
				
				public void apple() {
					
					Reporter.log("from apple method",false);//if false then it will show on report not in console.
					//System.out.println("from apple method");
				}
				
				@Test
				public void banana() {
					
					Reporter.log("from banana method",false);
					//System.out.println("from banana method");
					
				}
				
				@Test
				public void carrot() {
					
					Reporter.log("from carrot method",false);
					//System.out.println("from carrot method");
					

		}

	 }


package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test3 {
 //both side print console and inside reporter(green color call report )
		
		@Test
		
		public void apple() {
			
			Reporter.log("from apple method",true);//if false then it will show on report not in console.
			//System.out.println("from apple method");
		}
		
		@Test
		public void banana() {
			
			Reporter.log("from banana method",true);
			//System.out.println("from banana method");
			
		}
		
		@Test
		public void carrot() {
			
			Reporter.log("from carrot method",true);
			//System.out.println("from carrot method");
			

}
		}

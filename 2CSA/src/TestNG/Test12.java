package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test12 {
	
	@AfterTest
	public void p2() {
		System.out.println("from after Test");
	}

	@Test
	public void t1() {
		System.out.println("from test t1");
		}
	

	@Test
	public void t2() {
		System.out.println("from test t2");
		}

	@BeforeMethod
	public void t3() {
		System.out.println("from Before method");
	}
	
	@AfterMethod 
	public void t4() {
		System.out.println("from After method");
	}
	
	@BeforeClass
	public void t5() {
		System.out.println("from before class of P9");
	}
	
	@AfterClass
	public void t6() {
		System.out.println("from after class of P9");
	}
}

package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Test15 {//soft assert
		
	static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			   }
		
		@Test
			public void testApp() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.google.com");
			String expectedTitle = "abcdefgh";
			String actualTitle = driver.getTitle();
			
			SoftAssert s1 = new SoftAssert();
			s1.assertEquals(actualTitle, expectedTitle);
			
			driver.close();
			System.out.println("The End");
			s1.assertAll();// this stmnt not given test case fail
			
		}
	}

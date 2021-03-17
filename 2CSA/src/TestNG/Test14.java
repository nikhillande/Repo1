package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test14 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		   }
	
	@Test
		public void testApp() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
		System.out.println("The End");
		
		
	}
}

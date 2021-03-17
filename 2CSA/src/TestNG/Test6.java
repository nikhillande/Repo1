package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test6 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		   }
	
	WebDriver driver;//testNG is used for alphabetical order then Priority is used without alphabhet order execute to run the program
	
	@Test(priority=1)
	public void openApp() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test(priority=2)
	public void testApp() {
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		Reporter.log(title,true);
		
	}
		
	@Test(priority=3)
	public void closeApp()//1 alphabetical order 
	{
		driver.close();
	}
}

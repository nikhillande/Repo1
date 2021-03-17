package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlogin//driver class of loginpage
{
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demo.actitime.com//login.do");
		LoginPage l = new LoginPage(driver);
		 l.setUsername("Dinga");
		 Thread.sleep(5000);
	     l.setPassword("Dingi");
		 l.clicklogin();
		 Thread.sleep(3000);
		 l.setUsername("admin");//StaleElementReferenceException
		 
		 Thread.sleep(3000);
		 l.setPassword("manager");
		 Thread.sleep(3000);
		 l.clicklogin();
		 driver.close();

	}

}

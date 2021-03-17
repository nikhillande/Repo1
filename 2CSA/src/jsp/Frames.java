package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nikhil%20Lande/Desktop/selenium/Page2.html");
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).sendKeys("ABCD");
		Thread.sleep(3000);
		driver.switchTo().frame("f1");
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("WXYZ");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("1234");
		

	}

}

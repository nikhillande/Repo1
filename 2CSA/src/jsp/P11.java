package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("hhtp://www.facebook.com");
		driver.findElement(By.id("email") ) .sendKeys("8660628115");
		driver.findElement(By.id("pass") ) .sendKeys("Nikki@321");
		driver.findElement(By.xpath("//buton[text()='Log In']") ) .click();
		
		
		
		
		
	}

}

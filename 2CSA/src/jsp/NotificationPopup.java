package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new  ChromeOptions(); 
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("8660281165");
		driver.findElement(By.id("pass")).sendKeys("nikki@321");
		driver.findElement(By.xpath("//button[.='Log In']")).click();;

	}

}

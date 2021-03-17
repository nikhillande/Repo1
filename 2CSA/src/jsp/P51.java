package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P51 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		//driver.findElement(By.name("q")).sendKeys("java");//line-1
		//WebElement googleTB = driver.findElement(By.name("q"));//line-2
		//googleTB.sendKeys("java");
		//3-line
		WebElement googleTB;//dclaration
		googleTB = driver.findElement(By.name("q"));
		googleTB.sendKeys("java");
	}

}

package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P40 {static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("//a[a.='Create New Account")).click();
		Thread.sleep(2000); 
		
		WebElement dayLB = driver.findElement(By.id("day"));
		Select s1= new Select(dayLB);
		s1.selectByVisibleText("8");
		
		WebElement monthLB = driver.findElement(By.id("month"));
		Select s2 = new Select(monthLB);
		s2.selectByVisibleText("Dec");
		Thread.sleep(2000);
		
		WebElement yearLB = driver.findElement(By.id("year"));
		Select s3 = new Select (yearLB);
		Thread.sleep(5000);
		driver.close();
	}
}

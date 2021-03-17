package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P555 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");//By.id
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");//By.name
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();// by xpath //div[.=login]
		Thread.sleep(3000);//By.id()
driver.close();
	}

}

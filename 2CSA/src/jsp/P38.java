package jsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P38 {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.actitime.com/login.do");
	String firstTab = driver.getWindowHandle();
	Thread.sleep(2000);
	Set<String> allTabs = driver.getWindowHandles();
	for(String wh: allTabs) {
		if(firstTab.equals(wh)) {
			continue;
		}
		else {
			driver.switchTo().window(wh).close();
		}
	Thread.sleep(2000);
	}
}
}
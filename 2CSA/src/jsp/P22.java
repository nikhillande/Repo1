package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P22 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.naukri.com");
driver.close();
	}

}

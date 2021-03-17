package jsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
   
public class Screenshot {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		TakesScreenshot ts =(TakesScreenshot) driver;// convert  webdriver to takescreenshot interface
		File src = ts.getScreenshotAs(OutputType.FILE);//take screenshot in RAM
		File des = new File("./photo/googleSS.png");//copy and pasting from ram to permanent file
		FileUtils.copyFile(src, des);
		Thread.sleep(3000);
		driver.close();

	}

}

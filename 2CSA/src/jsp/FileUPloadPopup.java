package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.util.jar.pack.Package.File;

public class FileUPloadPopup {
	static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/User/admin/Desktop/2CSA/L.html");
		java.io.File f1 = new File("./cv/ABCD.docx");
		String s = f1.getAbsolutePath();
		System.out.println(s);
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys(s);
		Thread.sleep(3000);
		driver.close();

	}

}

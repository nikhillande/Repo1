package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {//Senior Automation 
	
	private WebElement untb;//declaration
	private WebElement pwtd;
	private WebElement loginButton;
	
	 LoginPage(WebDriver driver)
	{//constructor initialization 
		untb = driver.findElement(By.id("username"));//initiallization
	    pwtd = driver.findElement(By.name("pwd"));
		loginButton = driver.findElement(By.xpath("//div[.='login ']"));
	}
public void setUsername(String usn)
{
	untb.sendKeys("admin");//utilization
}

public void setPassword(String pwd)
{
	pwtd.sendKeys("manager");
}
public void clicklogin()
{
	
		loginButton.click();
		
}
}

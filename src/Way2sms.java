import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Way2sms {
WebDriver driver;
public Way2sms(WebDriver driver) {
	this.driver=driver;
	
}
public void logintoway2sms(String username,String password)
{
  
	
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("loginBTN")).click();
}
}

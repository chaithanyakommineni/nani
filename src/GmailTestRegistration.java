import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailTestRegistration {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@Test
	public void registartion() throws Exception{
		GmailRegistration r=new GmailRegistration(driver);
		r.Registration("chaitu", "nani", "satishlanka02@gmail.com", "9492055182", "9492055182", "12", "1991", "9492055182", "chaitukommineni25@gmail.com");
		Assert.assertEquals( "registration",driver.getTitle());
	}
	/*@AfterTest
	public void teardown()
	{
		driver.close();
	}*/

}

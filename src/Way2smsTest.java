import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Way2smsTest {
	WebDriver driver;
	@DataProvider(name="way2sms")
	public Object[][] way2smsuser() throws IOException, IOException
	{
		Properties props=new Properties();
		props.load(new FileInputStream(new File("C:\\Users\\chaitu\\selenium Scripts\\New folder\\KEETECHDAILYTASKS\\way2sms.properties")));
		int size=props.size();
		
		
		String[][] str=new String[size/2][2];
		for(int i=0;i<size/2;i++)
		{
			str[i][0]=props.getProperty("username"+i);
			str[i][1]=props.getProperty("password"+i);
		}
		return str;
		
	}
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://site21.way2sms.com/content/index.html?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	/*@Test
	public void Login()
	{
		Way2sms login=new Way2sms(driver);
		login.logintoway2sms("9492055182", "9493807483k");
	}*/
	@Test(dataProvider="way2sms")
	public void Login(String username,String password)
	{
		Way2sms login=new Way2sms(driver);
		login.logintoway2sms(username, password);
		Assert.assertEquals(driver.getTitle(), "Free SMS, Send Free SMS, Send Free SMS to india, Free email alerts, email2SMS, SMS Alerts,Bill Reminders, EMI Reminders, Loan Reminders, TV Shows Reminders, Future SMS, Mobile Bill Reminders");
}
}
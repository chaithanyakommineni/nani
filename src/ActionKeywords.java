import java.util.concurrent.TimeUnit;

import org.eclipse.jdt.internal.compiler.flow.SwitchFlowContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ActionKeywords {
WebDriver driver;
public void openbrowser(String browser)
{
	if(browser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
}
public void openurl(String url)
{
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
public void typeEditBox(String uielement,String locatortype,String value)
{
	WebElement el=getElement(uielement, locatortype);
	el.clear();
	el.sendKeys(value);
	
}


public void clickbutton(String uielement,String locatortype)
{
WebElement el=getElement(uielement, locatortype);
el.click();
}
/*public void typeEditBox(String uielement,String locatortype,String value)
{
	WebElement el=getElement(uielement,locatortype);
	el.clear();
	el.sendKeys(value);
	
}*/

public void Clickbutton(String uielement,String locatortype) {
	WebElement Cl=getElement(uielement, locatortype);
	Cl.click();
	
}
public void  VerifysuccessfulLogin(String uielement,String locatortype) {
	
	WebElement ele=getElement(uielement, locatortype);
	ele.click();
	System.out.println("successfully click on sent item"+ ele.getText());
	
	
	
}
public WebElement getElement(String uielement, String locatortype) {
	System.out.println("Locator value:"+uielement);
	System.out.println("Locator type:"+locatortype);
	switch(locatortype.trim())
	{
	case "id":
		return driver.findElement(By.id(uielement));
	case "name":
		return driver.findElement(By.id(uielement));
	case "linktext":
		return driver.findElement(By.id(uielement));
		case "xpath":
			return driver.findElement(By.id(uielement));
		case "cssselector":
			return driver.findElement(By.linkText(uielement));
	}
	
	return null;
}

}
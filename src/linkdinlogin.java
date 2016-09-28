import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class linkdinlogin {
	WebDriver driver;
	@Given("^open browser as \"([^\"]*)\"  enter url as \"([^\"]*)\"$")
	public void open_browser_as_enter_url_as(String browser, String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(browser.equals("firefox"))
		{
	  driver=new FirefoxDriver();
		}
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^enter username And password$")
	public void enter_username_And_password(DataTable username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data=username.raw();
		WebElement el=driver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
		el.clear();
		el.sendKeys(data.get(0).get(0));
		WebElement e2=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		e2.clear();
		e2.sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		WebElement el1=driver.findElement(By.id("login-email"));
		el1.clear();
		el1.sendKeys(data.get(1).get(0));
		WebElement e21=driver.findElement(By.id("login-password"));
		e21.clear();
		e21.sendKeys(data.get(1).get(1));
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	   
	}

	@Then("^successfully login to linkdin$")
	public void successfully_login_to_linkdin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login successfully");
	    
	}



}

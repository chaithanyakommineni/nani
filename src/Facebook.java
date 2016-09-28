
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook {
	WebDriver driver;
	@Given("^open browser as \"([^\"]*)\" And enter url as \"([^\"]*)\"$")
	public void open_browser_as_And_enter_url_as(String browser, String url) throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^user enter valid username and valid password$")
	public void user_enter_valid_username_and_valid_password(DataTable username) throws Throwable {
	  List<List<String>> data= username.raw();
	 WebElement el= driver.findElement(By.id("email"));
	 el.sendKeys(data.get(0).get(0));
	  WebElement el1=driver.findElement(By.id("pass"));
	  el1.sendKeys(data.get(0).get(1));
	  driver.findElement(By.id("loginbutton")).click();
	  //Assert.assertEquals(driver.getTitle(), "Facebook");
	 WebElement el2= driver.findElement(By.id("email"));
	 el2.clear();
	 el2.sendKeys(data.get(1).get(0));
	  WebElement el3=driver.findElement(By.id("pass"));
	  el3.clear();
	  el3.sendKeys(data.get(1).get(1));
	  driver.findElement(By.id("loginbutton")).click();
	  //Assert.assertEquals(driver.getTitle(), "Facebook");
	   }

	@Then("^successfully login to facebook$")
	public void successfully_login_to_facebook() throws Throwable {
	   System.out.println("Facebook login successfully");
	}


}

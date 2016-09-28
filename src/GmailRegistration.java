import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class GmailRegistration {
	WebDriver driver;
	public GmailRegistration(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Registration(String firstname,String lastname,String gmail,String password,String conformpassword,String day,String year,String number,String recoveryemail) throws Exception
	{
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("GmailAddress")).sendKeys(gmail);
		driver.findElement(By.id("Passwd")).sendKeys(password);
		driver.findElement(By.id("PasswdAgain")).sendKeys(conformpassword);
		
		//driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/form/div[5]/fieldset/label[1]/span/div[1]/div[1]")).click();
		//driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/form/div[5]/fieldset/label[1]/span/div[2]/div[6]/div")).click();
		//driver.findElement(By.xpath("//div[@id=':7']")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/form/div[5]/fieldset/label[2]/input")).sendKeys(day);
		driver.findElement(By.id("BirthYear")).sendKeys(year);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/form/div[6]/label/div/div/div[2]")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/form/div[6]/label/div/div[2]/div[2]/div")).click();
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys(number);
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys(recoveryemail);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/form/div[9]/label/div/div/div[2]")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		
	}

}

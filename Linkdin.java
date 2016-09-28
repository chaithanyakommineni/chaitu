import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Linkdin {
	WebDriver driver;
	public Linkdin(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void linkdinlogin(String email,String pwd)
	{
		driver.findElement(By.id("login-email")).sendKeys(email);
		driver.findElement(By.id("login-password")).sendKeys(pwd);
		driver.findElement(By.xpath(".//*[@id='pagekey-uno-reg-guest-home']/div[1]/div/form/input[6]")).click();
		//driver.findElement(By.xpath(".//*[@id='account-nav']/ul/li[4]/a")).click();
		//driver.findElement(By.xpath(".//*[@id='account-sub-nav']/div/div[2]/ul/li[1]/div/span/span[3]/a")).click();
	}
	public void logout()
	{
		driver.findElement(By.xpath(".//*[@id='account-nav']/ul/li[4]/a")).click();
		driver.findElement(By.xpath(".//*[@id='account-sub-nav']/div/div[2]/ul/li[1]/div/span/span[3]/a")).click();
	}

}

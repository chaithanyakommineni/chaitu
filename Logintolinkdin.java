import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logintolinkdin {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void Login()
	{
		Linkdin l=new Linkdin(driver);
		l.linkdinlogin("komminenichaithanya@gmail.com", "9492055182k");
		
		}
	@Test
	public void logout()
	{
		Linkdin lg=new Linkdin(driver);
		lg.logout();
	}

}

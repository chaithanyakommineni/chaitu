import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.jetty.html.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToApsrtc {
	WebDriver driver;
	@Test(dataProvider="ApsrtcPOM")
	public void setup(String username,String password,String From,String To,String txtJourneyDate,String txtReturnJourneyDate)
	{
		driver=new FirefoxDriver();
		driver.get("http://www.apsrtconline.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("eTicket Login")).click();
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submitBtn")).click();
			WebElement selected=driver.findElement(By.xpath(".//*[@id='fromPlaceName']"));
		//selected.click();
		selected.sendKeys("KHAM");
		driver.findElement(By.linkText("KHAMMAM")).click();
		WebElement selected1=driver.findElement(By.xpath(".//*[@id='toPlaceName']"));
		//selected.click();
		selected1.sendKeys("HYDER");
		driver.findElement(By.linkText("HYDERABAD")).click();
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.linkText("27")).click();
		driver.findElement(By.id("txtReturnJourneyDate")).click();
		driver.findElement(By.linkText("29")).click();
		driver.findElement(By.id("searchBtn")).click();
		//driver.findElement(By.id("BtFid")).click();
		//driver.findElement(By.id("Bustypes201")).click();
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		driver.getPageSource();
		
	}
		/*@Test(dataProvider="ApsrtcPOM")
		public void booking(String From,String To)
		{
		
		WebElement selected=driver.findElement(By.xpath(".//*[@id='fromPlaceName']"));
		//selected.click();
		selected.sendKeys("From");
		driver.findElement(By.linkText("KHAMMAM")).click();
		WebElement selected1=driver.findElement(By.xpath(".//*[@id='toPlaceName']"));
		//selected.click();
		selected1.sendKeys("To");
		driver.findElement(By.linkText("HYDERABAD")).click();
		}*/
			
		
	/*
	@Test(groups={"smoke","sanity"})
	public void Login()
	{
		ApsrtcPOM p=new ApsrtcPOM(driver);
		p.Apsrtc("chaitunani1", "9492055182k", "KHAMMAM", "HYDERABAD");
		p.passengerdetails("mahesh", "9490061573", "umamahesh4277@gmail.com", "45879456123", "shrinivasulu", "29", "8");
	
		
	
	}*/
	
	

	/*Dummy code in apsrtc Datadrivenlogic*/
	/*@Test(dataProvider="ApsrtcPOM")
	public void ApsRtcLogin()
	{
		ApsrtcPOM Login=new ApsrtcPOM(driver);
		//Login.Apsrtc("chaitunani1", "9492055182k","KHAMMAM","HYDERABAD");
		//Login.Apsrtc("chaitunani1", "9492055182k", "KHAMMAM", "HYDERABAD");
		//Login.dropdown1();
		//Login.dropdown2();
		//Login.dropdown3();
		//Login.passengerdetails("chaitu", "9492055182", "", "123456789", "sruthi", "24", "11");
		
	
	}*/
	@DataProvider(name="ApsrtcPOM")
	public Object[][] getusernameandpassword() throws FileNotFoundException, IOException
	{
		Properties props=new Properties();
		props.load(new FileInputStream(new File("ApsrtcPOM.properties")));
		//props.get("ApsrtcPOM.properties");
		String s1=props.getProperty("userName");
		String s2=props.getProperty("password");
		String s3=props.getProperty("From");
		String s4=props.getProperty("To");
		String s5=props.getProperty("txtJourneyDate");
		String s6=props.getProperty("txtReturnJourneyDate");
		String[][] StringArray=new String[1][6];
		//String[][] StringArray1=new String[1][6];
		StringArray[0][0]=s1;
		StringArray[0][1]=s2;
		StringArray[0][2]=s3;
		StringArray[0][3]=s4;
		StringArray[0][4]=s5;
		StringArray[0][5]=s6;
		return StringArray;
		
		
	}
}



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ApsrtcPOM {
WebDriver driver;
public ApsrtcPOM(WebDriver driver)
{
	this.driver=driver;
}
@Test
public void Apsrtc(String username,String password,String From,String To)
{
	driver.findElement(By.linkText("eTicket Login")).click();
	driver.findElement(By.id("userName")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("submitBtn")).click();
	driver.findElement(By.xpath(".//*[@id='fromPlaceName']")).sendKeys(From);
	driver.findElement(By.xpath(".//*[@id='toPlaceName']")).sendKeys(To);
	
	//Select city = new Select(driver.findElement(By.xpath(".//*[@class='modAjxPlaceCs ui-autocomplete-input']")));
	
	//city.selectByVisibleText(text);
	
	WebElement selected=driver.findElement(By.xpath(".//*[@id='fromPlaceName']"));
	//selected.click();
	selected.sendKeys("KHAM");
	driver.findElement(By.linkText("KHAMMAM")).click();
	//Select sel=new Select(driver.findElement(By.id("fromPlaceName")));
	//sel.selectByVisibleText("KHAMMAM");
	//WebElement City=driver.findElement(By.linkText("KHAMMAM"));
	//  Actions action=new Actions(driver);
	//  action.contextClick(City).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			
	
WebElement selected1=driver.findElement(By.xpath(".//*[@id='toPlaceName']"));
//selected.click();
selected1.sendKeys("HYDER");
driver.findElement(By.linkText("HYDERABAD")).click();

	
	
	
	
	//Select select=new Select(selected);
	//select.selectByVisibleText("KHAMMAM");
	//select.selectByIndex(-1);
	//driver.findElement(By.id("fromPlaceName")).sendKeys(From);
	//driver.findElement(By.id("toPlaceName")).sendKeys(To);
	driver.findElement(By.id("txtJourneyDate")).click();
	driver.findElement(By.linkText("24")).click();
	driver.findElement(By.id("txtReturnJourneyDate")).click();
	driver.findElement(By.linkText("29")).click();
	driver.findElement(By.id("searchBtn")).click();
	driver.findElement(By.id("BtFid")).click();
	driver.findElement(By.id("Bustypes201")).click();
	//driver.findElement(By.id("Bustypes200")).click();
	driver.findElement(By.xpath(".//*[@id='filterByDiv']/div/div/div[1]/div[2]/div/span[2]")).click();
	driver.findElement(By.id("BoardingPoint1330")).click();
	//driver.findElement(By.id("searchBtn")).click();
	driver.findElement(By.xpath(".//*[@id='filterByDiv']/div/div/div[1]/div[3]/div/span[2]")).click();
	driver.findElement(By.id("DroppingPoint654")).click();
	//driver.findElement(By.id("DroppingPoint1032")).click();
	driver.findElement(By.id("ddOpen5")).click();
	driver.findElement(By.xpath(".//*[@id='Rate_desc_btn']/label")).click();
	
	driver.findElement(By.id("SrvcSelectBtnForward3")).click();
	WebElement select1=driver.findElement(By.id("ForwardBoardId"));
	Select select=new Select(select1);
	select.selectByVisibleText("KHAMMAM - 09:30");
	WebElement select2=driver.findElement(By.id("ForwardDroppingId"));
	Select select11=new Select(select2);
	select11.selectByVisibleText("DILSUKHNAGAR - 14:00");
	WebElement select3=driver.findElement(By.id("concessionId"));
	Select select21=new Select(select3);
	select21.selectByVisibleText("CAT CARD");
	driver.findElement(By.id("fwLtBtn")).click();
	driver.findElement(By.id("Forward4")).click();
	
}
/*public void dropdown1()
{

	WebElement select1=driver.findElement(By.id("ForwardBoardId"));
	Select select=new Select(select1);
	select.selectByVisibleText("KHAMMAM - 09:30");
}
public void dropdown2()
{
	WebElement select2=driver.findElement(By.id("ForwardDroppingId"));
	Select select=new Select(select2);
	select.selectByVisibleText("DILSUKHNAGAR - 14:00");
}
public void dropdown3()
{
	WebElement select3=driver.findElement(By.id("concessionId"));
	Select select=new Select(select3);
	select.selectByVisibleText("CAT CARD");
	//select.selectByIndex(2);
	driver.findElement(By.id("fwLtBtn")).click();
	driver.findElement(By.id("Forward4")).click();
	
}*/

public void passengerdetails(String name,String number,String email,String cardnumber,String passengername,String age,String seatnumber)
{
	driver.findElement(By.id("bookedByName")).sendKeys(name);
	driver.findElement(By.id("mobileNo")).sendKeys(number);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("cardNumber")).sendKeys(cardnumber);
	WebElement select4=driver.findElement(By.id("genderCodeIdForward0"));
	Select select=new Select(select4);
	select.selectByVisibleText("FEMALE");
	//select.selectByIndex(1);
	driver.findElement(By.id("passengerNameForward0")).clear();
	driver.findElement(By.id("passengerNameForward0")).sendKeys(passengername);
	driver.findElement(By.id("passengerAgeForward0")).sendKeys(age);
	driver.findElement(By.id("seatDetailsForward0")).sendKeys(seatnumber);
	driver.findElement(By.id("BookRetBtn")).click();
	
}
	
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cricinfo {
WebDriver driver;
public Cricinfo(WebDriver driver)
{
	this.driver=driver;
}
public void login()
{
	driver.findElement(By.xpath(".//*[@id='disney_oneid']/span[2]/span")).click();
	driver.findElement(By.xpath(".//*[@id='did-ui']/div/div/section/section/form/section/div[5]/a")).click();
	
}
}

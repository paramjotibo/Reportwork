package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	public WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Contactus=By.linkText("Contact Us");
	By cookies=By.cssSelector("#onetrust-accept-btn-handler");
	
	public WebElement contactuslink()
	{
		return driver.findElement(Contactus);
	}
	
	public WebElement acceptcookies()
	{
		return driver.findElement(cookies);
	}
}

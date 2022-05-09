package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contactpage {

	public WebDriver driver;
	
	public contactpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By firstname=By.cssSelector("div[class='firstName textFieldInput section']>div>input");
	By lastname=By.cssSelector("div[class='lastName textFieldInput section']>div>input");
	By support=By.cssSelector("#support-service_menu_item>button");
	By linksupport=By.cssSelector("#support-service_menu_item");
	By enter=By.xpath("//a[contains(text(),'Log in to create a case, view open cases, and chec')]");
	By helpcenter=By.xpath("(//div[@class='sub-nav']/ul/li/a)[41]");
	
	public WebElement enterfirstname()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement enterlastname()
	{
		return driver.findElement(lastname);
	}
	
	public WebElement supporthover()
	{
		return driver.findElement(support);
	}
	
	public WebElement helpclick()
	{
		return driver.findElement(linksupport);
	}
	
	public WebElement enterkey()
	{
		return driver.findElement(enter);
	}
	
	public WebElement helpcentreclick()
	{
		return driver.findElement(helpcenter);
	}
}

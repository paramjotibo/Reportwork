package Tests;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.Homepage;
import Pageobjects.contactpage;
import resources.browsers;
import resources.childwindows;

public class FirstTest extends browsers {
 public WebDriver driver;
 public Homepage hp;
public contactpage cp;
	
	@Test
	public void home() throws IOException
	{ 
		 driver= callbrowser();
    driver.get("https://www.salesforce.com/ca/?ir=1");
		 hp=new Homepage(driver);
			hp.acceptcookies().click();
			hp.contactuslink().click();
			childwindows ch=new childwindows(driver);
			ch.windowsswitch();
			 cp=new contactpage(driver);
			 cp.enterfirstname().click();
				cp.enterfirstname().sendKeys("param");
	}
	
	
	

	
	
	

}

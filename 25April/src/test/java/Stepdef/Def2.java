package Stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import resources.browsers;
import resources.childwindows;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Pageobjects.Homepage;
import Pageobjects.contactpage;


@RunWith(Cucumber.class)
public class Def2 extends browsers {
public WebDriver driver;
public contactpage cp;

    @Given("^Browser is invoked$")
    public void browser_is_invoked() throws Throwable {
       driver= callbrowser();
       driver.get("https://www.salesforce.com/ca/?ir=1");

    }

    @And("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
    	Homepage hp=new Homepage(driver);
    	hp.acceptcookies().click();
    	    }

    @When("^user clicks on contact us$")
    public void user_clicks_on_contact_us() throws Throwable {
       Homepage hp=new Homepage(driver);
       hp.contactuslink().click();
       }

    @Then("^new window pops up$")
    public void new_window_pops_up() throws Throwable {
       System.out.println(driver.getTitle());
       childwindows cw=new childwindows(driver);
       cw.windowsswitch();
    }

    @And("^user enters the first name$")
    public void user_enters_the_first_name() throws Throwable {
    	  
        String title=  driver.getTitle();
        System.out.println(title);
       cp=new contactpage(driver);
       
       cp.enterfirstname().click();
      cp.enterfirstname().sendKeys("param");

    }

    @And("^user enters the last name$")
    public void user_enters_the_last_name() throws Throwable {
        cp.enterlastname().sendKeys("singh");
        Thread.sleep(5000);
    }
    
    @And("^user hovers on support$")
    public void user_hovers_on_support() throws Throwable {
    	Thread.sleep(3000);
    	Actions am=new Actions(driver);
    	am.moveToElement(cp.helpclick()).build().perform();
    	Thread.sleep(2000);
    	cp.helpcentreclick().click();
       
    }

    @And("^user clicks on helpcentre$")
    public void user_clicks_on_helpcentre() throws Throwable {
    	childwindows cw=new childwindows(driver);
        cw.windowsswitch();
        String home=driver.getTitle();
        System.out.println(home);
       /* System.out.println(home);
        Thread.sleep(2000);
        cp.enterkey().click();*/
      
    }


}
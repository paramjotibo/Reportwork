package resources;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class childwindows {

	public String childwindow;
	public WebDriver driver;
	 public childwindows(WebDriver driver)
	 {
		this.driver=driver;
	 }
	 
	 public WebDriver windowsswitch()
	 {
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		while(it.hasNext())
		{
			
		 childwindow=it.next();
		
}
		return driver.switchTo().window(childwindow);
	 }
}

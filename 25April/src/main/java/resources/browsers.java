package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsers {
	
	public WebDriver driver;
	public Properties prep;
 public WebDriver callbrowser() throws IOException
 {
	 prep=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\15199\\Downloads\\25April\\src\\main\\java\\resources\\config.properties");
	//FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"src\\main\\java\\resources\\config.properties");
	prep.load(fis);
String browsername=prep.getProperty("browser");
if(browsername.equalsIgnoreCase("chrome"))
	if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15199\\Desktop\\latestchrome\\chromedriver.exe");
		 driver=new ChromeDriver();	
	}
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\15199\\Videos\\geckodriver.exe");
		driver=new FirefoxDriver();
	}

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
return driver;
 }
}

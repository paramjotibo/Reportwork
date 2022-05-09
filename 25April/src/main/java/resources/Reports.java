package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
static ExtentReports rop;
	public static ExtentReports reporting()
	{
		String path=System.getProperty("user.dir")+"\\Home\\index.html";
		ExtentSparkReporter rep=new ExtentSparkReporter(path);
		rep.config().setReportName("work");
		rep.config().setDocumentTitle("working");
		
		 rop=new ExtentReports();
		rop.attachReporter(rep);
		rop.setSystemInfo("tester", "yo yo");
		return rop;
	}
}

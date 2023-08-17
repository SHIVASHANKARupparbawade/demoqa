package basetest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class setup {
	protected WebDriver driver;
@BeforeTest
public void basetest()
{
	String browser="chrome";
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		System.out.println("successfully lauch chromebrowser");
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		throw new IllegalArgumentException("Invalid browser name provided");
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
}
//@AfterTest
//public void teardown()
//{
//	driver.close();
//}
}

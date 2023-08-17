package ELEMENTSTEST;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilstest.utilisTest;

public class TEXTBOXTEXT extends utilisTest {
	protected WebDriver driver;
	
public TEXTBOXTEXT(WebDriver driver)
{
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public String landingpage(String url)
{
	  driver.get(url);
	return null;
	
}

@FindBy(id="userName")
public WebElement fullnametext;
@FindBy(id="userEmail")
public WebElement emailtext;
@FindBy(id="currentAddress")
public WebElement currentaddresstext;
@FindBy(id="permanentAddress")
public WebElement paddresstext;

@FindBy(xpath="//div[@class='text-right col-md-2 col-sm-12']")
public WebElement submitbutton;
public boolean issubmitbuttondisplayed()
{
	return submitbutton.isDisplayed();
}
public String enterfullname(String fullname)
{
	fullnametext.clear();
	 fullnametext.sendKeys(fullname);
	return fullname;
	
	
}
public void enteremail(String email)
{
	emailtext.clear();
	emailtext.sendKeys(email);
}
public void entercaddress(String currentaddress)
{
	currentaddresstext.clear();
	currentaddresstext.sendKeys(currentaddress);
}
public void enterpaddress(String paddress)
{
	paddresstext.clear();
	paddresstext.sendKeys(paddress);
}
public void submitbutton()
{
	submitbutton.click();
}


}

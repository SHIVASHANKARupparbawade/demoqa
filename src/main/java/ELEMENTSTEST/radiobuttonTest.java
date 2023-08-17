package ELEMENTSTEST;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class radiobuttonTest {
	WebDriver driver;
	public radiobuttonTest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void landingpage()
{
	driver.get("https://demoqa.com/radio-button");
}
@FindBy(xpath="//input[@type='radio']")
public WebElement radiobutton;
@FindBy(xpath="//input[@type='radio']")
public List<WebElement> sizeradiobutton;
@FindBy(xpath="//label[@for='yesRadio']")
public WebElement yesradiobutton;

@FindBy(xpath="//p[@class='mt-3']")
public WebElement radiobuttontext;


public int sizeofradiobutton()
{
	return sizeradiobutton.size();
}
public void selectyesradiobutton()
{
	yesradiobutton.click();
	
}
public boolean isradiobuttonselected()
{
	return yesradiobutton.isSelected();
}

}

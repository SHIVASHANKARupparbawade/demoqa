package ELEMENTSTEST;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkboxTest {
	WebDriver driver;
	
	public checkboxTest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void landingpage()
	{
		driver.get("https://demoqa.com/checkbox");
	}
	
	@FindBy(xpath="//span[normalize-space()='You have selected :']")
	public WebElement checkboxtext;
	
	@FindBy(xpath="//button[@title='Expand all']")
	public WebElement expandallbutton;
	@FindBy(xpath="//span[contains(text(),'Home')]")
	public WebElement homecheckbox;
	
	@FindBy(xpath="//span[@class='rct-checkbox']")
	public List<WebElement> sizeofcheckbox;
	
   public void clickonexpandbutton()
   {
	   expandallbutton.click();
   }
   public void clickonhomecheckbox()
   {
	   homecheckbox.click();
	  
   }
  
   
    
   
    
}

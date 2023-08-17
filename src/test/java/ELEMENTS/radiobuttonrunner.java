package ELEMENTS;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import ELEMENTSTEST.radiobuttonTest;
import basetest.setup;

public class radiobuttonrunner extends setup {
	
	
	
	
	@Test(priority=1)
	public void countthesize()
	{
		radiobuttonTest radio=new radiobuttonTest(driver);
		radio.landingpage();
		int size= radio.sizeofradiobutton();
		System.out.println(size);
		int expectedsize=3;
		Assert.assertEquals(size, expectedsize);
		
	}
	@Test(priority = 2)
	public void clickonradiobutton() throws InterruptedException
	{
		radiobuttonTest radio=new radiobuttonTest(driver);
		
		radio.selectyesradiobutton();
		
		
		
	}
	@Test(priority = 3)
	public void verifyradiobuttontext()
	{
		radiobuttonTest radio=new radiobuttonTest(driver);
		String actualmessage= radio.radiobuttontext.getText();
		System.out.println(actualmessage);
		Assert.assertEquals(actualmessage,"You have selected Yes");
	}
	

}

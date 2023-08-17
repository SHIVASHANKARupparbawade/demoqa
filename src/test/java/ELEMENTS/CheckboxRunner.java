package ELEMENTS;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ELEMENTSTEST.checkboxTest;
import basetest.setup;

public class CheckboxRunner extends setup {
	checkboxTest checkbox;
	

	
	@Test(priority=1)
	public void homecheckbox() throws InterruptedException
	{
		
		 checkbox=new checkboxTest(driver);
		 checkbox.landingpage();
		checkbox.clickonexpandbutton();
		Thread.sleep(3000);
		checkbox.clickonhomecheckbox();
		
		}
	@Test(priority=2)
	public void verifycheckboxtext()
	{
		checkbox=new checkboxTest(driver);
	String validationmessage= checkbox.checkboxtext.getText();
	System.out.println(validationmessage);
	Assert.assertTrue(validationmessage.contains("You have selected :"));
		
	}
	@Test(priority = 3)
	public void countTheSizeOfCheckbox()
	{
		checkbox=new checkboxTest(driver);
		int actualsizeofcheckbox= checkbox.sizeofcheckbox.size();
		System.out.println(actualsizeofcheckbox);
		int expectedcountsize=17;
		Assert.assertEquals(actualsizeofcheckbox, expectedcountsize);
	}
//	@Test(priority = 4)
//	public void CheckboxDeselection() throws InterruptedException
//	{
//		checkbox=new checkboxTest(driver);
//		checkbox.clickonexpandbutton();
//		Thread.sleep(3000);
//		checkbox.clickonhomecheckbox();
//		if(checkbox.homecheckbox.isSelected())
//		{
//			checkbox.homecheckbox.click();
//		}
//		
//		
//	}

}

package ELEMENTS;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ELEMENTSTEST.TEXTBOXTEXT;
import basetest.setup;
import utilstest.utilisTest;

public class TEXTBOX extends setup {
	
	TEXTBOXTEXT textbox;
	
	
	
	
	@Test(priority = 1)
	public void landingpage()
	{
		textbox=new TEXTBOXTEXT(driver);
		textbox.landingpage("https://demoqa.com/text-box");
		
		
	}
	

	@SuppressWarnings("static-access")
	@DataProvider(name= "exceldata")
	public Object[][] getdatafromexcel() throws IOException
	{
		utilisTest util=new utilisTest(driver);
		String path="C:\\Users\\shivs\\Downloads\\demoqasheet.xlsx";
		String sheetname="Sheet1";
		return util.getdata(path, sheetname);
	}
	
	
	@Test(dataProvider= "exceldata"    ,  priority =   2,description= "user enter the all the textfields")
	public void textboxtest(String fullname,String email, String currentaddress, String paddress) throws InterruptedException
	{
		textbox=new TEXTBOXTEXT(driver);
		  textbox.enterfullname(fullname);
		Thread.sleep(3000);
		
		
		textbox.enteremail(email);
	    Thread.sleep(3000);
	    textbox.entercaddress(currentaddress);
	    Thread.sleep(3000);
	    textbox.enterpaddress(paddress);
		Thread.sleep(3000);
		textbox.scrollby();
		textbox.submitbutton();
	}
	@Test(priority = 3,description="user check submit button is displayed or not")
	public void submitbuttonisdisplayedornot()
	{
		 textbox=new TEXTBOXTEXT(driver);
		 textbox.scrollby();
		 
		boolean submitbutton=  textbox.issubmitbuttondisplayed();
		Assert.assertTrue(submitbutton);
		
	}
	

}

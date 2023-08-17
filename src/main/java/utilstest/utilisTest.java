package utilstest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class utilisTest {
	WebDriver driver;
	static DataFormatter formatter=new DataFormatter();
	
	public utilisTest(WebDriver driver) {
		this.driver=driver;
		
	}

	public void scrollby()
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	     jsExecutor.executeScript("window.scrollBy(0, 500)");
	}
	@SuppressWarnings("resource")
	@DataProvider(name= "exceldata")
	public static Object[][] getdata(String filepah,String sheetname) throws IOException
	{
		FileInputStream file=new FileInputStream(filepah);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//get the sheetname
		XSSFSheet excelsheet= workbook.getSheet(sheetname);
		//get the physical no of rows in sheet
		int rowcount = excelsheet.getPhysicalNumberOfRows();
		XSSFRow rowsheet= excelsheet.getRow(0);
		int cellcount= rowsheet.getLastCellNum();
		Object[][] data=new Object[rowcount-1][cellcount];
		for(int i=0;i<rowcount-1;i++)
		{
			XSSFRow row= excelsheet.getRow(i+1);
			for(int j=0;j<cellcount;j++)
			{
				XSSFCell cell= row.getCell(j);
				data[i][j]=formatter.formatCellValue(cell);
			}
		}
		return data;

	
}
}

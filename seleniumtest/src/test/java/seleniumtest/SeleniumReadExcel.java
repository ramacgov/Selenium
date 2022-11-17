package seleniumtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SeleniumReadExcel {

	@Test
	public void readexcel() throws IOException
	{
		String filepath ="C:\\Users\\7J4333897\\git\\Selenium\\seleniumtest\\TestData\\TestData.xlsx";
		String filename ="TestData";
		String Sheetname= "Test";
		
		
		File file = new File(filepath);		
		try {
			FileInputStream inputStream = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(inputStream);
			//Read sheet inside the workbook by its name
			Sheet Sheetobj = wb.getSheet(Sheetname);
			//Find number of rows in excel file

		    int rowCount = Sheetobj.getLastRowNum()-Sheetobj.getFirstRowNum();
		  //Create a loop over all the rows of excel file to read it
		    System.out.println(rowCount);
		    
		    for (int i = 0; i < rowCount+1; i++) {

		        Row row = Sheetobj.getRow(i);

		   	        for (int j = 0; j < row.getLastCellNum(); j++) {

		            //Print Excel data in console

		            System.out.print(row.getCell(j).getStringCellValue()+"||");

		        }
		   	     System.out.println();
		    }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an object of ReadGuru99ExcelFile class

	}

}

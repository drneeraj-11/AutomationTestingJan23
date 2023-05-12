package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
	static  XSSFWorkbook workbook;

	public static String[][] testData()
	{ 
		
		
//1 Need to read Excel file
		try
		{
		FileInputStream file = new FileInputStream("E:\\ContactDta.xlsx");
		 workbook = new XSSFWorkbook(file);
		
		 //2 Need to move into sheet
		 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet("ContactData");
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		int column= sheet.getRow(0).getLastCellNum();
		System.out.println(column);
		
		String data[][]=new String [rows][column];
		
		for(int i=0;i<rows;i++)//outer for loop will handle rows
		{
			for (int j=0;j<column;j++)//inner for loop will handle column
			{
				 data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				System.out.print(data+"   ");
			}
			System.out.println();
		}
		return data;
		
	}

}

package ExcelHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI_Write {
		
	public static void excelwrite() throws IOException
	{
		File f = new File("../DeeptiUSA/Sample2.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		XSSFWorkbook xw = new XSSFWorkbook();
		XSSFSheet xs = xw.createSheet("Deepti");
		int r = xs.getPhysicalNumberOfRows();
		
	
		for(int i=0; i<3; i++)    //Loop for rows
		{
			XSSFRow xr = xs.createRow(i);
			int c = xr.getPhysicalNumberOfCells();
			
			for(int j=0; j<3; j++)   //Loop for columns
			{
				XSSFCell cl = xr.createCell(j);
				cl.setCellValue("Deepti");
				System.out.println(cl.getStringCellValue());
				
				
			}
		}
		xw.write(fo);// It will move data to output stream
		fo.flush(); // It will move data to the file
		fo.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		POI_Write.excelwrite();
		
		
		
		
		
	
		
	}

}

package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poiReadDataBasedUponRowNum {
	
	public static void readbasedonRowNum(int rowNum) throws IOException
	{
		File f = new File("../DeeptiUSA/Sample.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet xs = wb.getSheetAt(0);
		int r = xs.getPhysicalNumberOfRows();
		
		
			for(int i=0;i<r;i++)
		{			
			XSSFRow xr = xs.getRow(i);
			int c = xr.getPhysicalNumberOfCells();
			if(i==rowNum)
			{
			for(int j=0;j<c;j++)
			{
				XSSFCell cl = xr.getCell(j);
				System.out.println(cl.getStringCellValue());
			}
		
		}
		
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 poiReadDataBasedUponRowNum.readbasedonRowNum(3);
	
	
	}

}

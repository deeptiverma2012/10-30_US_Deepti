package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poiReadBasedUponRange {
	
	public static void readbasedonRowNum(int initialRow, int endRow) throws IOException
	{
		File f = new File("../DeeptiUSA/Sample.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet xs = wb.getSheetAt(0);
		int r = xs.getPhysicalNumberOfRows();
		
		
			for(int i=initialRow;i<=endRow;i++)
		{			
			XSSFRow xr = xs.getRow(i);
			int c = xr.getPhysicalNumberOfCells();
			
			for(int j=0;j<c;j++)
			{
				XSSFCell cl = xr.getCell(j);
				System.out.println(cl.getStringCellValue());
			}
		
		}
		
		}
		
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		poiReadBasedUponRange.readbasedonRowNum(1, 3);

	
	
	}

}

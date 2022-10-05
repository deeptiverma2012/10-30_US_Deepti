package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poiReadRowAndCol {
	
	public static void ReadDataBasedUponRowAndCol(int rowNum, int colNum) throws IOException
	{
		File f = new File("../DeeptiUSA/Sample.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheetAt(0);
        
		int r = sh.getPhysicalNumberOfRows();
		r=rowNum;
		for(int i=0; i<r;i++)
		{ 	
			XSSFRow xr = sh.getRow(i);
			int c = xr.getPhysicalNumberOfCells();	
			c=colNum;
			for(int j=0; j<c; j++)
			{
				XSSFCell cl = xr.getCell(j);
				System.out.println(cl.getStringCellValue());
				}
			}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		poiReadRowAndCol.ReadDataBasedUponRowAndCol(2, 3);
		}
	}



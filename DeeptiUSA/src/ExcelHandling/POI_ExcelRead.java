package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI_ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("../DeeptiUSA/Sample.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook xw = new XSSFWorkbook(fi);
		XSSFSheet xs = xw.getSheetAt(0);
		
		int r = xs.getPhysicalNumberOfRows(); 
		
		for(int i=0;i<r;i++)// Loop for rows
		{
			XSSFRow xr = xs.getRow(i);
			int c = xr.getPhysicalNumberOfCells(); // For count of cells
			
			for(int j=0;j<c;j++)
			{
				XSSFCell xc = xr.getCell(j);
				System.out.println(xc.getStringCellValue());
			}
					
		}
		
		
		
	}

}

package ExcelHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poiWriteInTheRow {
	
	
	public static void WriteInRow(int rowCount, int colCount) throws InvalidFormatException, IOException
	{
		File f = new File("../DeeptiUSA/Sample4.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		XSSFWorkbook wk = new XSSFWorkbook();
		XSSFSheet ws = wk.createSheet("Dee");
		int r = ws.getPhysicalNumberOfRows();
		
		
		
		for(int i=0; i<=rowCount; i++)
		{
			XSSFRow xr = ws.createRow(i);
			int c = xr.getPhysicalNumberOfCells();

			
			for(int j=0; j<=colCount;j++)
			{
				XSSFCell cl = xr.createCell(j);
				cl.setCellValue("Deepti");
				System.out.println(cl.getStringCellValue());
			}
		}
		wk.write(fo);
		fo.flush();
		fo.close();
		
	}

	


	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		// TODO Auto-generated method stub

		poiWriteInTheRow.WriteInRow(2,3);

}
}
